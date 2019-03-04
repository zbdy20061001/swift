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

import java.util.Iterator;
import java.util.logging.Level;

import org.w3c.dom.Element;

import com.swift.converter.mt.MT2XmlProcessor;
import com.swift.converter.mt.MTInputProcessor;
import com.swift.converter.mt.Xml2MTProcessor;
import com.swift.converter.utils.Log;

/**
 * A class that provides the basic functionality to process any message input format for which the grammar is defined by the XML
 * Schema document. <br>
 * This class extends the {@link SchemaProcessor} class and adds support to process any message input format while traversing the
 * elements of the schema. The class overrides the methods {@link #processRootElements()},
 * {@link #processLoop(SchemaElement,int,int)} and {@link #processChoice(SchemaElement)}. <br>
 * This class is used as the base class for the XML message processor {@link SchemaMessageProcessor} or for the message processor
 * {@link MTInputProcessor}.
 * 
 * <p>
 * Processing starts by calling the new method {@link #processRootElements()}. For each root element definition in the XML schema
 * document, the method {@link SchemaProcessor#process(SchemaElement)} is called. The first positive match result will end the loop
 * and is returned as the match result of this method. If all returned match results are negative, an empty negative match result is
 * returned.
 * 
 * <pre>
 * 
 * -&gt; processRootElements (LOOP)!
 *    -&gt; process &lt;------------------------------------------------------------
 *       -&gt; processStart                                                     &circ;
 *          -&gt; processLoop (LOOP)!                                           |
 *             -&gt; processLoopOccurrence                                      |
 *                -&gt; processDispatch                                         |
 *                   -&gt; processRefElement -----------------------------------&circ;
 *                   -&gt; processElement -------&gt; processTypeAndChildren       |
 *                   -&gt; processAttribute ---&circ;   -&gt; processType               |
 *                   -&gt; processRestriction -&circ;   -v -&gt; processSimpleType      |
 *                   -&gt; processExtension ---&circ;    | --------------------------&circ; 
 *                   -&gt; processSequence -v       v                           |
 *                   ------------------------------&gt; processChildren (LOOP)  |
 *                                                   -&gt; processChild --------&circ;
 *                   -&gt; processChoice (LOOP)! -------------------------------&circ;
 *                   ------------------------------&gt; processChoiceChild      |
 *                   -&gt; processAnnotation
 *                   -&gt; processAny
 * </pre>
 * 
 * <p>
 * The new method {@link #processLoop(SchemaElement,int,int)} will repeatedly call the next processing method
 * {@link SchemaProcessor#processLoopOccurrence(SchemaElement,int)}. with the occurrence argument set to the current iteration
 * count. The loop is ended when a negative match result is returned or when the maximum number of calls are reached. All the object
 * lists of the returned match results are added together in order and returned as the match result of this method. The status is
 * set to negative if the process was ended by a negative result before the minimum number of returned match results was reached.
 * 
 * <p>
 * The new method {@link #processChoice(SchemaElement)} will call the new method {@link #processChoiceChild(SchemaElement)}
 * for each child element of the choice definition. The first positive match result will end the loop and is returned as the match result of
 * this method. If all returned match results are negative, an empty negative match result is returned.
 * The new method {@link #processChoiceChild(SchemaElement)} will call {@link SchemaProcessor#process(SchemaElement)}.
 * 
 * 
 * @see SchemaProcessor
 * @see MTInputProcessor
 * @see MT2XmlProcessor
 * @see SchemaMessageProcessor
 * @see Xml2MTProcessor
 * 
 * @author SWIFT
 */
public class SchemaInputProcessor extends SchemaProcessor {
	/** the logger used by this class */
	private final static Log LOGGER = Log.getLogger(SchemaInputProcessor.class);

	/**
	 * Creates a Schema input processor for a specified Schema document and error handler.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 * @param pErrorHandler
	 *            an error handler instance
	 */
	public SchemaInputProcessor(SchemaDoc pSchemaDoc, IErrorHandler pErrorHandler) {
		super(pSchemaDoc, pErrorHandler);
	}

	/**
	 * Creates a Schema input processor for a specified Schema document.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 */
	public SchemaInputProcessor(SchemaDoc pSchemaDoc) {
		this(pSchemaDoc, new DefaultErrorHandler());
	}

	/**
	 * This method handles all the occurrences of the current Schema element. <br>
	 * It will repeatedly call the method {@link SchemaProcessor#processLoopOccurrence(SchemaElement,int)} with the occurrence
	 * argument set to the current iteration count. The loop is ended when a negative match result is returned or when the maximum
	 * number of calls are reached. All the object lists of the returned match results are added together in order and returned as
	 * the match result of this method. The status is set to negative if the process was ended by a negative result before the
	 * minimum number of returned match results was reached.
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
	 * @see SchemaProcessor#processLoopOccurrence(SchemaElement,int)
	 */
	protected MatchResult processLoop(SchemaElement pSchemaElement, int pMinOccurs, int pMaxOccurs) {
		MatchResult matched = null;
		int i;

		// match mandatory elements
		for (i = 0; i < pMinOccurs; i++) {
			final MatchResult matchResult = processLoopOccurrence(pSchemaElement, i);
			matched = MatchResult.merge(matched, matchResult);
			if (!matchResult.isMatched()) {
				return MatchResult.merge(matched, MatchResult.MATCHED);
			}
		}

		// match optional elements
		int emptyResults = 0;
		for (; i < pMaxOccurs; i++) {
			final MatchResult matchResult = processLoopOccurrence(pSchemaElement, i);
			if (!matchResult.isMatched()) {
				return MatchResult.merge(matched, MatchResult.MATCHED);
			}
			// avoid looping on too many empty results
			if (matchResult.size() == 0) {
				emptyResults++;
				if (emptyResults > 100) {
					LOGGER.trace(Level.FINE, "too many empty results, breaking loop", null, null);
					break;
				}
			}

			matched = MatchResult.merge(matched, matchResult);
		}

		return MatchResult.merge(matched, MatchResult.MATCHED);
	}

	/**
	 * This method is called for a choice definition. <br>
	 * It will process a single child element of the choice definition.
	 * <p>
	 * For each child element of the choice definition, the method {@link #processChoiceChild(SchemaElement)} is called. The
	 * first positive match result will end the loop and is returned as the match result of this method. If all returned match
	 * results are negative, an empty negative match result is returned.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result.
	 * @see #processChoiceChild(SchemaElement)
	 */
	protected MatchResult processChoice(SchemaElement pSchemaElement) {
		final Iterator iterator = pSchemaElement.getChildren().iterator();
		while (iterator.hasNext()) {
			final SchemaElement childNode = (SchemaElement) iterator.next();
			final MatchResult matchResult = processChoiceChild(childNode);
			// the first positive match result is returned
			if (matchResult.isMatched()) {
				return matchResult;
			}
		}
		// no child element was found with a positive match result
		return MatchResult.NOT_MATCHED;
	}

	/**
	 * This method is called for a child of a choice definition. <br>
	 * It will forward the call to the method
	 * {@link SchemaProcessor#process(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result.
	 * @see SchemaProcessor#process(SchemaElement)
	 */
	protected MatchResult processChoiceChild(SchemaElement pSchemaElement) {
		return process(pSchemaElement);
	}
	
	/**
	 * Processes one of the root elements of the specified XML schema document from the input.
	 * <p>
	 * For each root element definition in the XML schema document, the method {@link SchemaProcessor#process(SchemaElement)} is
	 * called. The first positive match result will end the loop and is returned as the match result of this method. If all returned
	 * match results are negative, an empty negative match result is returned.
	 * 
	 * @param pSchemaDoc
	 *            the XML schema document
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#process(SchemaElement)
	 */
	public MatchResult processRootElements(SchemaDoc pSchemaDoc) {
		final Element schema = pSchemaDoc.getDocument().getDocumentElement();

		if (schema != null) {
			final SchemaElement schemaElement = pSchemaDoc.getSchemaElement(schema);
			final Iterator iterator = schemaElement.getChildren().iterator();
			while (iterator.hasNext()) {
				final SchemaElement childNode = (SchemaElement) iterator.next();
				if (childNode.getLocalName().equals("element")) {
					final MatchResult matchResult = process(childNode);
					// the first positive match result is returned
					if (matchResult.isMatched() && matchResult.size() > 0) {
						return matchResult;
					}
				}
			}
		}
		// no root element was found with a positive match result
		return MatchResult.NOT_MATCHED;
	}
}
