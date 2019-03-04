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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * The schema element wraps a DOM element present in the schema. This class is
 * introduced to reduce the performance bottleneck found while accessing the
 * schema DOM structure.
 */
public final class SchemaElement {
	private final static Pattern FIELD_REGEXP_PATTERN = Pattern.compile(SchemaConstants.FIELD_REGEXP);

	private final SchemaDoc mSchemaDoc;
	private final Element mElement;

	private String mLocalName;
	private Cache mTargetNamespace;
	private Cache /* <SchemaElement> */ mParent;
	private Cache /* <String> */ mNameAttribute;
	private Cache /* <String> */ mTypeAttribute;
	private Cache /* <String> */ mBaseAttribute;
	private Cache /* <String> */ mValueAttribute;
	private Cache /* <String> */ mRefAttribute;
	private Cache /* <SchemaElement> */ mType;
	private Cache /* <SchemaElement> */ mBase;
	private Cache /* <> */ mAppInfo;
	private Integer mMinOccurs;
	private Integer mMaxOccurs;
	private Map mProperties;
	private List /* <SchemaElement> */ mChildren;
	private Integer mBaseType;
	private Cache /* <String> */ mPattern;
	private Cache /* <String> */ mMinInclusive;
	private Cache /* <String> */ mMaxInclusive;
	private Cache /* <String> */ mMinExclusive;
	private Cache /* <String> */ mMaxExclusive;
	private Integer mMinLength;
	private Integer mMaxLength;
	private Cache /* <String[]> */ mEnumerations;
	private Cache /* <String> */ mFieldTagName;

	/**
	 * Create a new Schema element
	 * 
	 * @param pSchemaDoc
	 *            the Schema document
	 * @param pElement
	 *            the element
	 */
	SchemaElement(SchemaDoc pSchemaDoc, Element pElement) {
		mSchemaDoc = pSchemaDoc;
		mElement = pElement;
	}

	/**
	 * Returns the Schema document of this SchemaElement.
	 * 
	 * @return the Schema document
	 */
	public SchemaDoc getSchemaDoc() {
		return mSchemaDoc;
	}
	
	/**
	 * Get the element from which this SchemaElement gets its information
	 * 
	 * @return the element
	 */
	public Element getElement() {
		return mElement;
	}

	/**
	 * Get the local name of the element
	 * 
	 * @return the local name
	 */
	public String getLocalName() {
		if (mLocalName == null) {
			mLocalName = mElement.getLocalName();
		}
		return mLocalName;
	}

	/**
	 * Get the parent element
	 * 
	 * @return the parent element
	 */
	public SchemaElement getParent() {
		if (mParent == null) {
			mParent = new Cache() {
				protected Object retrieve() {
					final Node parentNode = mElement.getParentNode();
					if (parentNode.getNodeType() == Node.ELEMENT_NODE) {
						return mSchemaDoc.getSchemaElement((Element) mElement.getParentNode());
					} else {
						return null;
					}
				}
			};
		}
		return (SchemaElement) mParent.get();
	}

	/**
	 * Get the value of the name attribute on the element
	 * 
	 * @return the value of the name attribute on the element
	 */
	public String getNameAttribute() {
		if (mNameAttribute == null) {
			mNameAttribute = new Cache() {
				protected Object retrieve() {
					return getAttribute(mElement, "name");
				}
			};
		}
		return (String) mNameAttribute.get();
	}

	/**
	 * Get the value of the type attribute on the element
	 * 
	 * @return the value of the type attribute on the element
	 */
	private String getTypeAttribute() {
		if (mTypeAttribute == null) {
			mTypeAttribute = new Cache() {
				protected Object retrieve() {
					return getAttribute(mElement, "type");
				}
			};
		}
		return (String) mTypeAttribute.get();
	}

	/**
	 * Get the target namespace of this schema element.
	 * 
	 * @return the target namespace of this schema element
	 */
	private String getTargetNamespace() {
		if (mTargetNamespace == null) {
			mTargetNamespace = new Cache() {
				protected Object retrieve() {
					// No support for parent namespace declarations!
					return mSchemaDoc.getTargetNamespace();
				}
			};
		}
		return (String) mTargetNamespace.get();
	}
	
	/**
	 * Returns the local part of the type attribute of this schema element.
	 * 
	 * @return the local part of the type attribute of this schema element
	 */
	public String getTypeLocalName() {
		String type = getTypeAttribute();
		if(type != null) {
			final int separatorIndex = type.indexOf(':');
			type = type.substring(separatorIndex+1);
		}
		return type;
	}

	/**
	 * Creates a new element defined by this schema element for the given
	 * message document.<br>
	 * The namespace URI of the new element is set to the target namespace of
	 * this schema element and the prefix is set if found in the namespace
	 * prefix declarations of the specified schema document
	 * 
	 * @param pMessageDoc
	 *            the document for which the element is created
	 * @param pSchemaDoc
	 *            the schema document that holds the namespace prefix
	 *            declarations that will be used to determine the prefix for the
	 *            target namespace of the created element
	 * @return A new Element object
	 */
	public Element createElementNS(Document pMessageDoc, SchemaDoc pSchemaDoc) {
		final String prefix = pSchemaDoc.getPrefix(getTargetNamespace());
		if(prefix == null) {
			return pMessageDoc.createElementNS(getTargetNamespace(), getNameAttribute());
		} else {
			return pMessageDoc.createElementNS(getTargetNamespace(), prefix + ":" + getNameAttribute());
		}
	}
	
	/**
	 * Return the type element corresponding to the name in the type attribute
	 * 
	 * @return the type element info
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 */
	public SchemaElement getType() throws SchemaException {
		if (mType == null) {
			final SchemaElement schemaElement = mSchemaDoc.getTypeElement(getTypeAttribute());
			mType = new Cache() {
				protected Object retrieve() {
					return schemaElement;
				}
			};
		}

		return (SchemaElement) mType.get();
	}

	
	/**
	 * Get the value of the base attribute on the element
	 * 
	 * @return the value of the base attribute on the element
	 */
	public String getBaseAttribute() {
		if (mBaseAttribute == null) {
			mBaseAttribute = new Cache() {
				protected Object retrieve() {
					return getAttribute(mElement, "base");
				}
			};
		}
		return (String) mBaseAttribute.get();
	}

	/**
	 * Return the type element corresponding to the name in the base attribute
	 * 
	 * @return the type element info
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 */
	private SchemaElement getBase() throws SchemaException {
		if (mBase == null) {
			final SchemaElement schemaElement = mSchemaDoc.getTypeElement(getBaseAttribute());
			mBase = new Cache() {
				protected Object retrieve() {
					return schemaElement;
				}
			};
		}

		return (SchemaElement) mBase.get();
	}

	/**
	 * Get the value of the value attribute on the element
	 * 
	 * @return the value of the value attribute on the element
	 */
	public String getValueAttribute() {
		if (mValueAttribute == null) {
			mValueAttribute = new Cache() {
				protected Object retrieve() {
					return getAttribute(mElement, "value");
				}
			};
		}
		return (String) mValueAttribute.get();
	}

	/**
	 * Get the value of the ref attribute on the element
	 * 
	 * @return the value of the ref attribute on the element
	 */
	public String getRefAttribute() {
		if (mRefAttribute == null) {
			mRefAttribute = new Cache() {
				protected Object retrieve() {
					return getAttribute(mElement, "ref");
				}
			};
		}
		return (String) mRefAttribute.get();
	}
	
	/**
	 * Get the minimal number of occurrences allowed for the element
	 * 
	 * @return the minimal number of occurrences
	 */
	public int getMinOccurs() {
		if (mMinOccurs == null) {
			mMinOccurs = new Integer(getMinOccurs0());
		}
		return mMinOccurs.intValue();
	}

	/**
	 * Get the minimal number of occurrences the element must appear in the
	 * message. This minimal number of occurrences is determined by analysing
	 * the 'minOccurs' and 'use' attributes of the element. If neither of the
	 * attributes exists, the value of 1 is returned.
	 * 
	 * @return the minimal number of occurrences the element must appear in the
	 *         message.
	 */
	private int getMinOccurs0() {
		try {
			final String minOccurs = getAttribute(mElement, "minOccurs");
			// Do not generate a NumberFormatException exception when the
			// attribute does not exist
			if (minOccurs == null) {
				final String use = getAttribute(mElement, "use");
				if (use != null) {
					if ("required".equals(use)) {
						return 1;
					} else {
						return 0;
					}
				}

				return 1;
			} else {
				return Integer.parseInt(minOccurs);
			}
		} catch (final NumberFormatException e) {
			return 1;
		}
	}

	/**
	 * Get the maximal number of occurrences allowed for the element
	 * 
	 * @return the maximal number of occurrences
	 */
	public int getMaxOccurs() {
		if (mMaxOccurs == null) {
			mMaxOccurs = new Integer(getMaxOccurs0());
		}
		return mMaxOccurs.intValue();
	}

	/**
	 * Get the maximal number of occurrences the element can appear in the
	 * message. This maximal number of occurrences is determined by analysing
	 * the 'maxOccurs' and 'use' attributes of the element. If neither of the
	 * attributes exists, the value of 1 is returned. Unbounded number of
	 * occurrences is returned as {@link Integer#MAX_VALUE}.
	 * 
	 * @return the maximal number of occurrences the element can appear in the
	 *         message.
	 */
	private int getMaxOccurs0() {
		try {
			final String maxOccurs = getAttribute(mElement, "maxOccurs");
			// Do not generate a NumberFormatException exception when the
			// attribute does not exist
			if (maxOccurs == null) {
				final String use = getAttribute(mElement, "use");
				if (use != null) {
					if ("prohibited".equals(use)) {
						return 0;
					}
				}

				return 1;
			} else if (maxOccurs.equals("unbounded")) {
				return Integer.MAX_VALUE;
			} else {
				return Integer.parseInt(maxOccurs);
			}
		} catch (final NumberFormatException e) {
			return 1;
		}
	}

	/**
	 * Get an attribute with the specified name
	 * 
	 * @param pElement
	 *            the attribute
	 * @param pName
	 *            the name
	 * @return the value, or null if not found
	 */
	private String getAttribute(Element pElement, String pName) {
		final String value = pElement.getAttribute(pName);
		if (value == null || value.length() == 0) {
			return null;
		}
		return value;
	}

	/**
	 * Get a property
	 * 
	 * @param pKey
	 *            the key
	 * @return the value
	 */
	public Object getProperty(String pKey) {
		if (mProperties != null) {
			return mProperties.get(pKey);
		}
		return null;
	}

	/**
	 * Set a property
	 * 
	 * @param pKey
	 *            the key
	 * @param pValue
	 *            the value
	 */
	public void setProperty(String pKey, Object pValue) {
		if (mProperties == null) {
			mProperties = new HashMap();
		}
		mProperties.put(pKey, pValue);
	}

	/**
	 * Get the specified key from the application information
	 * 
	 * @param pKey
	 *            the key
	 * @return the information
	 */
	public String getAppInfo(String pKey) {
		if (mAppInfo == null) {
			mAppInfo = new Cache() {
				protected Object retrieve() {
					final SchemaElement annotationNode = getChildByLocalName("annotation");
					if (annotationNode != null) {
						parseAppInfo(annotationNode, null);
					}
					return mProperties;
				}

				private void parseAppInfo(SchemaElement pElement, String pPrefix) {
					final String localname = pElement.getLocalName();
					final String value = pElement.getValueAttribute();
					if (value != null && value.length() != 0) {
						setProperty(pPrefix + "." + localname, value);
					} else {
						if (pPrefix == null) {
							pPrefix = localname;
						} else {
							pPrefix = pPrefix + "." + localname;
						}

						final Iterator iterator = pElement.getChildren().iterator();
						while (iterator.hasNext()) {
							parseAppInfo((SchemaElement) iterator.next(), pPrefix);
						}
					}
				}
			};
		}

		// the cache object is used to populate the entries in the properties
		// map
		// call the get to make sure it is populated
		mAppInfo.get();
		return (String) getProperty(pKey);
	}

	/**
	 * Get the value of <code>annotation/appinfo/SepPrefix</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/SepPrefix</code>, null if
	 *         it does not exist.
	 */
	public String getAppInfoSepPrefix() {
		return getAppInfo("annotation.appinfo.SepPrefix");
	}

	/**
	 * Get the value of <code>annotation/appinfo/Suffix</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/Suffix</code>, null if it
	 *         does not exist.
	 */
	public String getAppInfoSepSuffix() {
		return getAppInfo("annotation.appinfo.SepSuffix");
	}

	/**
	 * Get the value of <code>annotation/appinfo/Separator</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/Separator</code>, null if
	 *         it does not exist.
	 */
	public String getAppInfoSeparator() {
		return getAppInfo("annotation.appinfo.Separator");
	}

	/**
	 * Get the value of <code>annotation/appinfo/LookAheadPattern</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/LookAheadPattern</code>,
	 *         null if it does not exist.
	 */
	public String getAppInfoLookAheadPattern() {
		return getAppInfo("annotation.appinfo.LookAheadPattern");
	}

	/**
	 * Get the value of <code>annotation/appinfo/LookAheadField</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/LookAheadField</code>,
	 *         null if it does not exist.
	 */
	public String getAppInfoLookAheadField() {
		return getAppInfo("annotation.appinfo.LookAheadField");
	}

	/**
	 * Get the value of <code>annotation/appinfo/MatchUntilPattern</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/MatchUntilPattern</code>,
	 *         null if it does not exist.
	 */
	public String getAppInfoMatchUntilPattern() {
		return getAppInfo("annotation.appinfo.MatchUntilPattern");
	}
	
	/**
	 * Get the value of <code>annotation/appinfo/IncludePrefix</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/IncludePrefix</code>, false
	 *         if it does not exist.
	 */
	public boolean getAppInfoIncludePrefix() {
		return Boolean.valueOf(getAppInfo("annotation.appinfo.IncludePrefix")).booleanValue();
	}

	/**
	 * Get the value of <code>annotation/appinfo/IncludeSuffix</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/IncludeSuffix</code>, false
	 *         if it does not exist.
	 */
	public boolean getAppInfoIncludeSuffix() {
		return Boolean.valueOf(getAppInfo("annotation.appinfo.IncludeSuffix")).booleanValue();
	}

	/**
	 * Get the value of <code>annotation/appinfo/IncludeNext</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/IncludeNext</code>, false
	 *         if it does not exist.
	 */
	public boolean getAppInfoIncludeNext() {
		return Boolean.valueOf(getAppInfo("annotation.appinfo.IncludeNext")).booleanValue();
	}

	/**
	 * Get the value of <code>annotation/appinfo/IncludeNext</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/IncludeNext</code>,
	 *         false if it does not exist.
	 */
	public boolean getAppInfoNotInclude() {
		return Boolean.valueOf(getAppInfo("annotation.appinfo.NotInclude")).booleanValue();
	}

	/**
	 * Get the value of <code>annotation/appinfo/NoTag</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/NoTag</code>, false if
	 *         it does not exist.
	 */
	public boolean getAppInfoNoTag() {
		return Boolean.valueOf(getAppInfo("annotation.appinfo.NoTag")).booleanValue();
	}

	/**
	 * Get the value of
	 * <code>annotation/appinfo/Tag</code>.
	 * 
	 * @return the value of
	 *         <code>annotation/appinfo/Tag</code>, null
	 *         if it does not exist.
	 */
	private String getAppInfoTag() {
		return getAppInfo("annotation.appinfo.Tag");
	}
	
	/**
	 * Get the value of <code>annotation/appinfo/NoStartOfFieldIndicator</code>.
	 * 
	 * @return the value of
	 *         <code>annotation/appinfo/NoStartOfFieldIndicator</code>, false
	 *         if it does not exist.
	 */
	public boolean getAppInfoNoStartOfFieldIndicator() {
		return Boolean.valueOf(getAppInfo("annotation.appinfo.NoStartOfFieldIndicator")).booleanValue();
	}

	/**
	 * Get the value of <code>annotation/appinfo/CanContainFields</code>.
	 * 
	 * @return the value of <code>annotation/appinfo/CanContainFields</code>,
	 *         false if it does not exist.
	 */
	public boolean getAppInfoCanContainFields() {
		return Boolean.valueOf(getAppInfo("annotation.appinfo.CanContainFields")).booleanValue();
	}
	
	/**
	 * Get the value of
	 * <code>annotation/appinfo/Qualifier/SepPrefix</code>.
	 * 
	 * @return the value of
	 *         <code>annotation/appinfo/Qualifier/SepPrefix</code>, null
	 *         if it does not exist.
	 */
	public String getAppInfoQualifierSepPrefix() {
		return getAppInfo("annotation.appinfo.Qualifier.SepPrefix");
	}

	/**
	 * Get the value of
	 * <code>annotation/appinfo/Qualifier/SepSuffix</code>.
	 * 
	 * @return the value of
	 *         <code>annotation/appinfo/Qualifier/SepSuffix</code>, null
	 *         if it does not exist.
	 */
	public String getAppInfoQualifierSepSuffix() {
		return getAppInfo("annotation.appinfo.Qualifier.SepSuffix");
	}

	/**
	 * Get the value of
	 * <code>annotation/appinfo/MessageApplication</code>.
	 * 
	 * @return the value of
	 *         <code>annotation/appinfo/MessageApplication</code>, null
	 *         if it does not exist.
	 */
	public String getAppInfoMessageApplication() {
		return getAppInfo("annotation.appinfo.MessageApplication");
	}

	/**
	 * Get the value of
	 * <code>annotation/appinfo/MessageType</code>.
	 * 
	 * @return the value of
	 *         <code>annotation/appinfo/MessageType</code>, 
	 *         false if it does not exist.
	 */
	public boolean getAppInfoMessageType() {
		return Boolean.valueOf(getAppInfo("annotation.appinfo.MessageType")).booleanValue();
	}

	/**
	 * checks if the specified value is listed in the value of
	 * <code>annotation/appinfo/MessageVariant</code>.
	 * 
	 * @return true if the specified value is listed in
	 *         <code>annotation/appinfo/MessageVariant</code>, 
	 *         false if it does not exist.
	 */
	public boolean checkAppInfoMessageVariant(String pMessageTypeAndVariant) {
		final String value = getAppInfo("annotation.appinfo.MessageVariant");
		if(value == null) {
			return false;
		}
		final String[] variants = value.split(",");
		Arrays.sort(variants);
		return Arrays.binarySearch(variants, pMessageTypeAndVariant) >= 0;
	}
	
	

	/**
	 * Get the value of
	 * <code>annotation/appinfo/MatchContent</code>.
	 * 
	 * @return the value of
	 *         <code>annotation/appinfo/MatchContent</code>, 
	 *         false if it does not exist.
	 */
	public boolean getAppInfoMatchContent() {
		return Boolean.valueOf(getAppInfo("annotation.appinfo.MatchContent")).booleanValue();
	}
	
	/**
	 * Get the children of the element
	 * 
	 * @return the children of the element
	 */
	public List /* <SchemaElement> */ getChildren() {
		if (mChildren == null) {
			parseChildren();
		}
		return mChildren;
	}

	private void parseChildren() {
		Node child = mElement.getFirstChild();
		if (child != null) {
			final List/*<SchemaElement>*/ children = new ArrayList();
			do {
				if (child.getNodeType() == Node.ELEMENT_NODE) {
					children.add(mSchemaDoc.getSchemaElement((Element) child));
				}
				child = child.getNextSibling();
			} while (child != null);
			mChildren = children;
		} else {
			mChildren = Collections.EMPTY_LIST;
		}
	}

	/**
	 * Find a direct child element of the node with the specified local name.
	 * 
	 * @param pLocalName
	 *            the local name to search for (null finds the first child
	 *            element)
	 * @return the direct child node with the specified node local name, null if
	 *         not found
	 */
	public SchemaElement getChildByLocalName(String pLocalName) {
		final Iterator iterator = getChildren().iterator();
		while (iterator.hasNext()) {
			final SchemaElement info = (SchemaElement) iterator.next();
			if (pLocalName == null || pLocalName.equals(info.getLocalName())) {
				return info;
			}
		}

		return null;
	}

	/**
	 * Determine the type of the element.
	 * <p>
	 * <table border="1">
	 * <tr>
	 * <td>UNSUPPORTED</td>
	 * <td>Unsupported content type</td>
	 * </tr>
	 * <tr>
	 * <td>SIMPLE_CONTENT_FIELD_BLOCK</td>
	 * <td>Message block content</td>
	 * </tr>
	 * <tr>
	 * <td>SIMPLE_CONTENT_FIELD</td>
	 * <td>Simple field content</td>
	 * </tr>
	 * <tr>
	 * <td>SIMPLE_CONTENT_SUBFIELD</td>
	 * <td>Subfield content of composite field</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT</td>
	 * <td>Complex content</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_MTMESSAGE</td>
	 * <td>MT message</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_ISO15022MESSAGE</td>
	 * <td>ISO15022 message</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_SYSTEMMESSAGE</td>
	 * <td>System message</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_FULLMESSAGE</td>
	 * <td>Full message</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_SEQUENCE</td>
	 * <td>Sequence</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_LOOP</td>
	 * <td>Loop</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_SEQUENCEOPTION</td>
	 * <td>Choice between different sequences</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_FIELDOPTION</td>
	 * <td>Field option</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD</td>
	 * <td>Composite field</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_SUBSEQUENCE</td>
	 * <td>Sub-Sequence</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_QUALIFIER</td>
	 * <td>Qualifier</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_ISO15022FIELD</td>
	 * <td>Iso15022 field</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_BLOCK</td>
	 * <td>Block field</td>
	 * </tr>
	 * <tr>
	 * <td>COMPLEX_CONTENT_MTTYPE_BLOCKWITHSUBBLOCKS</td>
	 * <td>Block field with subblocks</td>
	 * </tr>
	 * </table>
	 * 
	 * @return the type
	 */
	public int getBaseType() {
		if (mBaseType == null) {
			mBaseType = new Integer(getBaseType0());
		}
		return mBaseType.intValue();
	}

	/**
	 * Clears the cached result that is returned by {@link #getBaseType()} so a
	 * new result is created when {@link #getBaseType()} is called.<br>
	 * This method is only needed when {@link #setProperty(String, Object)} is
	 * used to override annotations of the schema to support older schema
	 * versions that are missing these annotations.
	 */
	public void resetBaseType() {
		mBaseType = null;
	}
	
	private int getBaseType0() {
		try {
			final String typeName = getTypeLocalName();
			final SchemaElement type = getType();
			if (type != null) {
				if (type.getLocalName().equals("simpleType")) {
					if (SchemaConstants.HEADERS_BLOCK1_TYPE.equals(typeName)) {
						return SchemaConstants.SIMPLE_CONTENT_FIELD_BLOCK;
					} else if (SchemaConstants.HEADERS_BLOCK2_TYPE.equals(typeName)) {
						return SchemaConstants.SIMPLE_CONTENT_FIELD_BLOCK;
					} else if (SchemaConstants.HEADERS_BLOCK3_TYPE.equals(typeName)) {
						return SchemaConstants.SIMPLE_CONTENT_FIELD_BLOCK;
					} else if (SchemaConstants.TEXT_TYPE.equals(typeName)) {
						return SchemaConstants.SIMPLE_CONTENT_FIELD_BLOCK;
					} else if (SchemaConstants.TRAILERS_TYPE.equals(typeName)) {
						return SchemaConstants.SIMPLE_CONTENT_FIELD_BLOCK;
					} else if (getAppInfoNoTag() || getFINFieldTagName() != null) {
						return SchemaConstants.SIMPLE_CONTENT_FIELD;
					} else {
						return SchemaConstants.SIMPLE_CONTENT_SUBFIELD;
					}
				}
				if (SchemaConstants.HEADERS_TYPE.equals(typeName)) {
					return SchemaConstants.COMPLEX_CONTENT;
				}
				final SchemaElement complexContent = type.getChildByLocalName("complexContent");
				final SchemaElement extension;
				if (complexContent != null) {
					extension = complexContent.getChildByLocalName("extension");
				} else {
					extension = null;
				}

				if (extension != null) {
					final String baseType = extension.getBaseAttribute();
					if (SchemaConstants.BASE_ATTRIBUTE_MESSAGE.equals(baseType)) {
						// old schema version 
						return  mSchemaDoc.isSystemMessage() ? SchemaConstants.COMPLEX_CONTENT_MTTYPE_SYSTEMMESSAGE : SchemaConstants.COMPLEX_CONTENT_MTTYPE_MTMESSAGE;
		            } else if (SchemaConstants.BASE_ATTRIBUTE_MTMESSAGE.equals(baseType)) {
	            		return SchemaConstants.COMPLEX_CONTENT_MTTYPE_MTMESSAGE;
		            } else if (SchemaConstants.BASE_ATTRIBUTE_ISO15022MESSAGE.equals(baseType)) {
	            		return SchemaConstants.COMPLEX_CONTENT_MTTYPE_ISO15022MESSAGE;
		            } else if (SchemaConstants.BASE_ATTRIBUTE_SYSTEMMESSAGE.equals(baseType)) {
	            		return SchemaConstants.COMPLEX_CONTENT_MTTYPE_SYSTEMMESSAGE;
		            } else if (SchemaConstants.BASE_ATTRIBUTE_FULLMESSAGE.equals(baseType)) {
	            		return SchemaConstants.COMPLEX_CONTENT_MTTYPE_FULLMESSAGE;
					} else if (SchemaConstants.BASE_ATTRIBUTE_SEQUENCEOPTION.equals(baseType)) {
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_SEQUENCEOPTION;
					} else if (SchemaConstants.BASE_ATTRIBUTE_COMPOSITEFIELD.equals(baseType)) {
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD;
					} else if (SchemaConstants.BASE_ATTRIBUTE_LOOP.equals(baseType)) {
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_LOOP;
					} else if (SchemaConstants.BASE_ATTRIBUTE_FIELDOPTION.equals(baseType)) {
						// new schema version uses FieldOption iso
						// CompositeField, the old FieldOption can be identified
						// because it has a choice
						final SchemaElement choice = extension.getChildByLocalName("choice");
						if (choice != null) {
							return SchemaConstants.COMPLEX_CONTENT_MTTYPE_FIELDOPTION;
						} else {
							return SchemaConstants.COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD; // new schema version
						}
					} else if (SchemaConstants.BASE_ATTRIBUTE_SEQUENCE.equals(baseType)) {
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_SEQUENCE;
					} else if (SchemaConstants.BASE_ATTRIBUTE_SUBSEQUENCE.equals(baseType)) {
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_SUBSEQUENCE;
					} else if (SchemaConstants.BASE_ATTRIBUTE_MTFIELD.equals(baseType)) {
						// new schema version uses MTField iso FieldOption
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_FIELDOPTION; // new schema version
					} else if (SchemaConstants.BASE_ATTRIBUTE_ISO15022FIELD.equals(baseType)) {
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_ISO15022FIELD;
					} else if (SchemaConstants.BASE_ATTRIBUTE_QUALIFIER.equals(baseType)) {
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_QUALIFIER;
					} else if (SchemaConstants.BASE_ATTRIBUTE_BLOCK.equals(baseType)) {
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_BLOCK;
					} else if (SchemaConstants.BASE_ATTRIBUTE_BLOCKWITHSUBBLOCKS.equals(baseType)) {
						return SchemaConstants.COMPLEX_CONTENT_MTTYPE_BLOCKWITHSUBBLOCKS;
					} else {
						return SchemaConstants.COMPLEX_CONTENT;
					}
				} else {
					return SchemaConstants.UNSUPPORTED;
				}
			}
		} catch (final Exception e) {
			// ignored and returning UNSUPPORTED
		}

		return SchemaConstants.UNSUPPORTED;
	}

	/**
	 * Get the value of the attribute in the simple type's inheritance
	 * hierarchy.
	 * <P>
	 * This method will over the inheritance hierarchy of the simple type and
	 * try to find the attribute with the specified name. If found the value of
	 * the attribute is returned, if not found the default value will be
	 * returned.
	 * 
	 * @param pAttributeName
	 *            the name of the attribute to find
	 * @param pDefaultValue
	 *            the default value
	 * @return the value of the attribute, the default value if the attribute is
	 *         not found
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 */
	public String getSimpleTypeAttributeValue(String pAttributeName, String pDefaultValue) throws SchemaException {
		SchemaElement element = this;

		while (element != null) {
			final SchemaElement restriction = element.getChildByLocalName("restriction");
			if (restriction == null) {
				break;
			}
			final SchemaElement childElement = restriction.getChildByLocalName(pAttributeName);
			if (childElement != null) {
				return childElement.getValueAttribute();
			}

			element = restriction.getBase();
		}

		return pDefaultValue;
	}

	/**
	 * Get the value of the attribute in the simple type's inheritance
	 * hierarchy.
	 * <P>
	 * This method will over the inheritance hierarchy of the simple type and
	 * try to find the attribute with the specified name. If found the value of
	 * the attribute is returned, if not found the default value will be
	 * returned.
	 * <P>
	 * This method uses {@link #getSimpleTypeAttributeValue(String, String)} and
	 * converts the received result to an integer value.
	 * 
	 * @param pAttributeName
	 *            the name of the attribute to find
	 * @param pDefaultValue
	 *            the default value
	 * @return the value of the attribute, the default value if the attribute is
	 *         not found
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 * @see #getSimpleTypeAttributeValue(String, String)
	 */
	public int getSimpleTypeAttributeValue(String pAttributeName, int pDefaultValue) throws SchemaException {
		final String value = getSimpleTypeAttributeValue(pAttributeName, null);
		if (value == null) {
			return pDefaultValue;
		} else {
			return Integer.parseInt(value);
		}
	}

	/**
	 * Get the local name of the base type of the simple type.
	 * <P>
	 * This method will over the inheritance hierarchy of the simple type to
	 * find the root. The local name of the root type will be returned.
	 * 
	 * @return the local name of the base type
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 */
	public String getSimpleBaseType() throws SchemaException {
		SchemaElement element = this;

		while (element != null) {
			final SchemaElement restriction = element.getChildByLocalName("restriction");
			if (restriction == null) {
				break;
			}

			element = restriction.getBase();

			if (element == null) {
				// return only local name
				final StringTokenizer st = new StringTokenizer(restriction.getBaseAttribute(), ":");
				String lastToken = null;
				while (st.hasMoreElements()) {
					lastToken = st.nextToken();
				}
				return lastToken;
			}
		}

		return null;
	}

	/**
	 * Get the pattern which is used by the simple type.
	 * <p>
	 * Using {@link #getSimpleTypeAttributeValue(String, String)}, the full
	 * inheritance tree is traversed to find the value.
	 * 
	 * @return the pattern
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 * @see #getSimpleTypeAttributeValue(String, String)
	 */
	public String getPattern() throws SchemaException {
		if (mPattern == null) {
			final String value = getSimpleTypeAttributeValue("pattern", null);
			mPattern = new Cache() {
				protected Object retrieve() {
					return value;
				}
			};
		}

		return (String) mPattern.get();
	}

	/**
	 * Get the minInclusive which is used by the simple type.
	 * <p>
	 * Using {@link #getSimpleTypeAttributeValue(String, String)}, the full
	 * inheritance tree is traversed to find the value.
	 * 
	 * @return the minInclusive
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 * @see #getSimpleTypeAttributeValue(String, String)
	 */
	public String getMinInclusive() throws SchemaException {
		if (mMinInclusive == null) {
			final String value = getSimpleTypeAttributeValue("minInclusive", null);
			mMinInclusive = new Cache() {
				protected Object retrieve() {
					return value;
				}
			};
		}

		return (String) mMinInclusive.get();
	}

	/**
	 * Get the maxInclusive which is used by the simple type.
	 * <p>
	 * Using {@link #getSimpleTypeAttributeValue(String, String)}, the full
	 * inheritance tree is traversed to find the value.
	 * 
	 * @return the maxInclusive
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 * @see #getSimpleTypeAttributeValue(String, String)
	 */
	public String getMaxInclusive() throws SchemaException {
		if (mMaxInclusive == null) {
			final String value = getSimpleTypeAttributeValue("maxInclusive", null);
			mMaxInclusive = new Cache() {
				protected Object retrieve() {
					return value;
				}
			};
		}

		return (String) mMaxInclusive.get();
	}

	/**
	 * Get the minExclusive which is used by the simple type.
	 * <p>
	 * Using {@link #getSimpleTypeAttributeValue(String, String)}, the full
	 * inheritance tree is traversed to find the value.
	 * 
	 * @return the minExclusive
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 * @see #getSimpleTypeAttributeValue(String, String)
	 */
	public String getMinExclusive() throws SchemaException {
		if (mMinExclusive == null) {
			final String value = getSimpleTypeAttributeValue("minExclusive", null); 
			mMinExclusive = new Cache() {
				protected Object retrieve() {
					return value;
				}
			};
		}

		return (String) mMinExclusive.get();
	}

	/**
	 * Get the maxExclusive which is used by the simple type.
	 * <p>
	 * Using {@link #getSimpleTypeAttributeValue(String, String)}, the full
	 * inheritance tree is traversed to find the value.
	 * 
	 * @return the maxExclusive
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 * @see #getSimpleTypeAttributeValue(String, String)
	 */
	public String getMaxExclusive() throws SchemaException {
		if (mMaxExclusive == null) {
			final String value = getSimpleTypeAttributeValue("maxExclusive", null);
			mMaxExclusive = new Cache() {
				protected Object retrieve() {
					return value;
				}
			};
		}

		return (String) mMaxExclusive.get();
	}

	/**
	 * Get the minLength which is used by the simple type.
	 * <p>
	 * Using {@link #getSimpleTypeAttributeValue(String, int)}, the full
	 * inheritance tree is traversed to find the value.
	 * 
	 * @return the minLength
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 * @see #getSimpleTypeAttributeValue(String, int)
	 */
	public int getMinLength() throws SchemaException {
		if (mMinLength == null) {
			mMinLength = new Integer(getSimpleTypeAttributeValue("minLength", 0));
		}
		return mMinLength.intValue();
	}

	/**
	 * Get the maxLength which is used by the simple type.
	 * <p>
	 * Using {@link #getSimpleTypeAttributeValue(String, int)}, the full
	 * inheritance tree is traversed to find the value.
	 * 
	 * @return the maxLength
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX})
	 *             when the namespace prefix was not found 
	 * @throws SchemaException ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI})
	 *             when the namespaceURI was not resolved 
	 * @see #getSimpleTypeAttributeValue(String, int)
	 */
	public int getMaxLength() throws SchemaException {
		if (mMaxLength == null) {
			mMaxLength = new Integer(getSimpleTypeAttributeValue("maxLength", Integer.MAX_VALUE));
		}
		return mMaxLength.intValue();
	}

	/**
	 * Get all the enumeration elements below the specified XML schema element
	 * 
	 * @return the node list of enumeration elements
	 */
	public String[] getEnumerations() {
		if (mEnumerations == null) {
			mEnumerations = new Cache() {
				protected Object retrieve() {
					final NodeList list = mElement.getElementsByTagNameNS(SchemaConstants.W3C_XML_SCHEMA_NS_URI, "enumeration");
					if (list != null) {
						final int length = list.getLength();
						if (length > 0) {
							final String[] enums = new String[length];
							for (int i = 0; i < length; i++) {
								enums[i] = ((Element) list.item(i)).getAttribute("value");
							}
							return enums;
						}
					}

					return null;
				}
			};
		}

		return (String[]) mEnumerations.get();
	}

	/**
	 * Extract the FIN tag name from the element name
	 * 
	 * @return the FIN tag name, or null if not found
	 */
	public String getFINFieldTagName() {
		if (mFieldTagName == null) {
			mFieldTagName = new Cache() {
				protected Object retrieve() {
					final String tag = getAppInfoTag();
					if(tag != null) {
						return tag;
					} else { 
						final String name = getNameAttribute();
						if (name != null) {
							final Matcher m1 = FIELD_REGEXP_PATTERN.matcher(name);
							if (m1.matches()) {
								return m1.group(1);
							}
						}
						return null;
					}
				}
			};
		}
		return (String) mFieldTagName.get();
	}

	/**
	 * Extract the FIN tag name from the element name
	 * 
	 * @return the FIN tag name, or null if not found
	 */
	public String getISO15022FieldTagName() {
		final String name = getNameAttribute();
		final String tag = name.substring(1, 3);
		return tag;
	}

	/**
	 * For some values cached by the ElementInfo, null is a value value.
	 * Therefore null cannot be used to check if the value is contained within
	 * the cache or not. This class wraps the retrieval method and protects it
	 * with a boolean so that the value is only retrieved once.
	 */
	private abstract static class Cache {
		private boolean mRetrieved;
		private Object mValue;

		/**
		 * This method should be implement to actually retrieve the value
		 * 
		 * @return the value
		 */
		protected abstract Object retrieve();

		/**
		 * This method will call the retrieve method if the object is not yet
		 * cached
		 * 
		 * @return the cached value
		 */
		public Object get() {
			if (!mRetrieved) {
				mValue = retrieve();
				mRetrieved = true;
			}

			return mValue;
		}
	}
}
