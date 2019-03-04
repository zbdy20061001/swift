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

import com.swift.converter.mt.io.MTField;
import com.swift.converter.utils.SwiftException;

/**
 * The definition of the error handler used while converting a native MT message
 * to its corresponding XML format.
 * 
 * @author SWIFT
 */
public interface IErrorHandler {
	/**
	 * The fieldContentError is called each time a problem is detected during the
	 * conversion
	 * 
	 * @param pSchemaElement
	 *            the schema element which is currently being processed
	 *            (definition)
	 * @param pField
	 *            the field which is processed (instance)
	 */
	public void fieldContentError(SchemaElement pSchemaElement, MTField pField);
	
	/**
	 * Add an exception to the collection.
	 * 
	 * @param pException
	 *            the exception to add
	 */
	public void add(SwiftException pException);
}
