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

import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * When the parsing fails, the MT2Xml or Xml2MT classes will report detailed
 * errors in an XML error report.
 * <p>
 * The ErrorReportException contains the error report which can be accessed as a
 * DOM Element using the {@link #getErrorReport()} method, or as a java string
 * using the {@link #getMessage()} method.
 * 
 * @author SWIFT
 */
public class ErrorReportException extends Exception {
	/** Serial version UID */
	private static final long serialVersionUID = -7728309520402568956L;
	/** The error report DOM element */
	private final Element mErrorReportElement;

	/**
	 * Create a new ErrorReportException
	 * 
	 * @param pErrorReportNode
	 *            the root node of the error report
	 */
	public ErrorReportException(Element pErrorReportNode) {
		mErrorReportElement = pErrorReportNode;
	}

	/**
	 * Get the error report as a string
	 * 
	 * @return the error report as a string
	 */
	public String getMessage() {
		final StringBuffer sb = appendNode(new StringBuffer(), mErrorReportElement);
		return sb.toString();
	}

	/**
	 * Append a node the a StringBuffer
	 * 
	 * @param pBuffer
	 *            the buffer
	 * @param pNode
	 *            the node to append
	 * @return the StringBuffer containing all the data
	 */
	private StringBuffer appendNode(StringBuffer pBuffer, Node pNode) {
		switch (pNode.getNodeType()) {
		case Node.ELEMENT_NODE:
			pBuffer.append('<').append(pNode.getNodeName()).append(">\n");
			break;
		case Node.TEXT_NODE:
			pBuffer.append(pNode.getNodeValue()).append('\n');
			break;
		}
		for (Node childNode = pNode.getFirstChild(); childNode != null; childNode = childNode.getNextSibling()) {
			appendNode(pBuffer, childNode);
		}
		switch (pNode.getNodeType()) {
		case Node.ELEMENT_NODE:
			pBuffer.append("</").append(pNode.getNodeName()).append(">\n");
			break;
		}
		return pBuffer;
	}

	/**
	 * Get the error report DOM element
	 * 
	 * @return the error report DOM element
	 */
	public Element getErrorReport() {
		return mErrorReportElement;
	}
}
