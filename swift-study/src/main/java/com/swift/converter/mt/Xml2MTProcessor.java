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

import java.util.logging.Level;

import org.w3c.dom.Node;

import com.swift.converter.mt.io.MTField;
import com.swift.converter.utils.Log;
import com.swift.converter.utils.PrintableString;
import com.swift.converter.utils.XPathPrinter;
import com.swift.converter.xml.IErrorHandler;
import com.swift.converter.xml.MatchResult;
import com.swift.converter.xml.SchemaConstants;
import com.swift.converter.xml.SchemaDoc;
import com.swift.converter.xml.SchemaElement;
import com.swift.converter.xml.SchemaException;
import com.swift.converter.xml.SchemaHelper;
import com.swift.converter.xml.SchemaInputProcessor;
import com.swift.converter.xml.SchemaMessageProcessor;
import com.swift.converter.xml.SchemaProcessor;

/**
 * A class that provides a processor to convert XML elements into an MT message
 * as defined by the XML Schema document. <br>
 * This class extends the {@link SchemaMessageProcessor} class. <br>
 * 
 * @see SchemaMessageProcessor
 * 
 * @author SWIFT
 */
public class Xml2MTProcessor extends SchemaMessageProcessor {
	/** the logger used by this class */
	private final static Log LOGGER = Log.getLogger(Xml2MTProcessor.class);
	/**
	 * the MT field type to be used (MTField.TYPE_BLOCK for system messages,
	 * MTField.TYPE_MT for user messages)
	 */
	private int mMTFieldType;

	/**
	 * Creates an XML to MT processor for a specified Schema document for
	 * converting an XML version of an MT message into its native MT format.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 * @param pMessageNode
	 *            a message node or message document for which the XML elements
	 *            will be created
	 * @param pErrorHandler
	 *            an error handler instance
	 */
	public Xml2MTProcessor(SchemaDoc pSchemaDoc, Node pMessageNode, IErrorHandler pErrorHandler) {
		super(pSchemaDoc, pMessageNode, pErrorHandler);
		mMTFieldType = MTField.TYPE_UNKNOWN;
	}

	/**
	 * Processes one of the root elements of the XML schema document from the
	 * XML message nodes and validates that all nodes are processed.
	 * <p>
	 * It forwards the call to
	 * {@link SchemaMessageProcessor#processRootElements()} and returns either a
	 * positive match result that holds the MT message or throws a
	 * MT2XmlException.
	 * 
	 * @return a positive match result
	 * @throws Xml2MTException
	 *             when matching failed or when not all input was processed
	 * 
	 * @see SchemaMessageProcessor#processRootElements()
	 */
	public MatchResult process() throws Xml2MTException {
		if (getCurrentMessageNode() == null) {
			return null;
		}
		final MatchResult matchResult = processRootElements();
		if (getCurrentMessageNode() != null) {
			throw new Xml2MTException(getXPath(getCurrentMessageNode()), Xml2MTException.UNEXPECTED_ELEMENT, new Object[] {
				getCurrentMessageNode().getNodeName()
			}, null);
		} else if (!matchResult.isMatched()) {
			throw new Xml2MTException(Xml2MTException.UNEXPECTED_EOF, null, null);
		}
		return matchResult;
	}

	/**
	 * This method handles all the occurrences of the current Schema element. <br>
	 * It forwards the call to
	 * {@link SchemaInputProcessor#processLoop(SchemaElement,int,int)} and makes
	 * all elements optional.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pMinOccurs
	 *            minimum occurrence
	 * @param pMaxOccurs
	 *            maximum occurrence
	 * 
	 * @return a match result
	 * 
	 * @see SchemaInputProcessor#processLoop(SchemaElement,int,int)
	 */
	protected MatchResult processLoop(SchemaElement pSchemaElement, int pMinOccurs, int pMaxOccurs) {
		// make optional if not directly in choice element
		if (!SchemaHelper.isChoiceElement(this)) {
			pMinOccurs = 0;
		}
		return super.processLoop(pSchemaElement, pMinOccurs, pMaxOccurs);
	}

	/**
	 * This method handles a single subfield occurrence of the current Schema
	 * element from the current XML message. <br>
	 * It will also output a loop separator, prefix or suffix if they are
	 * defined for the subfield in the MT message. It forwards the call to
	 * {@link SchemaProcessor#processLoopOccurrence(SchemaElement,int)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pOccurrence
	 *            occurrence of element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processLoopOccurrence(SchemaElement,int)
	 */
	protected MatchResult processLoopOccurrence(SchemaElement pSchemaElement, int pOccurrence) {
		LOGGER.trace(Level.FINEST, "{0} Loop", new Object[] {
				new XPathPrinter(this)
		}, null);
		
		final MatchResult matchResult = super.processLoopOccurrence(pSchemaElement, pOccurrence);
		if (matchResult.size() == 0) {
			return matchResult;
		}

		final String sepPrefix = pSchemaElement.getAppInfoSepPrefix();
		if (sepPrefix != null) {
			LOGGER.trace(Level.FINER, "{0} OUTPUT Prefix={1}", new Object[] {
					new XPathPrinter(this), new PrintableString(sepPrefix)
			}, null);
			matchResult.add(0, sepPrefix);
		}

		final String sepSuffix = pSchemaElement.getAppInfoSepSuffix();
		if (sepSuffix != null) {
			LOGGER.trace(Level.FINER, "{0} OUTPUT Suffix={1}", new Object[] {
					new XPathPrinter(this), new PrintableString(sepSuffix)
			}, null);
			matchResult.add(sepSuffix);
		}

		final SchemaElement parentElement = pSchemaElement.getParent();
		final String separator = parentElement.getAppInfoSeparator();
		if ((separator != null) && (pOccurrence != 0)) {
			LOGGER.trace(Level.FINER, "{0} OUTPUT Loop Separator={1}", new Object[] {
					new XPathPrinter(this), new PrintableString(separator)
			}, null);
			matchResult.add(0, separator);
		}

		return matchResult;
	}

	/**
	 * This method handles a single child element of the current Schema element.
	 * <p>
	 * It will also output a child separator if that is defined for the subfield
	 * in the MT message. It forwards the call to
	 * {@link SchemaProcessor#processChild(SchemaElement,boolean)}.
	 * 
	 * @param pChildElement
	 *            the current schema element
	 * @param pNeedSeparator
	 *            indication that a separator is needed
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processChild(SchemaElement,boolean)
	 */
	protected MatchResult processChild(SchemaElement pChildElement, boolean pNeedSeparator) {
		final MatchResult matchResult = super.processChild(pChildElement, pNeedSeparator);
		if (matchResult.size() == 0) {
			return matchResult;
		}

		final SchemaElement parentElement = pChildElement.getParent();
		final String separator = parentElement.getAppInfoSeparator();
		if ((separator != null) && pNeedSeparator) {
			LOGGER.trace(Level.FINER, "{0} OUTPUT Child Separator={1}", new Object[] {
					new XPathPrinter(this), new PrintableString(separator)
			}, null);
			matchResult.add(0, separator);
		}

		return matchResult;
	}

	/**
	 * This helper method creates a positive match result that holds an
	 * {@link MTField} object for which the content is set to the output of the
	 * next processing method.
	 * <p>
	 * It will also output a qualifier if that is defined for the field in the
	 * MT message.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pMessageNode
	 *            the XML message node that matches the current Schema element
	 * @param pFieldTagName
	 *            tag of the field it must be null for a no-tag field type
	 *            (TYPE_ALL or TYPE_CRLF_ALL)
	 * @param pType
	 *            type of field (TYPE_BLOCK, TYPE_MT, TYPE_ALL or TYPE_CRLF_ALL)
	 * 
	 * @return a match result
	 * @throws Xml2MTException
	 * @see SchemaMessageProcessor#processMessageElement(SchemaElement,Node)
	 */
	private MatchResult processMessageElement(SchemaElement pSchemaElement, Node pMessageNode, String pFieldTagName, int pType)
			throws Xml2MTException {
		try {
			final StringBuffer content = new StringBuffer();
			final String qualifierPrefix = SchemaHelper.getQualifierPrefix(this, pSchemaElement);
			if (qualifierPrefix != null) {
				LOGGER.trace(Level.FINER, "{0} OUTPUT Qualifier={1}", new Object[] {
						new XPathPrinter(this), new PrintableString(qualifierPrefix)
				}, null);
				content.append(qualifierPrefix);
			}
	
			// a node of complex type can have no elements if the original MT field
			// could not be split into subfields (see MT2XmlProcessor). To be able to reproduce the original
			// MT message, the node is processed as a simple type
			final int baseType = pSchemaElement.getBaseType();
			if (((baseType == SchemaConstants.COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD) || (baseType == SchemaConstants.COMPLEX_CONTENT_MTTYPE_BLOCK))
					&& (SchemaHelper.getChildByLocalName(pMessageNode, null) == null)) {
				MatchResult.append(content, processSimpleType(pSchemaElement, null));
			} else {
				MatchResult.append(content, super.processMessageElement(pSchemaElement, pMessageNode));
			}
			LOGGER.trace(Level.FINE, "{0} OUTPUT [{1}]", new Object[] {
					new XPathPrinter(this), new PrintableString(content.toString())
			}, null);
			return new MatchResult(new MTField(pType, pFieldTagName, content.toString(), pMessageNode));
		} catch(SchemaException e) {
			return MatchResult.NOT_MATCHED;
		}
	}

	/**
	 * This method is called when the current XML message node matches the
	 * current Schema element. <br>
	 * It will forward the call to the method
	 * {@link SchemaMessageProcessor#processMessageElement(SchemaElement,Node)}.
	 * Only when the element represents an MT field definition it returns a new
	 * positive match result that holds an {@link MTField} object for which the
	 * content is set to the already generated output.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pMessageNode
	 *            the XML message node that matches the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaMessageProcessor#processMessageElement(SchemaElement,Node)
	 * @see MTField
	 */
	protected MatchResult processMessageElement(SchemaElement pSchemaElement, Node pMessageNode) {
		LOGGER.trace(Level.FINEST, "{0} Process", new Object[] {
				new XPathPrinter(this)
		}, null);

		final int prevMTFieldType = mMTFieldType;
		try {
			final StringBuffer content = new StringBuffer();
			switch (pSchemaElement.getBaseType()) {
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_MTMESSAGE:
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_ISO15022MESSAGE:
				mMTFieldType = MTField.TYPE_MT;
				break;
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_SYSTEMMESSAGE:
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_FULLMESSAGE:
				mMTFieldType = MTField.TYPE_BLOCK;
				break;
			case SchemaConstants.SIMPLE_CONTENT_FIELD_BLOCK:
				final String fieldBlockTagName = SchemaHelper.getFINFieldBlockTagName(pSchemaElement);
				MatchResult.append(content, super.processMessageElement(pSchemaElement, pMessageNode));
				return new MatchResult(new MTField(mMTFieldType, fieldBlockTagName, content.toString(), pMessageNode));
			case SchemaConstants.SIMPLE_CONTENT_FIELD:
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD:
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_BLOCK: 
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_BLOCKWITHSUBBLOCKS:
				if(pSchemaElement.getAppInfoNoTag()) {
					if(pSchemaElement.getAppInfoNoStartOfFieldIndicator()) {
						MatchResult.append(content, super.processMessageElement(pSchemaElement, pMessageNode));
						return new MatchResult(new MTField(MTField.TYPE_ALL, null, content.toString(), pMessageNode));
					} else {
						return processMessageElement(pSchemaElement, pMessageNode, null, MTField.TYPE_CRLF_ALL);
					}
				} else {
					final String fieldTagName = pSchemaElement.getFINFieldTagName();
					if(fieldTagName != null) {
						if(pSchemaElement.getAppInfoCanContainFields()) {
							return processMessageElement(pSchemaElement, pMessageNode, fieldTagName, MTField.TYPE_MT_ALL);
						} else {
							return processMessageElement(pSchemaElement, pMessageNode, fieldTagName, mMTFieldType);
						}
					}
					break;
				}
			}
			return super.processMessageElement(pSchemaElement, pMessageNode);
		} catch (final Xml2MTException e) {
			getErrorHandler().add(e);
			return MatchResult.NOT_MATCHED;
		} finally {
			mMTFieldType = prevMTFieldType;
		}
	}

	/**
	 * This method returns a positive match result that holds the content of all
	 * text or cdata section nodes of the current XML message node. It will
	 * forward the call to the method
	 * {@link SchemaMessageProcessor#processSimpleType(SchemaElement,SchemaElement)}
	 * .
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pTypeElement
	 *            the type element to match from the input
	 * 
	 * @return a positive match result
	 * @see SchemaMessageProcessor#processSimpleType(SchemaElement,SchemaElement)
	 */
	protected MatchResult processSimpleType(SchemaElement pSchemaElement, SchemaElement pTypeElement) {
		final MatchResult matchResult = super.processSimpleType(pSchemaElement, pTypeElement);

		LOGGER.trace(Level.FINER, "{0} OUTPUT Simple [{1}]", new Object[] {
				new XPathPrinter(this), new PrintableString(matchResult)
		}, null);

		if(pTypeElement != null) {
			final String sepPrefix = pTypeElement.getAppInfoSepPrefix();
			if (sepPrefix != null) {
				LOGGER.trace(Level.FINER, "{0} OUTPUT Simple Prefix={1}", new Object[] {
						new XPathPrinter(this), new PrintableString(sepPrefix)
				}, null);
				matchResult.add(0, sepPrefix);
			}

			final String sepSuffix = pTypeElement.getAppInfoSepSuffix();
			if (sepSuffix != null) {
				LOGGER.trace(Level.FINER, "{0} OUTPUT Simple Suffix={1}", new Object[] {
						new XPathPrinter(this), new PrintableString(sepSuffix)
				}, null);
				matchResult.add(sepSuffix);
			}
		}

		return matchResult;
	}
}
