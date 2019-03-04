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

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Comment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import com.swift.converter.io.LineNumberPushbackReader;
import com.swift.converter.mt.io.MTField;
import com.swift.converter.mt.io.MTFieldReader;
import com.swift.converter.mt.io.MTSubFieldReader;
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

/**
 * A class that provides a processor to convert MT input into XML elements as
 * defined by the XML Schema document. <br>
 * This class extends the {@link MTInputProcessor} class. <br>
 * 
 * @see MTInputProcessor
 * 
 * @author SWIFT
 */
public class MT2XmlProcessor extends MTInputProcessor {
	/**
	 * The maximum size of a message, this is used as buffer in the push back
	 * readers
	 */
	public static final int MT_MAX_MSGSIZE = 30 * 1024;
	/** the logger used by this class */
	private final static Log LOGGER = Log.getLogger(MT2XmlProcessor.class);
	/** the current MT field reader */
	private MTFieldReader mReader;
	/**
	 * the MT field type to be used (MTField.TYPE_BLOCK for system messages,
	 * MTField.TYPE_MT for user messages)
	 */
	private int mMTFieldType;
	/**
	 * last pNeedChildSeparator argument from
	 * {@link #processSubFieldChild(SchemaElement,boolean)}
	 */
	private boolean mNeedChildSeparator;

	/** message application found in input */
	private String mMessageApplication = null;
	/** message type found in input */
	private String mMessageType = null;
	/** message variant found in input */
	private String mMessageVariant = null;
	
	/**
	 * Creates an MT to XML processor for a specified Schema document that
	 * converts the input from the specified MT field reader into XML elements.
	 * Errors are reported via the specified error handler.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 * @param pReader
	 *            an MT field reader
	 * @param pMessageNode
	 *            a message node or message document for which the XML elements
	 *            will be created
	 * @param pErrorHandler
	 *            an error handler instance
	 */
	public MT2XmlProcessor(SchemaDoc pSchemaDoc, MTFieldReader pReader, Node pMessageNode, IErrorHandler pErrorHandler) {
		super(pSchemaDoc, pMessageNode, pErrorHandler);

		mReader = pReader;
		mMTFieldType = MTField.TYPE_UNKNOWN;
	}

	/**
	 * Processes one of the root elements of the XML schema document from the
	 * the current field reader and validates that all input has been processed.
	 * <p>
	 * It forwards the call to
	 * {@link SchemaInputProcessor#processRootElements()} and returns either a
	 * positive match result that holds the root XML Element node or throws an
	 * MT2XmlException.
	 * 
	 * @return a positive match result
	 * @throws MT2XmlException
	 *             when matching failed or when not all input was processed
	 * 
	 * @see SchemaInputProcessor#processRootElements()
	 */
	public MatchResult process() throws MT2XmlException {
		final MatchResult matchResult = processRootElements();
		return postProcess(matchResult);
	}

	/**
	 * Post process a final match result.<br>
	 * This method throws an {@link Xml2MTException} when matching failed or when not
	 * all input was processed.
	 * 
	 * @param pMatchResult
	 *            the final match result.
	 * @return the match result
	 * @throws Xml2MTException
	 *             when matching failed or when not all input was processed
	 * 
	 * @see MT2XmlProcessor#process()
	 * @see MT2XmlProcessor#matchFieldContent(SchemaElement, int)()
	 */
	private MatchResult postProcess(MatchResult pMatchResult) throws MT2XmlException {
		if (mReader.getLookahead() != null) {
			final MTField field = mReader.getMaxLookahead();
			if (field != null) {
				throw new MT2XmlException(field.getLineNumberOfTag(), MT2XmlException.UNEXPECTED_FIELD, new Object[] {
					field.getTag()
				}, null);
			} else {
				throw new MT2XmlException(mReader.getReader().getLineNumber(), MT2XmlException.UNEXPECTED_EOF, null, null);
			}
		} else if (!pMatchResult.isMatched()) {
			throw new MT2XmlException(mReader.getReader().getLineNumber(), MT2XmlException.UNEXPECTED_EOF, null, null);
		}
		return pMatchResult;
	}
	
	/**
	 * This method matches a single field occurrence of the current Schema
	 * element from the current field reader. <br>
	 * It forwards the call to
	 * {@link MTInputProcessor#processFieldLoopOccurrence(SchemaElement,int)}
	 * but leaves the current field reader unchanged when a negative match is
	 * returned.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pOccurrence
	 *            occurrence of element
	 * 
	 * @return a match result
	 * 
	 * @see MTInputProcessor#processFieldLoopOccurrence(SchemaElement,int)
	 */
	protected MatchResult processFieldLoopOccurrence(SchemaElement pSchemaElement, int pOccurrence) {
		final int savedPosition = mReader.getPosition();

		final MatchResult matchResult = super.processFieldLoopOccurrence(pSchemaElement, pOccurrence);
		if (!matchResult.isMatched()) {
			mReader.restorePosition(savedPosition);
			return MatchResult.NOT_MATCHED;
		}

		final String lookAheadField = pSchemaElement.getAppInfoLookAheadField();
		if(lookAheadField != null) {
			if (!mReader.check(mMTFieldType, lookAheadField)) {
				LOGGER.trace(Level.FINEST, "{0} FAIL LookAheadField={1}", new Object[] {
						new XPathPrinter(this), new PrintableString(lookAheadField)
				}, null);
				mReader.restorePosition(savedPosition);
				return MatchResult.NOT_MATCHED;
			}
			LOGGER.trace(Level.FINER, "{0} MATCH LookAheadField={1}", new Object[] {
					new XPathPrinter(this), new PrintableString(lookAheadField)
			}, null);
		}
		
		return matchResult;
	}

	/**
	 * This method matches a single subfield occurrence of the current Schema
	 * element from the current subfield reader. <br>
	 * It will also match the separator, prefix or suffix if they are defined
	 * for the subfield in the MT message. It forwards the call to
	 * {@link MTInputProcessor#processSubFieldLoopOccurrence(SchemaElement,int)}
	 * but leaves the current subfield reader unchanged when a negative match is
	 * returned.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pOccurrence
	 *            occurrence of element
	 * 
	 * @return a match result
	 * 
	 * @see MTInputProcessor#processSubFieldLoopOccurrence(SchemaElement,int)
	 */
	protected MatchResult processSubFieldLoopOccurrence(SchemaElement pSchemaElement, int pOccurrence) {
		final int savedPosition = getSubFieldReader().getPosition();
		final SchemaElement parentInfo = pSchemaElement.getParent();
		final String separator = parentInfo.getAppInfoSeparator();
		if ((separator != null) && (mNeedChildSeparator || (pOccurrence != 0))) {
			LOGGER.trace(Level.FINEST, "{0} INPUT [{1}] Separator={2}", new Object[] {
					new XPathPrinter(this), new PrintableString(getSubFieldReader().getContentLeft()),
					new PrintableString(separator)
			}, null);
			if (!getSubFieldReader().match(separator)) {
				return MatchResult.NOT_MATCHED;
			}
			LOGGER.trace(Level.FINER, "{0} MATCH [{1}] " + (pOccurrence != 0 ? "Loop Separator" : "Child Separator"), new Object[] {
					new XPathPrinter(this), new PrintableString(separator)
			}, null);
		}

		final String prefix = pSchemaElement.getAppInfoSepPrefix();
		if (prefix != null) {
			LOGGER.trace(Level.FINEST, "{0} INPUT [{1}] Prefix={2}", new Object[] {
					new XPathPrinter(this), new PrintableString(getSubFieldReader().getContentLeft()), new PrintableString(prefix)
			}, null);
			if (!getSubFieldReader().match(prefix)) {
				getSubFieldReader().restorePosition(savedPosition);
				return MatchResult.NOT_MATCHED;
			}
			LOGGER.trace(Level.FINER, "{0} MATCH [{1}] Prefix", new Object[] {
					new XPathPrinter(this), new PrintableString(prefix)
			}, null);
		}

		final MatchResult matchResult = super.processSubFieldLoopOccurrence(pSchemaElement, pOccurrence);
		if (!matchResult.isMatched()) {
			getSubFieldReader().restorePosition(savedPosition);
			return MatchResult.NOT_MATCHED;
		}

		final String suffix = pSchemaElement.getAppInfoSepSuffix();
		if (suffix != null) {
			LOGGER.trace(Level.FINEST, "{0} INPUT [{1}] Suffix={2}", new Object[] {
					new XPathPrinter(this), new PrintableString(getSubFieldReader().getContentLeft()), new PrintableString(suffix)
			}, null);
			if (!getSubFieldReader().match(suffix)) {
				getSubFieldReader().restorePosition(savedPosition);
				return MatchResult.NOT_MATCHED;
			}
			LOGGER.trace(Level.FINER, "{0} MATCH [{1}] Suffix", new Object[] {
					new XPathPrinter(this), new PrintableString(suffix)
			}, null);
		}

		return matchResult;
	}

	/**
	 * This method forwards the call to
	 * {@link MTInputProcessor#processFieldChoiceChild(SchemaElement)}
	 * but returns an unmatched result in case no input was processed.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see MTInputProcessor#processFieldChoiceChild(SchemaElement)
	 */
	protected MatchResult processFieldChoiceChild(SchemaElement pSchemaElement) {
		final int savedPosition = mReader.getPosition();

		final MatchResult matchResult = super.processFieldChoiceChild(pSchemaElement);
		
		if(matchResult.isMatched() && savedPosition == mReader.getPosition()) {
			LOGGER.trace(Level.FINER, "{0} NO MATCH", new Object[] {
					new XPathPrinter(this)
			}, null);
			return MatchResult.NOT_MATCHED;
		}

		return matchResult;
	}

	/**
	 * This method forwards the call to
	 * {@link MTInputProcessor#processSubFieldChoiceChild(SchemaElement)}
	 * but returns an unmatched result in case no input was processed.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see MTInputProcessor#processSubFieldChoiceChild(SchemaElement)
	 */
	protected MatchResult processSubFieldChoiceChild(SchemaElement pSchemaElement) {
		final int savedPosition = getSubFieldReader().getPosition();

		final MatchResult matchResult = super.processSubFieldChoiceChild(pSchemaElement);
		
		if(matchResult.isMatched() && savedPosition == getSubFieldReader().getPosition()) {
			LOGGER.trace(Level.FINER, "{0} NO MATCH", new Object[] {
					new XPathPrinter(this)
			}, null);
			return MatchResult.NOT_MATCHED;
		}

		return matchResult;
	}
	
	/**
	 * This method handles a single child subfield element of the current Schema
	 * element.
	 * <p>
	 * It forwards the call to
	 * {@link MTInputProcessor#processSubFieldChild(SchemaElement,boolean)}.
	 * 
	 * @param pChildElement
	 *            the current schema element
	 * @param pNeedSeparator
	 *            indication that a separator is needed
	 * 
	 * @return a match result
	 * 
	 * @see MTInputProcessor#processSubFieldChild(SchemaElement,boolean)
	 */
	protected MatchResult processSubFieldChild(SchemaElement pChildElement, boolean pNeedSeparator) {
		// a child separator is also optional when its element is optional, so
		// it should be matched in processSubFieldLoopOccurrence()
		mNeedChildSeparator = pNeedSeparator;
		return super.processSubFieldChild(pChildElement, pNeedSeparator);
	}

	/**
	 * This helper method matches a field with specified type from the current
	 * field reader, prepares a subfield reader with the content of the field
	 * and starts subfield matching. <br>
	 * It starts to match a qualifier prefix if that is defined for the field in
	 * the MT message. <br>
	 * A positive match result holds an XML Element node of the current Schema
	 * element with the objects of the matched subfields as child nodes.<br>
	 * 
	 * @param pSchemaElement
	 *            the schema element for which the content is matched.
	 * @param pMTFieldType
	 *            the field type to read from the input (MTField.TYPE_xxx)
	 * 
	 * @return a match result.
	 */
	private MatchResult matchSubFieldsFromFieldContent(SchemaElement pSchemaElement, int pMTFieldType) {
		try {
			final MTField field = mReader.getLookahead(pMTFieldType);
			subFieldMatchingBegin(new MTSubFieldReader(field.getContent()));

			// If a qualifier was used, we should match it from the content of
			// the field
			final String qualifierPrefix = SchemaHelper.getQualifierPrefix(this, pSchemaElement);
			if (qualifierPrefix != null) {
				LOGGER.trace(Level.FINEST, "{0} [{1}] INPUT [{2}] Qualifier={3}", new Object[] {
						new XPathPrinter(this), new Integer(field.getLineNumberOfTag()),
						new PrintableString(getSubFieldReader().getContentLeft()), new PrintableString(qualifierPrefix)
				}, null);
				if (!getSubFieldReader().match(qualifierPrefix)) {
					return MatchResult.NOT_MATCHED;
				}
				LOGGER.trace(Level.FINER, "{0} MATCH [{1}] Qualifier", new Object[] {
						new XPathPrinter(this), new PrintableString(qualifierPrefix)
				}, null);
			} else {
				LOGGER.trace(Level.FINEST, "{0} [{1}] INPUT [{2}]", new Object[] {
						new XPathPrinter(this), new Integer(field.getLineNumberOfTag()),
						new PrintableString(getSubFieldReader().getContentLeft())
				}, null);
			}

			final String fieldContent = getSubFieldReader().getContentLeft();
			final MatchResult matchResult = super.processFieldElement(pSchemaElement);
			final String fieldContentAfter = getSubFieldReader().getContentLeft();

			// Check if the content of the field need to match too
			// (this is to determine the correct sequence for start/stop tags
			// like 16R,16S)
			if ((!matchResult.isMatched() || (fieldContentAfter.length() != 0)) && SchemaHelper.mustMatchContent(pSchemaElement)) {
				return MatchResult.NOT_MATCHED;
			}

			mReader.match(pMTFieldType);
			final Element newMessageElement = pSchemaElement.createElementNS(getMessageDoc(),getSchemaDoc());
			field.setUserItem(newMessageElement);

			if (fieldContentAfter.length() == 0) {
				appendChild(newMessageElement, matchResult);
			} else {
				LOGGER.trace(Level.FINER, "{0} [{1}] INPUT [{2}] ERROR:Unmatched", new Object[] {
						new XPathPrinter(this), new Integer(field.getLineNumberOfTag()), new PrintableString(fieldContentAfter)
				}, null);

				final Text newTextNode = getMessageDoc().createTextNode(fieldContent);
				newMessageElement.appendChild(newTextNode);

				getErrorHandler().fieldContentError(pSchemaElement, field);
			}

			final MatchResult result = new MatchResult();
			final Comment lineCommentNode = getMessageDoc().createComment("line=" + field.getLineNumberOfTag());
			result.add(lineCommentNode);
			result.add(newMessageElement);
			return result;
		} catch (final IOException e) {
			return MatchResult.NOT_MATCHED;
		} catch (final SchemaException e) {
			return MatchResult.NOT_MATCHED;
		} catch (final MT2XmlException e) {
			return MatchResult.NOT_MATCHED;
		} finally {
			subFieldMatchingEnd();
		}
	}

	/**
	 * This helper method matches a field with specified type from the current
	 * field reader. <br>
	 * A positive match result holds an XML Element node of the current Schema
	 * element and a child XML Text node that holds the field content.
	 * 
	 * @param pSchemaElement
	 *            the schema element for which the content is matched.
	 * @param pMTFieldType
	 *            the field type to read from the input (MTField.TYPE_xxx)
	 * 
	 * @return a match result.
	 */
	private MatchResult matchField(SchemaElement pSchemaElement, int pMTFieldType) {
		try {
			final MTField field = mReader.match(pMTFieldType);

			LOGGER.trace(Level.FINEST, "{0} [{1}] INPUT [{2}]", new Object[] {
					new XPathPrinter(this), new Integer(field.getLineNumberOfTag()),
					new PrintableString(field.getContent())
			}, null);
			
			final Element newMessageElement = pSchemaElement.createElementNS(getMessageDoc(),getSchemaDoc());
			field.setUserItem(newMessageElement);
			final Text newTextNode = getMessageDoc().createTextNode(field.getContent());
			newMessageElement.appendChild(newTextNode);
			return new MatchResult(newMessageElement);
		} catch (final IOException e) {
			return MatchResult.NOT_MATCHED;
		} catch (final MT2XmlException e) {
			return MatchResult.NOT_MATCHED;
		}
	}

	/**
	 * This helper method matches a field with specified type from the current
	 * field reader, prepares a new field reader with the content of the field
	 * and starts field matching. <br>
	 * A positive match result holds an XML Element node of the current Schema
	 * element with the objects of the matched fields as child nodes.<br>
	 * 
	 * @param pSchemaElement
	 *            the schema element for which the content is matched.
	 * @param pMTFieldType
	 *            the field type to read from the input (MTField.TYPE_xxx)
	 * 
	 * @return a match result.
	 */
	private MatchResult matchFieldsFromFieldContent(SchemaElement pSchemaElement, int pMTFieldType) {
		final MTFieldReader prevReader = mReader;
		
		try {
			final MTField field = prevReader.getLookahead(pMTFieldType);
			final int lineNumber = field.getLineNumberOfTag();
			final String content = field.getContent();

			LOGGER.trace(Level.FINEST, "{0} [{1}] INPUT [{2}]", new Object[] {
					new XPathPrinter(this), new Integer(lineNumber),
					new PrintableString(content)
			}, null);
			
			// use new field reader with content of field
			final StringReader stringReader = new StringReader(content);
			final PushbackReader pbReader = new PushbackReader(stringReader, MT_MAX_MSGSIZE);
			final LineNumberPushbackReader lineReader = new LineNumberPushbackReader(pbReader);
			lineReader.setLineNumber(lineNumber);
			mReader = new MTFieldReader(lineReader);
			
			final MatchResult matchResult = super.processFieldElement(pSchemaElement);
			try {
				postProcess(matchResult);
			} catch (final MT2XmlException e) {
				getErrorHandler().add(e);
			}
			prevReader.match(pMTFieldType);
			final Element newMessageElement = pSchemaElement.createElementNS(getMessageDoc(),getSchemaDoc());
			field.setUserItem(newMessageElement);

			if (matchResult.isMatched()) {
				appendChild(newMessageElement, matchResult);
			} else {
				LOGGER.trace(Level.FINER, "{0} [{1}] INPUT [{2}] ERROR:Unmatched", new Object[] {
						new XPathPrinter(this), new Integer(lineNumber), new PrintableString(content)
				}, null);

				final Text newTextNode = getMessageDoc().createTextNode(content);
				newMessageElement.appendChild(newTextNode);

				getErrorHandler().fieldContentError(pSchemaElement, field);
				return matchResult;
			}
			
			final MatchResult result = new MatchResult();
			final Comment lineCommentNode = getMessageDoc().createComment("line=" + lineNumber);
			result.add(lineCommentNode);
			result.add(newMessageElement);
			return result;
		} catch (final IOException e) {
			return MatchResult.NOT_MATCHED;
		} catch (final MT2XmlException e) {
			return MatchResult.NOT_MATCHED;
		} finally {
			mReader = prevReader;
		}
	}

	/**
	 * This helper method matches a field with specified type from the current
	 * subfield reader, prepares a new field reader with the content of the subfield
	 * and restarts field matching. <br>
	 * A positive match result holds an XML Element node of the current Schema
	 * element with the objects of the matched fields as child nodes.<br>
	 * 
	 * @param pSchemaElement
	 *            the schema element for which the content is matched.
	 * @param pMTFieldType
	 *            the field type to read from the input (MTField.TYPE_xxx)
	 * 
	 * @return a match result.
	 */
	private MatchResult matchFieldFromSubFieldContent(SchemaElement pSchemaElement, int pMTFieldType) {
		final MTFieldReader prevReader = mReader;
		final MTSubFieldReader prevSubFieldReader = getSubFieldReader();

		try {
			final MTField field = prevReader.getLookahead(pMTFieldType);
			final int lineNumber = field.getLineNumberOfTag();
			final String content = getSubFieldReader().getContentLeft();

			LOGGER.trace(Level.FINEST, "{0} [{1}] INPUT [{2}]", new Object[] {
					new XPathPrinter(this), new Integer(lineNumber),
					new PrintableString(content)
			}, null);
			
			// use new field reader with remaining content of field
			final StringReader stringReader = new StringReader(content);
			final PushbackReader pbReader = new PushbackReader(stringReader, MT_MAX_MSGSIZE);
			final LineNumberPushbackReader lineReader = new LineNumberPushbackReader(pbReader);
			lineReader.setLineNumber(lineNumber);
			mReader = new MTFieldReader(lineReader);
			subFieldMatchingEnd();
			
			final MatchResult matchResult = processFieldElement(pSchemaElement);

			// match the data that has been processed from the content of the field
			mReader.unreadLookahead();
			prevSubFieldReader.match(mReader.getReader().getPosition());
			
			return matchResult;
		} catch (final IOException e) {
			return MatchResult.NOT_MATCHED;
		} catch (final MT2XmlException e) {
			return MatchResult.NOT_MATCHED;
		} finally {
			subFieldMatchingBegin(prevSubFieldReader);
			mReader = prevReader;
		}
	}
	
	/**
	 * Checks if the next input field matches the specific type and tag.
	 * 
	 * @param pMTFieldType
	 *            the expected field type (MTField.TYPE_BLOCK, MTField.TYPE_MT)
	 * @param pTag
	 *            the expected field tag
	 * @return true if the next input field matches the specific field type and
	 *         tag
	 */
	private boolean checkISO15022Field(int pMTFieldType, String pTag) {
		try {
			final MTField lookahead = mReader.getLookahead(pMTFieldType);
			return lookahead.getTag().startsWith(pTag);
		} catch (final IOException e) {
			return false;
		} catch (final MT2XmlException e) {
			return false;
		}
	}
	
	/**
	 * This method matches a field of the current Schema element from the
	 * current field reader.<br>
	 * When the the current Schema element doesn't represent a field, it
	 * forwards the call to
	 * {@link MTInputProcessor#processFieldElement(SchemaElement)}.<br>
	 * A positive match result holds an XML Element node of the current Schema
	 * element with the objects of the matched input as child nodes.<br>
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see MTInputProcessor#processFieldElement(SchemaElement)
	 */
	protected MatchResult processFieldElement(SchemaElement pSchemaElement) {
		LOGGER.trace(Level.FINEST, "{0} Field", new Object[] {
				new XPathPrinter(this)
		}, null);

		if(pSchemaElement.getAppInfoMessageApplication() != null) {
			mMessageApplication = pSchemaElement.getAppInfoMessageApplication(); 
			mMessageType = null; 
			mMessageVariant = null;
			LOGGER.trace(Level.FINER, "{0} Message Application={1}", new Object[] {
					new XPathPrinter(this), mMessageApplication
			}, null);
		}
		
		final int prevMTFieldType = mMTFieldType;
		try {
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
				if (!mReader.check(mMTFieldType, fieldBlockTagName)) {
					return MatchResult.NOT_MATCHED;
				}
				return matchField(pSchemaElement, mMTFieldType);
			case SchemaConstants.SIMPLE_CONTENT_FIELD:
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD:
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_BLOCK:
				if(pSchemaElement.getAppInfoNoTag()) {
					if(pSchemaElement.getAppInfoNoStartOfFieldIndicator()) {
						return matchField(pSchemaElement, MTField.TYPE_ALL);
					} else if(pSchemaElement.getBaseType() == SchemaConstants.SIMPLE_CONTENT_FIELD) {
						return matchField(pSchemaElement, MTField.TYPE_CRLF_ALL);
					} else {
						return matchSubFieldsFromFieldContent(pSchemaElement, MTField.TYPE_CRLF_ALL);
					}
				} else {
					final String fieldTagName = pSchemaElement.getFINFieldTagName();
					if (!mReader.check(mMTFieldType, fieldTagName)) {
						return MatchResult.NOT_MATCHED;
					}
					if(pSchemaElement.getAppInfoCanContainFields()) {
						return matchSubFieldsFromFieldContent(pSchemaElement, MTField.TYPE_MT_ALL);
					} else {
						return matchSubFieldsFromFieldContent(pSchemaElement, mMTFieldType);
					}
				}
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_BLOCKWITHSUBBLOCKS:
				final String fieldTagName = pSchemaElement.getFINFieldTagName();
				if (!mReader.check(mMTFieldType, fieldTagName)) {
					return MatchResult.NOT_MATCHED;
				}
				// a call to matchSubFieldsFromFieldContent() would also work, but then for every field, 
				// matchFieldFromSubFieldContent() will be called (which has more overhead)
				return matchFieldsFromFieldContent(pSchemaElement, mMTFieldType);
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_ISO15022FIELD:
				final String iso15022FieldTagName = pSchemaElement.getISO15022FieldTagName();
				// avoid unnecessary processing
				if (!checkISO15022Field(mMTFieldType, iso15022FieldTagName)) {
					return MatchResult.NOT_MATCHED;
				}
				// do default processing
			}
			
			final MatchResult matchResult = super.processFieldElement(pSchemaElement);
			
			if (!matchResult.isMatched()) {
				return matchResult;
			} else if (matchResult.size() == 0) {
				switch (pSchemaElement.getBaseType()) {
				case SchemaConstants.COMPLEX_CONTENT_MTTYPE_MTMESSAGE:
				case SchemaConstants.COMPLEX_CONTENT_MTTYPE_ISO15022MESSAGE:
				case SchemaConstants.COMPLEX_CONTENT_MTTYPE_SYSTEMMESSAGE:
				case SchemaConstants.COMPLEX_CONTENT_MTTYPE_FULLMESSAGE:
					break;
				default:
					// in case of a matched result with no elements we will not
					// create a new element with no children
					return matchResult;
				}
			}

			final Element newMessageElement = pSchemaElement.createElementNS(getMessageDoc(),getSchemaDoc());
			appendChild(newMessageElement, matchResult);
			return new MatchResult(newMessageElement);
		} finally {
			mMTFieldType = prevMTFieldType;
		}
	}

	/**
	 * This method is called for an subfield element definition. <br>
	 * It forwards the call to
	 * {@link MTInputProcessor#processElement(SchemaElement)}.<br>
	 * A positive match result holds an XML Element node of the current Schema
	 * element with the objects of the matched input as child nodes.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see MTInputProcessor#processElement(SchemaElement)
	 */
	protected MatchResult processSubFieldElement(SchemaElement pSchemaElement) {
		LOGGER.trace(Level.FINEST, "{0} SubField", new Object[] {
				new XPathPrinter(this)
		}, null);
		
		switch (pSchemaElement.getBaseType()) {
		case SchemaConstants.SIMPLE_CONTENT_FIELD:
		case SchemaConstants.COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD:
		case SchemaConstants.COMPLEX_CONTENT_MTTYPE_BLOCK:
		case SchemaConstants.COMPLEX_CONTENT_MTTYPE_BLOCKWITHSUBBLOCKS:
			final String fieldTagName = pSchemaElement.getFINFieldTagName();
			if(fieldTagName != null) {
				return matchFieldFromSubFieldContent(pSchemaElement, mMTFieldType);
			}
		}
		
		final MatchResult matchResult = super.processSubFieldElement(pSchemaElement);
		if (!matchResult.isMatched()) {
			return matchResult;
		}

		final Element newMessageElement = pSchemaElement.createElementNS(getMessageDoc(),getSchemaDoc());
		appendChild(newMessageElement, matchResult);
		return new MatchResult(newMessageElement);
	}

	/**
	 * This method matches the simple type of the current Schema element from
	 * the current subfield reader. <br>
	 * It will use the regular expression defined for the subfield in the MT
	 * message from the subfield reader.<br>
	 * A positive match result holds an XML Text node with the matched input.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pTypeElement
	 *            the type element to match from the input
	 * @return a match result
	 */
	protected MatchResult processSubFieldSimpleType(SchemaElement pSchemaElement, SchemaElement pTypeElement) {
		try {
			int minLength;
			int maxLength;
	
			final String type = pTypeElement.getSimpleBaseType();
			if (type.equals("string")) {
				minLength = pTypeElement.getMinLength();
				maxLength = pTypeElement.getMaxLength();
			} else if (type.equals("int")) {
				final String minInclusive = pTypeElement.getMinInclusive();
				final String maxInclusive = pTypeElement.getMaxInclusive();
				minLength = minInclusive != null ? minInclusive.length() : 0;
				maxLength = maxInclusive != null ? maxInclusive.length() : Integer.MAX_VALUE;
			} else {
				minLength = 0;
				maxLength = Integer.MAX_VALUE;
			}
	
			final int savedPosition = getSubFieldReader().getPosition();
			final String pattern = (String) pSchemaElement.getProperty(CreateInfoProcessor.PATTERN_PROPERTY);
			final String matchUntilPattern = pSchemaElement.getAppInfoMatchUntilPattern();
			final String lookAheadPattern = pSchemaElement.getAppInfoLookAheadPattern();
	
			LOGGER.trace(Level.FINER, "{0} INPUT [{1}]", new Object[] {
					new XPathPrinter(this), new PrintableString(getSubFieldReader().getContentLeft())
			}, null);
	
			final String prefix = pTypeElement.getAppInfoSepPrefix();
			if (prefix != null) {
				LOGGER.trace(Level.FINEST, "{0} INPUT [{1}] Prefix={2}", new Object[] {
						new XPathPrinter(this), new PrintableString(getSubFieldReader().getContentLeft()), new PrintableString(prefix)
				}, null);
				if (!getSubFieldReader().match(prefix)) {
					getSubFieldReader().restorePosition(savedPosition);
					return MatchResult.NOT_MATCHED;
				}
				LOGGER.trace(Level.FINER, "{0} MATCH [{1}] Prefix", new Object[] {
						new XPathPrinter(this), new PrintableString(prefix)
				}, null);
			}
	
			String match;
			if (matchUntilPattern != null) {
				LOGGER.trace(Level.FINEST, "{0} MatchUntilPattern={1}", new Object[] {
						new XPathPrinter(this), matchUntilPattern
				}, null);
				final Pattern p = (Pattern) pSchemaElement.getProperty(CreateInfoProcessor.COMPILED_PATTERN_PROPERTY);
				final Matcher m = p.matcher(getSubFieldReader().getContentLeft());
				if (m.find() && (m.start() >= minLength)) {
					match = getSubFieldReader().match(m.start());
				} else {
					getSubFieldReader().restorePosition(savedPosition);
					return MatchResult.NOT_MATCHED;
				}
			} else if (lookAheadPattern != null) {
				LOGGER.trace(Level.FINEST, "{0} Pattern={1} lookAheadPattern={2}", new Object[] {
						new XPathPrinter(this), pattern, lookAheadPattern
				}, null);
				final Pattern p = (Pattern) pSchemaElement.getProperty(CreateInfoProcessor.COMPILED_PATTERN_PROPERTY);
				final Matcher m = p.matcher(getSubFieldReader().getContentLeft());
				if (m.lookingAt() && (m.end(1) >= minLength)) {
					match = getSubFieldReader().match(m.end(1));
				} else {
					getSubFieldReader().restorePosition(savedPosition);
					return MatchResult.NOT_MATCHED;
				}
			} else {
				LOGGER.trace(Level.FINEST, "{0} Pattern={1}", new Object[] {
						new XPathPrinter(this), pattern
				}, null);
				final Pattern p = (Pattern) pSchemaElement.getProperty(CreateInfoProcessor.COMPILED_PATTERN_PROPERTY);
				final Matcher m = p.matcher(getSubFieldReader().getContentLeft(maxLength));
				if (m.lookingAt() && (m.end() >= minLength)) {
					match = getSubFieldReader().match(m.end());
				} else {
					getSubFieldReader().restorePosition(savedPosition);
					return MatchResult.NOT_MATCHED;
				}
			}
	
			LOGGER.trace(Level.FINER, "{0} MATCH [{1}]", new Object[] {
					new XPathPrinter(this), new PrintableString(match)
			}, null);
	
			if(pSchemaElement.getAppInfoMessageType()) {
				mMessageType = match; 
				mMessageVariant = null;
				LOGGER.trace(Level.FINER, "{0} Message Type={1}", new Object[] {
						new XPathPrinter(this), mMessageType
				}, null);
			}
			if(pSchemaElement.checkAppInfoMessageVariant(mMessageType + '.' + match)) {
				mMessageVariant = match;
				LOGGER.trace(Level.FINER, "{0} Message Type={1}.{2}", new Object[] {
						new XPathPrinter(this), mMessageType, mMessageVariant
				}, null);
			}
			
			final Text newTextNode = getMessageDoc().createTextNode(match);
			final MatchResult matchResult = new MatchResult(newTextNode);
			
			final String suffix = pTypeElement.getAppInfoSepSuffix();
			if (suffix != null) {
				LOGGER.trace(Level.FINEST, "{0} INPUT [{1}] Suffix={2}", new Object[] {
						new XPathPrinter(this), new PrintableString(getSubFieldReader().getContentLeft()), new PrintableString(suffix)
				}, null);
				if (!getSubFieldReader().match(suffix)) {
					getSubFieldReader().restorePosition(savedPosition);
					return MatchResult.NOT_MATCHED;
				}
				LOGGER.trace(Level.FINER, "{0} MATCH [{1}] Suffix", new Object[] {
						new XPathPrinter(this), new PrintableString(suffix)
				}, null);
			}
	
			return matchResult;
		} catch(SchemaException e) {
			getErrorHandler().add(e);
			return MatchResult.NOT_MATCHED;
		}
	}

	/**
	 * Gets the namespace URI currently defined from the message content
	 * 
	 * @param pSchemaDoc
	 *            the XML schema document
	 * @return message content namespace URI
	 */
	private String getNamespaceURIFromMessageContent(SchemaDoc pSchemaDoc) throws MT2XmlException {
		final StringBuffer sb = new StringBuffer();
		sb.append(pSchemaDoc.getStandardsPrefix());
		if(mMessageApplication == null || mMessageType == null) {
			throw new MT2XmlException(0,MT2XmlException.SYNTAX_UNKNOWN_NAMESPACE_URI, null, null);
		}
		sb.append(mMessageApplication);
		sb.append('.').append(mMessageType);
		if(mMessageVariant != null) {
			sb.append('.').append(mMessageVariant);
			
		}
		sb.append('.').append(pSchemaDoc.getStandardsEdition());
		return sb.toString();
	}
	
	/**
	 * This method is called for an any definition.<br>
	 * This method uses the namespace URI defined from the message content and
	 * continues processing the XML message for which the syntax is defined by
	 * the new XML schema document.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 */
	protected MatchResult processAny(SchemaElement pSchemaElement) {
		try {
			final String namespaceURI = getNamespaceURIFromMessageContent(pSchemaElement.getSchemaDoc());
			LOGGER.trace(Level.FINEST, "{0} Any namespaceURI={1}", new Object[] {
					new XPathPrinter(this), namespaceURI
			}, null);
			final SchemaDoc schemaDoc = pSchemaElement.getSchemaDoc().getSchemaDoc(namespaceURI);
			return processRootElements(schemaDoc);
		} catch (final SchemaException e) {
			getErrorHandler().add(e);
			return MatchResult.NOT_MATCHED;
		} catch(MT2XmlException e) {
			getErrorHandler().add(e);
			return MatchResult.NOT_MATCHED;
		}
	}
}
