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
package com.swift.converter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import com.swift.converter.mt.MT2XmlException;
import com.swift.converter.mt.Xml2MTException;
import com.swift.converter.utils.SwiftException;
import com.swift.converter.xml.DefaultErrorHandler;

/**
 * The ReportErrorHandler is used to collect all the errors which occurs while
 * converting an MT message between MT representation and its corresponding XML
 * representation.
 * 
 * @author SWIFT
 */
class ReportErrorHandler extends DefaultErrorHandler {
	/** The name space of the error report. */
	private static final String NAMESPACE = "urn:swift:coexistence:xsd:error.report.01";

	/** A field was encountered which was not expected at this location. */
	private static final String MT_UNEXPECTED_FIELD = "TC00100";
	/** The end of the MT message was encountered too soon. */
	private static final String MT_UNEXPECTED_EOF = "TC00101";
	/** There is a problem with the field's content. */
	private static final String MT_ERROR_FIELD_CONTENT = "TC00102";
	/** There is a problem with the field's which described in more details. */
	private static final String MT_ERROR_MESSAGE_CONTENT = "TC00103";
	/** This string is used as header before the details of the error. */
	private static final String MT_ERROR_MESSAGE_CONTENT_MESSAGE = "The message content is invalid.\nDetails:";
	/** An element as encountered which was not expected at this location. */
	private static final String XML_UNEXPECTED_ELEMENT = "TC00200";
	/** The end of the XML MT message was encountered too soon. */
	private static final String XML_UNEXPECTED_EOF = "TC00201";
	/** There is a problem with the content of the field */
	private static final String XML_ERROR_MESSAGE_CONTENT = "TC00202";
	/** This string is used as header before the details of the error. */
	private static final String XML_ERROR_MESSAGE_CONTENT_MESSAGE = "The message content is invalid.\nDetails:";
	/** There is a generic problem */
	private static final String GENERIC_ERROR_MESSAGE_CONTENT = "TC00901";

	/**
	 * Append the exception in the specified element. The method will create a
	 * "Code", "Message" and "LineNumber" element containing information found
	 * in the exception.
	 * 
	 * @param pElement
	 *            the element
	 * @param pException
	 *            the exception
	 */
	private void addError(Element pElement, MT2XmlException pException) {
		String code;
		String message;

		if (MT2XmlException.UNEXPECTED_EOF.equals(pException.getCode())) {
			code = MT_UNEXPECTED_EOF;
			message = pException.getMessage();
		} else if (MT2XmlException.UNEXPECTED_FIELD.equals(pException.getCode())) {
			code = MT_UNEXPECTED_FIELD;
			message = pException.getMessage();
		} else if (MT2XmlException.ERROR_FIELD_CONTENT.equals(pException.getCode())) {
			code = MT_ERROR_FIELD_CONTENT;
			message = pException.getMessage();
		} else {
			code = MT_ERROR_MESSAGE_CONTENT;
			message = MT_ERROR_MESSAGE_CONTENT_MESSAGE + pException.getMessage();
		}

		addElement(pElement, "Code", code);
		addElement(pElement, "Message", message);

		if (pException.getLineNumber() != -1) {
			final Element locationElement = addElement(pElement, "Location");
			addElement(locationElement, "LineNumber", Integer.toString(pException.getLineNumber()));
		}
	}

	/**
	 * Append the exception in the specified element. The method will create a
	 * "Code", "Message" and "LineNumber" element containing information found
	 * in the exception.
	 * 
	 * @param pElement
	 *            the element
	 * @param pException
	 *            the exception
	 */
	private void addError(Element pElement, Xml2MTException pException) {
		String code;
		String message;

		if (Xml2MTException.UNEXPECTED_EOF.equals(pException.getCode())) {
			code = XML_UNEXPECTED_EOF;
			message = pException.getMessage();
		} else if (Xml2MTException.UNEXPECTED_ELEMENT.equals(pException.getCode())) {
			code = XML_UNEXPECTED_ELEMENT;
			message = pException.getMessage();
		} else {
			code = XML_ERROR_MESSAGE_CONTENT;
			message = XML_ERROR_MESSAGE_CONTENT_MESSAGE + pException.getMessage();
		}

		addElement(pElement, "Code", code);
		addElement(pElement, "Message", message);

		if (pException.getXPath() != null) {
			final Element locationElement = addElement(pElement, "Location");
			addElement(locationElement, "Path", pException.getXPath());
		}
	}

	/**
	 * Create a new element with the specified name and append it as child to
	 * the parent element. The name space used for the new element will be the
	 * same as the name space of the parent element.
	 * 
	 * @param pParentElement
	 *            the parent element
	 * @param pElementName
	 *            the name of the new element
	 * @return the new DOM element node
	 */
	private static Element addElement(Element pParentElement, String pElementName) {
		final Element newElement = pParentElement.getOwnerDocument()
				.createElementNS(pParentElement.getNamespaceURI(), pElementName);
		pParentElement.appendChild(newElement);
		return newElement;
	}

	/**
	 * Create a new element with the specified name and append it as child to
	 * the parent element. The name space used for the new element will be the
	 * same as the name space of the parent element. In addition the element
	 * will be filled with the provided element text.
	 * 
	 * @param pParentElement
	 *            the parent element
	 * @param pElementName
	 *            the name of the new element
	 * @param pElementText
	 *            the text to store in the element
	 * @return the new DOM element node
	 */
	private static Element addElement(Element pParentElement, String pElementName, String pElementText) {
		final Element newElement = addElement(pParentElement, pElementName);
		final Text textNode = pParentElement.getOwnerDocument().createTextNode(pElementText);
		newElement.appendChild(textNode);
		return newElement;
	}

	/**
	 * This method is called by the MT2Xml and Xml2MT classes at the end of the
	 * processing. In case there are errors detected during the conversion the
	 * errors will be appended as child nodes to the provided node. When no
	 * errors are detected no action is taken by this method.
	 * 
	 * When errors are available, the method will throw an ErrorReportException
	 * to stop the further execution in the MT2Xml and Xml2MT classes.
	 * 
	 * @param pNode
	 *            the node where the errors should be appended to
	 * @throws ErrorReportException
	 *             thrown when errors were reported during processing
	 */
	public void checkEnd(Node pNode) throws ErrorReportException {
		if (getExceptions().size() == 0) {
			return;
		} else {
			Document document;
			if (pNode.getNodeType() == Node.DOCUMENT_NODE) {
				document = (Document) pNode;
			} else {
				document = pNode.getOwnerDocument();
			}
			final Element errorReportElement = document.createElementNS(NAMESPACE, "ErrorReport");
			final Element conversionErrorsElement = addElement(errorReportElement, "ConversionErrors");

			for (int i = 0; i < getExceptions().size(); i++) {
				final Element errorElement = addElement(conversionErrorsElement, "Error");

				final SwiftException exception = (SwiftException) getExceptions().get(i);
				if (exception instanceof MT2XmlException) {
					addError(errorElement, (MT2XmlException) exception);
				} else if (exception instanceof Xml2MTException) {
					addError(errorElement, (Xml2MTException) exception);
				} else {
					addElement(errorElement, "Code", GENERIC_ERROR_MESSAGE_CONTENT);
					addElement(errorElement, "Message", exception.getMessage());
				}
			}
			throw new ErrorReportException(errorReportElement);
		}
	}
}
