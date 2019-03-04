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
package com.swift.converter.utils;

import com.swift.converter.xml.SchemaProcessor;

/**
 * This object wraps any SchemaProcessor and will print the current XPath as
 * part of the toString call
 */
public class XPathPrinter {
	private final SchemaProcessor mProcessor;

	/**
	 * Create a new wrapper object
	 * 
	 * @param pProcessor
	 *            the SchemaProcessor
	 */
	public XPathPrinter(SchemaProcessor pProcessor) {
		mProcessor = pProcessor;
	}

	/**
	 * Print the XPath
	 * 
	 * @return the XPath
	 */
	public String toString() {
		return mProcessor.getXPath();
	}
}
