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

import com.swift.converter.utils.SwiftException;

/**
 * Exceptions thrown from a Schema document.
 * 
 * @author SWIFT
 */
public class SchemaException extends SwiftException {
	/** serial version UID */
	private static final long serialVersionUID = -4634984446126250728L;
	/** Undefined namespace prefix */
	public static final String SYNTAX_UNDEFINED_NAMESPACE_PREFIX = "DOC.001.001";
	/** Unresolved namespace URI */
	public static final String SYNTAX_UNRESOLVED_NAMESPACE_URI = "DOC.001.002";

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
	public SchemaException(String pErrorId, Object[] pParameters, Throwable pCause) {
		super(pErrorId, pParameters, pCause);
	}
}
