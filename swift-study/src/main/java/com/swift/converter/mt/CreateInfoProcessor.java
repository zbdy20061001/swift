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

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.regex.Pattern;

import com.swift.converter.utils.Log;
import com.swift.converter.utils.PrintableString;
import com.swift.converter.utils.XPathPrinter;
import com.swift.converter.xml.DefaultErrorHandler;
import com.swift.converter.xml.IErrorHandler;
import com.swift.converter.xml.MatchResult;
import com.swift.converter.xml.SchemaDoc;
import com.swift.converter.xml.SchemaElement;
import com.swift.converter.xml.SchemaException;
import com.swift.converter.xml.SchemaHelper;
import com.swift.converter.xml.SchemaProcessor;

/**
 * A class that adds additional processing information to the elements of an XML
 * Schema document. <br>
 * 
 * @see SchemaProcessor
 * 
 * @author SWIFT
 */
public class CreateInfoProcessor extends SchemaProcessor {
	/** the logger used by this class */
	private final static Log LOGGER = Log.getLogger(CreateInfoProcessor.class);
	/** property to identify that the additional information is already added */
	private final static String IS_PROCESSED_PROPERTY = "CreateInfoProcessor:isProcessed"; // Boolean
	/** property that holds the pattern to be used for a schema element */
	public final static String PATTERN_PROPERTY = "CreateInfoProcessor:pattern"; // String
	/** property that the compiled pattern */
	public final static String COMPILED_PATTERN_PROPERTY = "CreateInfoProcessor:compiledPattern"; // String

	/** annotation properties for schemas up to 2008 */
	private static String[][] sSchemaElementPropertiesForOldSchemasUpTo2008 = {
		{ "annotation.appinfo.LookAheadPattern","F19A/Sign","[A-Z]{3}" },
		{ "annotation.appinfo.LookAheadPattern","26C/Availability","/[A-Z]{5}[A-Z]{4}([0-9a-zA-Z/\\-\\?:\\(\\)\\.,';\\+ ]{1,4})?(//[0-9a-zA-Z/\\-\\?:\\(\\)\\.,'\\+ ]{1,8})?$" },
		{ "annotation.appinfo.LookAheadPattern","26C/Denomination","(//[0-9a-zA-Z/\\-\\?:\\(\\)\\.,'\\+ ]{1,8})?$" },
		{ "annotation.appinfo.LookAheadPattern","F32H/Sign","[A-Z]{3}" },
		{ "annotation.appinfo.LookAheadPattern","F34E/Sign","[A-Z]{3}" },
		{ "annotation.appinfo.LookAheadPattern","F35H/Sign","[A-Z]{3}" },
		{ "annotation.appinfo.LookAheadPattern","F41D/NameAndAddress","\r\n" },
		{ "annotation.appinfo.LookAheadPattern","F61/DebitCreditMark","([A-Z])?" },
		{ "annotation.appinfo.LookAheadPattern","F61/ReferenceForAccountOwner","(//[0-9a-zA-Z/\\-\\?:\\(\\)\\.,'\\+ ]{1,16})?(\r\n[0-9a-zA-Z/\\-\\?:\\(\\)\\.,'\\+ ]{1,34})?$" },
		{ "annotation.appinfo.CanContainFields","77E","true" },
		{ "annotation.appinfo.CanContainFields","77S","true" },
		{ "annotation.appinfo.CanContainFields","77T","true" },
		{ "annotation.appinfo.CanContainFields","92/NOTAG","true" },	// MTx92
		{ "annotation.appinfo.CanContainFields","95/NOTAG","true" },	// MTx95
		{ "annotation.appinfo.CanContainFields","96/NOTAG","true" },	// MTx96
		{ "annotation.appinfo.CanContainFields","98/NOTAG","true" },	// MTx98
		{ "annotation.appinfo.NoTag","NOTAG","true" },
		{ "annotation.appinfo.NoStartOfFieldIndicator","MT121/NOTAG","true" }
	};
	
	private static final Map/* <String, Pattern> */COMPILED_PATTERNS = new HashMap/* <String, Pattern> */();

	/** subfield matching enable flag */
	private boolean mSubFieldMatching;

	/**
	 * Creates a Schema info processor for a specified Schema document and error handler.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 * @param pErrorHandler
	 *            an error handler instance
	 */
	public CreateInfoProcessor(SchemaDoc pSchemaDoc, IErrorHandler pErrorHandler) {
		super(pSchemaDoc, pErrorHandler);
	}

	/**
	 * Creates a Schema info processor for a specified Schema document.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 */
	public CreateInfoProcessor(SchemaDoc pSchemaDoc) {
		this(pSchemaDoc, new DefaultErrorHandler());
	}

	/**
	 * This method is the first processing method. <br>
	 * It only forwards the call to
	 * {@link SchemaProcessor#processStart(SchemaElement)} once to avoid .
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processStart(SchemaElement)
	 */
	protected MatchResult processStart(SchemaElement pSchemaElement) {
		// if already processed, return immediately
		final Boolean isProcessed = (Boolean) pSchemaElement.getProperty(IS_PROCESSED_PROPERTY);
		if ((isProcessed != null) && isProcessed.booleanValue()) {
			return MatchResult.MATCHED;
		}
		pSchemaElement.setProperty(IS_PROCESSED_PROPERTY, Boolean.TRUE);

		return super.processStart(pSchemaElement);
	}

	/**
	 * This method is called for an element definition. <br>
	 * It will forward the call to the method
	 * {@link SchemaProcessor#processElement(SchemaElement)} and identifies when
	 * the element is representing a field with subfield.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processElement(SchemaElement)
	 */
	protected MatchResult processElement(SchemaElement pSchemaElement) {
		if (getSchemaDoc().isOldFormatUpTo2008()) {
			// trigger cache population
			pSchemaElement.getAppInfo(null);
			final String xpath = getXPath();
			for(int i=0;i<sSchemaElementPropertiesForOldSchemasUpTo2008.length;i++) {
				if (xpath.endsWith(sSchemaElementPropertiesForOldSchemasUpTo2008[i][1])) {
					final String property = (String) pSchemaElement.getProperty(sSchemaElementPropertiesForOldSchemasUpTo2008[i][0]);
					if(property == null || property.length() == 0) {
						LOGGER.trace(Level.FINEST, "{0} Set {1} to {2}", new Object[] { xpath,sSchemaElementPropertiesForOldSchemasUpTo2008[i][0], sSchemaElementPropertiesForOldSchemasUpTo2008[i][2] }, null);
						pSchemaElement.setProperty(sSchemaElementPropertiesForOldSchemasUpTo2008[i][0], sSchemaElementPropertiesForOldSchemasUpTo2008[i][2]);
					}
				}
			}
			// getBaseType() depends on getAppInfoNoTag() which can be changed when calling setProperty 
			pSchemaElement.resetBaseType();
		}
		
		if (mSubFieldMatching) {
			return super.processElement(pSchemaElement);
		} else {
			final String fieldTagName = pSchemaElement.getFINFieldTagName();
			if (fieldTagName != null) {
				mSubFieldMatching = true;
				final MatchResult result = super.processElement(pSchemaElement);
				mSubFieldMatching = false;
				return result;
			} else {
				return super.processElement(pSchemaElement);
			}
		}
	}

	/**
	 * Adds additional processing information to the current Schema element.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pTypeElement
	 *            the type element to match from the input
	 * @return a positive empty match result
	 */
	protected MatchResult processSimpleType(SchemaElement pSchemaElement, SchemaElement pTypeElement) {
		try {
			final StringBuffer pattern = new StringBuffer();
			final String matchUntilPattern = pSchemaElement.getAppInfoMatchUntilPattern();
			final String lookAheadPattern = pSchemaElement.getAppInfoLookAheadPattern();
			final boolean hasLookAheadPattern = (lookAheadPattern != null) && (lookAheadPattern.length() > 0);
	
			if (!mSubFieldMatching) {
				// This part is only executed to match NOTAG elements
				// The type information for NOTAG is not used and all remaining data
				// is returned as text
				pattern.append(".*");
			} else {
				final String schemaPattern = pTypeElement.getPattern();
	
				if ((schemaPattern == null) || SchemaHelper.mustMatchContent(pSchemaElement) || hasLookAheadPattern) {
					final String type = pTypeElement.getSimpleBaseType();
					if (type.equals("string")) {
						final String[] enums = pTypeElement.getEnumerations();
						if (enums != null) {
							for (int i = 0; i < enums.length; i++) {
								if (pattern.length() != 0) {
									pattern.append('|');
								}
								pattern.append(enums[i]);
							}
						} else {
							pattern.append(schemaPattern);
						}
					} else if (type.equals("int")) {
						pattern.append("[0-9]*");
					}
				} else {
					pattern.append(schemaPattern);
				}
			}
	
			pSchemaElement.setProperty(PATTERN_PROPERTY, pattern.toString());
			if (matchUntilPattern != null) {
				pSchemaElement.setProperty(COMPILED_PATTERN_PROPERTY, compile(matchUntilPattern.toString()));
			} else if (hasLookAheadPattern) {
				pSchemaElement.setProperty(COMPILED_PATTERN_PROPERTY, compile("(" + pattern.toString() + ")"
						+ lookAheadPattern.toString()));
			} else {
				pSchemaElement.setProperty(COMPILED_PATTERN_PROPERTY, compile(pattern.toString()));
			}
			LOGGER.trace(Level.FINEST, "{0} Pattern={1}", new Object[] {
					new XPathPrinter(this), new PrintableString(pattern)
			}, null);
			return MatchResult.MATCHED;
		} catch (SchemaException e) {
			getErrorHandler().add(e);
			return MatchResult.NOT_MATCHED;
		}
	}

	/**
	 * Get the pattern from the collection of compiled patterns or compile it
	 * and store it there
	 * 
	 * @param pString
	 *            the pattern to compile
	 * @return the compiled pattern
	 */
	private Pattern compile(String pString) {
		synchronized (COMPILED_PATTERNS) {
			Pattern pattern = (Pattern) COMPILED_PATTERNS.get(pString);
			if (pattern == null) {
				pattern = Pattern.compile(pString);
				COMPILED_PATTERNS.put(pString, pattern);
			}
			return pattern;
		}
	}
}
