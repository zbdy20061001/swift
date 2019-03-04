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
package com.swift.converter.mt;

import com.swift.converter.utils.SwiftException;

/**
 * Exceptions thrown while converting an MT message to its XML format.
 * 
 * @author SWIFT
 */
public class MT2XmlException extends SwiftException {
	/** serial version UID */
	private static final long serialVersionUID = -1186042401469441282L;
	/** Unexpected end of message */
	public static final String UNEXPECTED_EOF = "MT2XML.001.001";
	/** Unexpected field {0} */
	public static final String UNEXPECTED_FIELD = "MT2XML.001.002";
	/** The content of field {0} has a wrong syntax */
	public static final String ERROR_FIELD_CONTENT = "MT2XML.001.003";
	/** Character {0} expected */
	public static final String SYNTAX_CHAR_EXPECTED = "MT2XML.002.001";
	/** Alphanumeric character expected */
	public static final String SYNTAX_ALPHA_EXPECTED = "MT2XML.002.002";
	/** Numeric character expected */
	public static final String SYNTAX_DIGIT_EXPECTED = "MT2XML.002.003";
	/** Character {0} or {1} expected */
	public static final String SYNTAX_CHAR2_EXPECTED = "MT2XML.002.004";
	/** BLOCK tag {0} expected */
	public static final String SYNTAX_BLOCK_EXPECTED = "MT2XML.002.005";
	/** MT tag {0} expected */
	public static final String SYNTAX_MT_EXPECTED = "MT2XML.002.006";
	/** NOTAG expected */
	public static final String SYNTAX_ALL_EXPECTED = "MT2XML.002.007";
	/** CRLF+NOTAG expected */
	public static final String SYNTAX_CRLF_ALL_EXPECTED = "MT2XML.002.008";
	/** Undefined namespace URI */
	public static final String SYNTAX_UNKNOWN_NAMESPACE_URI = "MT2XML.002.009";

	private final int mLineNumber;

	/**
	 * Create a new exception
	 * 
	 * @param pLineNumber
	 *            the line number
	 * @param pErrorId
	 *            the error id
	 * @param pParameters
	 *            the parameters
	 * @param pCause
	 *            the cause
	 */
	public MT2XmlException(int pLineNumber, String pErrorId, Object[] pParameters, Throwable pCause) {
		super(pErrorId, pParameters, pCause);
		mLineNumber = pLineNumber;
	}

	/**
	 * Get the line number
	 * 
	 * @return the line number
	 */
	public int getLineNumber() {
		return mLineNumber;
	}
}
