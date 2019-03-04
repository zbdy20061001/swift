/**********************************************************************
 *
 * Copyright (C) SWIFT 2009. 
 * 
 * Licensed under the License Terms for Working Samples for use 
 * with the Standards Developer Kit, available at 
 * 
 *     mt_xml_converter-src.zip/LICENSE
 *
 *********************************************************************/
package com.swift.converter.xml;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.swift.converter.mt.CreateInfoProcessor;

/**
 * The SchemaDoc class is used to wrap XML Schema document with information needed during the conversion process. Once a SchemaDoc
 * instance is created, the XML schema document is processed and analysed.
 * <P>
 * A SchemaDoc needs to be created once for each XML schema and can from then on be used to process messages sequentially. A
 * SchemaDoc instance should not be used concurrently.
 * 
 * @author SWIFT
 */
public class SchemaDoc {
	/** Regular expression for parsing the name spaces of the MT XML schema. */
	private static final Pattern NAMESPACE_REGEX = Pattern.compile("(.*:(\\$?))(.*)\\.([0-9]{4})");

	/**
	 * The {@link #NAMESPACE_REGEX} defines a number of groups where the NAMESPACE_REGEX_GROUP_PREFIX is the index of the group
	 * containing the message prefix.
	 */
	private static final int NAMESPACE_REGEX_GROUP_PREFIX = 1;
	/**
	 * The {@link #NAMESPACE_REGEX} defines a number of groups where the NAMESPACE_REGEX_GROUP_OLD is the index of the group
	 * containing the '$' sign, defining old schema's.
	 */
	private static final int NAMESPACE_REGEX_GROUP_OLD = 2;
	/**
	 * The {@link #NAMESPACE_REGEX} defines a number of groups where the NAMESPACE_REGEX_GROUP_TYPE is the index of the group
	 * containing the message type.
	 */
	private static final int NAMESPACE_REGEX_GROUP_TYPE = 3;
	/**
	 * The {@link #NAMESPACE_REGEX} defines a number of groups where the NAMESPACE_REGEX_GROUP_TYPE is the index of the group
	 * containing the message standards version.
	 */
	private static final int NAMESPACE_REGEX_GROUP_EDITION = 4;

	/** standards prefix */
	private String mStandardsPrefix;
	/** old schema format used by SWIFTAlliance Messenger */
	private boolean mIsOldFormat;
	/** message type name */
	private String mMessageTypeName;
	/** standards edition */
	private String mStandardsEdition;

	/** current XML schema */
	private final Document mXmlSchema;

	/** current SchemaDoc resolver */
	private final ISchemaDocResolver mSchemaDocResolver;

	/** map that holds all type elements */
	private final Map mTypes /* < String, SchemaElement > */= new HashMap();

	/** map that holds all root elements */
	private final Map mRootElements /* < String, SchemaElement > */= new HashMap();

	/** target name space */
	private String mTargetNamespace;

	/** namespace prefix to namespace URI mapping */
	private final Map mPrefix2NamespaceURI /* < String, String > */= new HashMap();

	/** namespace URI to namespace prefix mapping */
	private final Map mNamespaceURI2Prefix /* < String, String > */= new HashMap();

	/** information gathered about element tags */
	private final Map mElement2SchemaElement /* <Element, SchemaElement> */= new HashMap();

	/**
	 * Creates a new SchemaDoc.
	 * 
	 * @param pMessageTypeName
	 *            the message type name
	 * @param pXmlSchema
	 *            the XML schema
	 * @param pSchemaDocResolver
	 *            a SchemaDoc resolver
	 */
	public SchemaDoc(String pMessageTypeName, Document pXmlSchema, ISchemaDocResolver pSchemaDocResolver) {
		if (pSchemaDocResolver == null) {
			throw new IllegalArgumentException("Must specify a SchemaDoc resolver");
		}
		mMessageTypeName = pMessageTypeName;
		mXmlSchema = pXmlSchema;
		mSchemaDocResolver = pSchemaDocResolver;

		preProcess();
	}

	/**
	 * Creates a new SchemaDoc.
	 * 
	 * @param pXmlSchema
	 *            the XML schema
	 * @param pSchemaDocResolver
	 *            a SchemaDoc resolver
	 */
	public SchemaDoc(Document pXmlSchema, ISchemaDocResolver pSchemaDocResolver) {
		this(null, pXmlSchema, pSchemaDocResolver);
	}

	/**
	 * Creates a new SchemaDoc.
	 * 
	 * @param pMessageTypeName
	 *            the message type name
	 * @param pXmlSchema
	 *            the XML schema
	 */
	public SchemaDoc(String pMessageTypeName, Document pXmlSchema) {
		this(pMessageTypeName, pXmlSchema, new ISchemaDocResolver() {
			public SchemaDoc resolveSchemaDoc(String pNamespaceURI) {
				return null;
			}
		});
	}

	/**
	 * Creates a new SchemaDoc.
	 * 
	 * @param pXmlSchema
	 *            the XML schema
	 */
	public SchemaDoc(Document pXmlSchema) {
		this(null, pXmlSchema);
	}

	/**
	 * Process the XML schema by filling the types map with all type elements.
	 */
	private void preProcess() {
		final Element schema = mXmlSchema.getDocumentElement();
		final SchemaElement element = preProcessElements(schema);

		if (schema != null) {
			mTargetNamespace = schema.getAttribute("targetNamespace");
			final NamedNodeMap attributes = schema.getAttributes();
			for (int i = 0; i < attributes.getLength(); i++) {
				final Node attribute = attributes.item(i);
				final String prefix = attribute.getLocalName();
				// Keep track of all namespace URI declarations
				if (!SchemaConstants.XMLNS_ATTRIBUTE.equals(prefix)
						&& SchemaConstants.XMLNS_ATTRIBUTE_NS_URI.equals(attribute.getNamespaceURI())) {
					final String namespaceURI = attribute.getNodeValue();
					mPrefix2NamespaceURI.put(prefix, namespaceURI);
					mNamespaceURI2Prefix.put(namespaceURI, prefix);
				}
			}

			final Iterator iterator = element.getChildren().iterator();
			while (iterator.hasNext()) {
				final SchemaElement childNode = (SchemaElement) iterator.next();
				// Keep track of all type and root elements
				if (childNode.getLocalName().equals("complexType") || childNode.getLocalName().equals("simpleType")) {
					final String name = childNode.getNameAttribute();
					mTypes.put(name, childNode);
				} else if (childNode.getLocalName().equals("element")) {
					final String name = childNode.getNameAttribute();
					mRootElements.put(name, childNode);
				}
			}
		}

		final Matcher m = NAMESPACE_REGEX.matcher(mTargetNamespace);
		if (m.matches()) {
			mStandardsPrefix = m.group(NAMESPACE_REGEX_GROUP_PREFIX);
			mIsOldFormat = "$".equals(m.group(NAMESPACE_REGEX_GROUP_OLD));
			mMessageTypeName = m.group(NAMESPACE_REGEX_GROUP_TYPE);
			mStandardsEdition = m.group(NAMESPACE_REGEX_GROUP_EDITION);
		}
	}

	/**
	 * Pre-Process all the xs:element nodes
	 * 
	 * @param pNode
	 *            the node
	 * @return the root element info
	 */
	private SchemaElement preProcessElements(Node pNode) {
		SchemaElement element = null;

		if (pNode.getNodeType() == Node.ELEMENT_NODE) {
			element = new SchemaElement(this, (Element) pNode);
			mElement2SchemaElement.put(pNode, element);
		}

		for (Node childNode = pNode.getFirstChild(); childNode != null; childNode = childNode.getNextSibling()) {
			preProcessElements(childNode);
		}

		return element;
	}

	/**
	 * Is the XML schema using the old format up to 2008.
	 * 
	 * @return true if the current schema document is of the old format used by SWIFTAlliance Messenger up to 2008.
	 */
	public boolean isOldFormatUpTo2008() {
		return mIsOldFormat && mStandardsEdition != null && Integer.parseInt(mStandardsEdition) <= 805;
	}

	public String getStandardsPrefix() {
		return mStandardsPrefix;
	}

	/**
	 * Get the message type name.
	 * 
	 * @return the message type name of the current schema document. <br>
	 *         e.g. fin.102, fin.103.REMIT, apc.022
	 */
	public String getMessageTypeName() {
		return mMessageTypeName;
	}

	public String getStandardsEdition() {
		return mStandardsEdition;
	}

	/**
	 * Does the XML schema correspond to a system message.
	 * 
	 * @return true if the current schema document is a system message. <br>
	 *         e.g. fin.0xx, apc.0xx
	 */
	/* package private */boolean isSystemMessage() {
		return (mMessageTypeName != null) && (mMessageTypeName.charAt(mMessageTypeName.length() - 3) == '0');
	}

	/**
	 * Get the XML schema document.
	 * 
	 * @return the current XML schema document.
	 */
	public Document getDocument() {
		return mXmlSchema;
	}

	/**
	 * Maps and resolve a namespace URI to a Schema document.
	 * 
	 * @param pNamespaceURI
	 *            the namespace URI
	 * @return the Schema document or null for the XML Schema Namespace URI
	 * 
	 * @throws SchemaException
	 *             ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI}) when the namespaceURI was not resolved
	 */
	public SchemaDoc getSchemaDoc(String pNamespaceURI) throws SchemaException {
		// The XML Schema Namespace URI has no SchemaDoc
		if (SchemaConstants.W3C_XML_SCHEMA_NS_URI.equals(pNamespaceURI)) {
			return null;
		}
		final SchemaDoc schemaDoc = mSchemaDocResolver.resolveSchemaDoc(pNamespaceURI);
		if (schemaDoc == null) {
			throw new SchemaException(SchemaException.SYNTAX_UNRESOLVED_NAMESPACE_URI, new Object[] { pNamespaceURI }, null);
		}
		final CreateInfoProcessor processor = new CreateInfoProcessor(schemaDoc);
		processor.processRootElements();
		return schemaDoc;
	}

	/**
	 * Maps and resolve a namespace prefix to a Schema document.
	 * 
	 * @param pPrefix
	 *            the namespace prefix
	 * @return the Schema document or null for the XML Schema Namespace URI prefix
	 * 
	 * @throws SchemaException
	 *             ({@link SchemaException.SYNTAX_UNDEFINED_NAMESPACE_PREFIX}) when the namespace prefix was not found
	 * @throws SchemaException
	 *             ({@link SchemaException.SYNTAX_UNRESOLVED_NAMESPACE_URI}) when the namespaceURI was not resolved
	 */
	private SchemaDoc getSchemaDocFromPrefix(String pPrefix) throws SchemaException {
		if (!mPrefix2NamespaceURI.containsKey(pPrefix)) {
			throw new SchemaException(SchemaException.SYNTAX_UNDEFINED_NAMESPACE_PREFIX, new Object[] { pPrefix }, null);
		}
		final String namespaceURI = (String) mPrefix2NamespaceURI.get(pPrefix);
		return getSchemaDoc(namespaceURI);
	}

	/**
	 * Get the namespace prefix for a namespace URI.
	 * 
	 * @param pNamespaceURI
	 *            the namespace URI
	 * @return the namespace prefix
	 */
	public String getPrefix(String pNamespaceURI) {
		return (String) mNamespaceURI2Prefix.get(pNamespaceURI);
	}

	/**
	 * Set the namespace prefix declarations on the speficied Element.
	 * 
	 * @param pMessageElement
	 *            the message element on which the namespace prefix declarations will be set
	 */
	public void setNamespaceDeclarations(Element pMessageElement) {
		for (Iterator i = mPrefix2NamespaceURI.keySet().iterator(); i.hasNext();) {
			final String prefix = (String) i.next();

			pMessageElement.setAttributeNS(SchemaConstants.XMLNS_ATTRIBUTE_NS_URI, SchemaConstants.XMLNS_ATTRIBUTE + ":" + prefix,
					(String) mPrefix2NamespaceURI.get(prefix));
		}
	}

	/**
	 * Get the element corresponding to the specified type name
	 * 
	 * @param pTypeName
	 *            the type name or null for a XML Schema Namespace URI type
	 * @return the type element
	 * @throws SchemaException
	 *             ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX}) when the namespace prefix was not found
	 * @throws SchemaException
	 *             ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI}) when the namespaceURI was not resolved
	 */
	public SchemaElement getTypeElement(String pTypeName) throws SchemaException {
		if (pTypeName == null) {
			return null;
		}
		final int separatorIndex = pTypeName.indexOf(':');
		if (separatorIndex == -1) {
			return (SchemaElement) mTypes.get(pTypeName);
		}
		final String prefix = pTypeName.substring(0, separatorIndex);
		final String typeName = pTypeName.substring(separatorIndex + 1);
		final SchemaDoc schemaDoc = getSchemaDocFromPrefix(prefix);
		if (schemaDoc == null) {
			return null;
		}
		return schemaDoc.getTypeElement(typeName);
	}

	/**
	 * Get the element corresponding to the specified root element
	 * 
	 * @param pElementName
	 *            the element name
	 * @return the element
	 * @throws SchemaException
	 *             ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX}) when the namespace prefix was not found
	 * @throws SchemaException
	 *             ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI}) when the namespaceURI was not resolved
	 */
	public SchemaElement getRootElement(String pElementName) throws SchemaException {
		if (pElementName == null) {
			return null;
		}
		final int separatorIndex = pElementName.indexOf(':');
		if (separatorIndex == -1) {
			return (SchemaElement) mRootElements.get(pElementName);
		} else {
			final String prefix = pElementName.substring(0, separatorIndex);
			final String typeName = pElementName.substring(separatorIndex + 1);
			final SchemaDoc schemaDoc = getSchemaDocFromPrefix(prefix);
			return schemaDoc.getRootElement(typeName);
		}
	}

	/**
	 * Get the target name space of the XML schema document.
	 * 
	 * @return the target name space of the current XML schema document
	 */
	public String getTargetNamespace() {
		return mTargetNamespace;
	}

	/**
	 * Get information on the specified element
	 * 
	 * @param pSchemaElement
	 *            the schema element
	 * @return the element info
	 */
	public SchemaElement getSchemaElement(Element pSchemaElement) {
		return ((SchemaElement) mElement2SchemaElement.get(pSchemaElement));
	}
}
