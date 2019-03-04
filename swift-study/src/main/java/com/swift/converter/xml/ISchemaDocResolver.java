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

/**
 * The ISchemaDocResolver interface is used to resolve {@link SchemaDoc} from namespaceURIs. 
 * 
 * @see SchemaDoc
 * 
 * @author SWIFT
 */
public interface ISchemaDocResolver {
	/**
	 * Resolves a {@link SchemaDoc} for a given namespaceURI.
	 *  
	 * @param pNamespaceURI
	 *            The namespaceURI to resolve.
	 * @return the XML schema
	 */
	SchemaDoc resolveSchemaDoc(String pNamespaceURI);
}
