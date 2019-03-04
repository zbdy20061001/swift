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
import java.util.ListIterator;
import java.util.Map;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * The SchemaHelper class defines a number of utility methods which can be used while processing XML schema's and XML documents.
 * 
 * @author SWIFT
 */
public final class SchemaHelper {
	/**
	 * This class should not be instantiated or extended.
	 */
	private SchemaHelper() {
		// private constructor
	}

	/**
	 * Find a direct child element of the node with the specified local name.
	 * 
	 * @param pParentNode
	 *            the parent name
	 * @param pLocalName
	 *            the local name to search for
	 * @return the direct child node with the specified node local name, null if not found
	 */
	public static Element getChildByLocalName(Node pParentNode, String pLocalName) {
		if (pParentNode != null) {
			for (Node childNode = pParentNode.getFirstChild(); childNode != null; childNode = childNode.getNextSibling()) {
				if ((childNode.getNodeType() == Node.ELEMENT_NODE)
						&& ((pLocalName == null) || childNode.getLocalName().equals(pLocalName))) {
					return (Element) childNode;
				}
			}
		}
		return null;
	}

	/**
	 * Extract the FIN block name from the element name. The result of the function will be "1", "2", "3", "4", "5", or null.
	 * 
	 * @param pSchemaElement
	 *            the XML schema element
	 * @return the FIN block name, or null if not found
	 */
	public static String getFINFieldBlockTagName(SchemaElement pSchemaElement) {
		final String type = pSchemaElement.getTypeLocalName();
		if (SchemaConstants.HEADERS_BLOCK1_TYPE.equals(type)) {
			return "1";
		} else if (SchemaConstants.HEADERS_BLOCK2_TYPE.equals(type)) {
			return "2";
		} else if (SchemaConstants.HEADERS_BLOCK3_TYPE.equals(type)) {
			return "3";
		} else if (SchemaConstants.TEXT_TYPE.equals(type)) {
			return "4";
		} else if (SchemaConstants.TRAILERS_TYPE.equals(type)) {
			return "5";
		}
		return null;
	}

	/**
	 * Check that all characters in the string a within the [pFirstChar, pLastChar] range.
	 * 
	 * @param pValue
	 *            the string to check
	 * @param pFirstChar
	 *            the first character
	 * @param pLastChar
	 *            the last character
	 * @return true if all characters are within the range
	 */
	public static boolean checkChars(String pValue, int pFirstChar, int pLastChar) {
		for (int i = 0; i < pValue.length(); i++) {
			if ((pValue.charAt(i) < pFirstChar) || (pValue.charAt(i) > pLastChar)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Check if the content of the type must match with the input.
	 * 
	 * @param pSchemaElement
	 *            the scheme element
	 * @return true if the content of the type must match with the input
	 * @throws SchemaException
	 *             ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX}) when the namespace prefix was not found
	 * @throws SchemaException
	 *             ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI}) when the namespaceURI was not resolved
	 */
	public static boolean mustMatchContent(SchemaElement pSchemaElement) throws SchemaException {
		final SchemaElement type = pSchemaElement.getType();
		if (pSchemaElement.getAppInfoMatchContent()) {
			return true;
		}
		if ((type != null) && type.getLocalName().equals("simpleType")) {
			final SchemaElement restriction = type.getChildByLocalName("restriction");
			final String baseType = restriction.getBaseAttribute();
			return SchemaConstants.BEGINBLOCK_TYPE.equals(baseType);
		}
		return false;
	}

	/**
	 * Add a value to the property map.
	 * <p>
	 * The property map is a map holding the XML schema elements as key, and a name/value pair make as value.
	 * 
	 * @param pPropertieMaps
	 *            the property map
	 * @param pSchemaElement
	 *            the element for which a property must be set
	 * @param pPropertyName
	 *            the name of the property to set
	 * @param pObject
	 *            the value of the property
	 */
	public static void setProperty(Map/* <Element,Map<String,Object>> */pPropertieMaps, SchemaElement pSchemaElement,
			String pPropertyName, Object pObject) {
		Map propertyMap = (Map) pPropertieMaps.get(pSchemaElement.getElement());
		if (propertyMap == null) {
			propertyMap = new HashMap();
			pPropertieMaps.put(pSchemaElement.getElement(), propertyMap);
		}
		propertyMap.put(pPropertyName, pObject);
	}

	/**
	 * Get a value from the property map.
	 * <p>
	 * The property map is a map holding the XML schema elements as key, and a name/value pair make as value.
	 * 
	 * @param pPropertieMaps
	 *            the property map
	 * @param pSchemaElement
	 *            the element for which a property must be set
	 * @param pPropertyName
	 *            the name of the property to set
	 * @return the value of the property
	 */
	public static Object getProperty(Map /* <Element,Map<String,Object>> */pPropertieMaps, SchemaElement pSchemaElement,
			String pPropertyName) {
		final Map propertyMap = (Map) pPropertieMaps.get(pSchemaElement.getElement());
		if (propertyMap == null) {
			return null;
		}
		return propertyMap.get(pPropertyName);
	}

	/**
	 * Is the current element in a choice
	 * 
	 * @param pSchemaProcessor
	 *            the scheme processor
	 * @return true if in a choice element
	 */
	public static boolean isChoiceElement(SchemaProcessor pSchemaProcessor) {
		for (final ListIterator li = pSchemaProcessor.getXPathIterator(); li.hasPrevious();) {
			final SchemaProcessor.XPathStep e = (SchemaProcessor.XPathStep) li.previous();
			final String localname = e.getElement().getLocalName();
			final String name = e.getElement().getNameAttribute();
			if (localname.equals("choice")) {
				return true;
			} else if (localname.equals("sequence") && name != null) {
				return false;
			}
		}

		return false;
	}

	/**
	 * Get the prefix to use for the specified qualifier
	 * 
	 * @param pSchemaProcessor
	 *            the schema process to get the current qualifier name
	 * @param pSchemaElement
	 *            the schema element on which to look for the prefix
	 * @return the prefix
	 * @throws SchemaException
	 *             ({@link SchemaException#SYNTAX_UNDEFINED_NAMESPACE_PREFIX}) when the namespace prefix was not found
	 * @throws SchemaException
	 *             ({@link SchemaException#SYNTAX_UNRESOLVED_NAMESPACE_URI}) when the namespaceURI was not resolved
	 */
	public static String getQualifierPrefix(SchemaProcessor pSchemaProcessor, SchemaElement pSchemaElement) throws SchemaException {
		final String qualifierName = pSchemaProcessor.getCurrentQualifier();
		if (qualifierName != null) {
			final SchemaElement typeElement = pSchemaElement.getType();
			if (typeElement != null) {
				final SchemaElement complexContentElement = typeElement.getChildByLocalName("complexContent");
				final SchemaElement extensionElement = complexContentElement.getChildByLocalName("extension");
				final SchemaElement sequenceInfo = extensionElement.getChildByLocalName("sequence");

				final String qualifierSepPrefix = sequenceInfo.getAppInfoQualifierSepPrefix();
				final String qualifierSepSuffix = sequenceInfo.getAppInfoQualifierSepSuffix();

				final StringBuffer qualifierPrefix = new StringBuffer();
				qualifierPrefix.append(qualifierSepPrefix).append(qualifierName).append(qualifierSepSuffix);
				return qualifierPrefix.toString();
			}
		}
		return null;
	}

	/**
	 * Get the match result as a string and convert it using {@link #getStringWithCr2CrLf(String)}.
	 * 
	 * @param pMatched
	 *            the match result
	 * @return the converted string result
	 * @see #getStringWithCr2CrLf(String)
	 */
	public static String getStringWithCr2CrLf(MatchResult pMatched) {
		return getStringWithCr2CrLf(pMatched == null ? null : pMatched.toString());
	}

	/**
	 * Convert CrLf, LfCr, Lf into a CrLf
	 * 
	 * @param pString
	 *            the string to convert
	 * @return the converted string
	 */
	public static String getStringWithCr2CrLf(String pString) {
		if (pString == null) {
			return null;
		}
		final StringBuffer sb = new StringBuffer();
		for (int i = 0; i < pString.length(); i++) {
			final char c = pString.charAt(i);
			switch (c) {
			case '\r':
				break;
			case '\n':
				sb.append('\r');
			default:
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
