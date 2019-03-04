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
 * This interface contains a number of constants which are used throughout the
 * schema processing code.
 * 
 * @author SWIFT
 */
public interface SchemaConstants {
	/** The official XML attribute used for specifying XML Namespace declarations. */
	public static final String XMLNS_ATTRIBUTE_NS_URI = "http://www.w3.org/2000/xmlns/";
	/** The official XML attribute used for specifying XML Namespace declarations, {@link #XMLNS_ATTRIBUTE}, Namespace name URI. */
	public static final String XMLNS_ATTRIBUTE = "xmlns";
	/** W3C XML Schema Namespace URI. */
	public static final String W3C_XML_SCHEMA_NS_URI = "http://www.w3.org/2001/XMLSchema";
	/** W3C XML Schema Instance Namespace URI. */
	public static final String W3C_XML_SCHEMA_INSTANCE_NS_URI = "http://www.w3.org/2001/XMLSchema-instance";

	/** MT or system message (old schema version) */
	public static final String BASE_ATTRIBUTE_MESSAGE = "Message";
	/** MT message */
	public static final String BASE_ATTRIBUTE_MTMESSAGE = "MTMessage";
	/** ISO15022 message */
	public static final String BASE_ATTRIBUTE_ISO15022MESSAGE = "ISO15022Message";
	/** system message */
	public static final String BASE_ATTRIBUTE_SYSTEMMESSAGE = "SystemMessage";
	/** full message */
	public static final String BASE_ATTRIBUTE_FULLMESSAGE = "FullMessage";
	/** sequence */
	public static final String BASE_ATTRIBUTE_SEQUENCE = "Sequence";
	/** loop */
	public static final String BASE_ATTRIBUTE_LOOP = "Loop";
	/** choice between sequences */
	public static final String BASE_ATTRIBUTE_SEQUENCEOPTION = "SequenceOption";
	/** field option */
	public static final String BASE_ATTRIBUTE_FIELDOPTION = "FieldOption";
	/** composite field */
	public static final String BASE_ATTRIBUTE_COMPOSITEFIELD = "CompositeField";
	/** sub-sequence */
	public static final String BASE_ATTRIBUTE_SUBSEQUENCE = "SubSequence";
	/** mt field */
	public static final String BASE_ATTRIBUTE_MTFIELD = "MTField";
	/** qualifier */
	public static final String BASE_ATTRIBUTE_QUALIFIER = "Qualifier";
	/** ISO15022 field */
	public static final String BASE_ATTRIBUTE_ISO15022FIELD = "ISO15022Field";
	/** block field */
	public static final String BASE_ATTRIBUTE_BLOCK = "Block";
	/** block field with subblocks */
	public static final String BASE_ATTRIBUTE_BLOCKWITHSUBBLOCKS = "BlockWithSubBlocks";

	/** regular expressions to extract a field tag */
	public static final String FIELD_REGEXP = "F(([0-9]{2}[A-Z]?)|([0-9]{3}))(_[0-9]+)?";
	/** the name of the HEADERS_Type */
	public static final String HEADERS_TYPE = "HEADERS_Type";
	/** the name of the HEADERS_Block1_Type */
	public static final String HEADERS_BLOCK1_TYPE = "HEADERS_Block1_Type";
	/** the name of the HEADERS_Block2_Type */
	public static final String HEADERS_BLOCK2_TYPE = "HEADERS_Block2_Type";
	/** the name of the HEADERS_Block3_Type */
	public static final String HEADERS_BLOCK3_TYPE = "HEADERS_Block3_Type";
	/** the name of the TEXT_Type (block4) */
	public static final String TEXT_TYPE = "TEXT_Type";
	/** the name of the TRAILERS_Type (block5) */
	public static final String TRAILERS_TYPE = "TRAILERS_Type";
	/** the name of the BeginBlock_Type */
	public static final String BEGINBLOCK_TYPE = "BeginBlock_Type";
	/** the name of the EndBlock_Type */
	public static final String ENDBLOCK_TYPE = "EndBlock_Type";

	/** unsupported type */
	public static final int UNSUPPORTED = 0;
	/** block type */
	public static final int SIMPLE_CONTENT_FIELD_BLOCK = 1;
	/** simple field content */
	public static final int SIMPLE_CONTENT_FIELD = 2;
	/** subfield */
	public static final int SIMPLE_CONTENT_SUBFIELD = 3;
	/** complex content */
	public static final int COMPLEX_CONTENT = 4;
	/** MT message complex content */
	public static final int COMPLEX_CONTENT_MTTYPE_MTMESSAGE  = 5;
	/** ISO15022 message complex content */
	public static final int COMPLEX_CONTENT_MTTYPE_ISO15022MESSAGE  = 6;
	/** system message complex content */
	public static final int COMPLEX_CONTENT_MTTYPE_SYSTEMMESSAGE  = 7;
	/** full message complex content */
	public static final int COMPLEX_CONTENT_MTTYPE_FULLMESSAGE  = 8;
	/** sequence complex content */
	public static final int COMPLEX_CONTENT_MTTYPE_SEQUENCE = 9;
	/** loop complex content */
	public static final int COMPLEX_CONTENT_MTTYPE_LOOP = 10;
	/** choice between sequences */
	public static final int COMPLEX_CONTENT_MTTYPE_SEQUENCEOPTION = 11;
	/** field options */
	public static final int COMPLEX_CONTENT_MTTYPE_FIELDOPTION = 12;
	/** composite field */
	public static final int COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD = 13;
	/** sub-sequence complex content */
	public static final int COMPLEX_CONTENT_MTTYPE_SUBSEQUENCE = 14;
	/** qualifier complex content */
	public static final int COMPLEX_CONTENT_MTTYPE_QUALIFIER = 15;
	/** complex iso15022 field */
	public static final int COMPLEX_CONTENT_MTTYPE_ISO15022FIELD = 16;
	/** block field */
	public static final int COMPLEX_CONTENT_MTTYPE_BLOCK = 17;
	/** block field with subblocks */
	public static final int COMPLEX_CONTENT_MTTYPE_BLOCKWITHSUBBLOCKS = 18;
}
