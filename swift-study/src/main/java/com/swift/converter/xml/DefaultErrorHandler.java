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
import java.util.List;

import com.swift.converter.mt.MT2XmlException;
import com.swift.converter.mt.io.MTField;
import com.swift.converter.utils.SwiftException;

public class DefaultErrorHandler implements IErrorHandler {
	/** The collected exceptions */
	private List /* <SwiftException> */ mExceptions = new ArrayList();

	/**
	 * Get the collected exceptions.
	 * 
	 * @return the exceptions
	 */
	public List /* <SwiftException> */ getExceptions() {
		return mExceptions;
	}
	
	/**
	 * Add an exception to the collection.
	 * 
	 * @param pException
	 *            the exception to add
	 */
	public void add(SwiftException pException) {
		mExceptions.add(pException);
	}

	/**
	 * This method is used by the converter to notify of errors during
	 * processing. The report error handler uses this method to construct a full
	 * error report of the conversion.
	 * 
	 * @param pSchemaElement
	 *            the element on which the error occurred
	 * @param pField
	 *            the field to which the element should correspond
	 */
	public void fieldContentError(SchemaElement pSchemaElement, MTField pField) {
		add(new MT2XmlException(pField.getLineNumberOfTag(), MT2XmlException.ERROR_FIELD_CONTENT, new Object[] {
			pField.getTag()
		}, null));
	}
}
