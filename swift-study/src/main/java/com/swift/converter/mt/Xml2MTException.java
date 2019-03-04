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
 * Exceptions thrown while converting an XML version of an MT message to its
 * native MT format.
 * 
 * @author SWIFT
 */
public class Xml2MTException extends SwiftException {
	/** serial version UID */
	private static final long serialVersionUID = -4774359290750630441L;
	/** Unexpected node {0} */
	public static final String UNEXPECTED_ELEMENT = "XML2MT.001.001";
	/** Unexpected end of message */
	public static final String UNEXPECTED_EOF = "XML2MT.001.002";
	/** Invalid BLOCK tag {0} */
	public static final String ERROR_BLOCK_TOKEN = "XML2MT.002.001";
	/** Invalid content {0} */
	public static final String ERROR_BLOCK_CONTENT = "XML2MT.002.002";
	/** Invalid MT tag {0} */
	public static final String ERROR_MT_TOKEN = "XML2MT.002.003";
	/** Invalid content {0} */
	public static final String ERROR_MT_CONTENT = "XML2MT.002.004";
	/** Unexpected tag {0} */
	public static final String ERROR_ALL_TOKEN = "XML2MT.002.005";
	/** Invalid content {0} */
	public static final String ERROR_ALL_CONTENT = "XML2MT.002.006";

	private final String mXPath;

	/**
	 * Create a new exception
	 * 
	 * @param pXPath
	 *            the XPath to the element for which parsing failed
	 * @param pErrorId
	 *            the error id
	 * @param pParameters
	 *            the parameters
	 * @param pCause
	 *            the cause
	 */
	public Xml2MTException(String pXPath, String pErrorId, Object[] pParameters, Throwable pCause) {
		super(pErrorId, pParameters, pCause);
		mXPath = pXPath;
	}

	/**
	 * Create a new exception
	 * 
	 * @param pErrorId
	 *            the error id
	 * @param pParameters
	 *            the parameters
	 * @param pCause
	 *            the cause
	 */
	public Xml2MTException(String pErrorId, Object[] pParameters, Throwable pCause) {
		this(null, pErrorId, pParameters, pCause);
	}

	/**
	 * Get the XPath to the element for which parsing failed
	 * 
	 * @return the XPath
	 */
	public String getXPath() {
		return mXPath;
	}
}
