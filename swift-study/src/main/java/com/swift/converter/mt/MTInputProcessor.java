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

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.swift.converter.mt.io.MTSubFieldReader;
import com.swift.converter.xml.DefaultErrorHandler;
import com.swift.converter.xml.IErrorHandler;
import com.swift.converter.xml.MatchResult;
import com.swift.converter.xml.SchemaDoc;
import com.swift.converter.xml.SchemaElement;
import com.swift.converter.xml.SchemaInputProcessor;
import com.swift.converter.xml.SchemaProcessor;

/**
 * A class that provides the basic functionality to process input for which the
 * grammar is defined by the XML Schema document and for which two levels of
 * processing is required: fields and subfields. <br>
 * This class extends the {@link SchemaInputProcessor} class and overrides
 * processing methods so they dispatch the call to two new processing methods:
 * one method for processing fields and another method for processing subfields. <br>
 * The methods {@link #subFieldMatchingBegin()} or
 * {@link #subFieldMatchingBegin(MTSubFieldReader)} and
 * {@link #subFieldMatchingEnd()} should be used to switch between the two
 * processing methods.
 * 
 * @author SWIFT
 */
public class MTInputProcessor extends SchemaInputProcessor {
	/** current message document */
	final private Document mMessageDoc;
	/** subfield matching enable flag */
	private boolean mSubFieldMatching = false;
	/** current subfield reader */
	private MTSubFieldReader mSubFieldReader = null;

	/**
	 * Appends the objects of the match result as children to the specified
	 * node.
	 * 
	 * @param pNode
	 *            the node to which the objects of the matching result will be
	 *            added
	 * @param pMatchResult
	 *            the match result
	 */
	public static void appendChild(Node pNode, MatchResult pMatchResult) {
		final Iterator e = pMatchResult.iterator();
		while (e.hasNext()) {
			pNode.appendChild((Node) e.next());
		}
	}

	/**
	 * Creates a Schema processor for a specified Schema document and error handler.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 * @param pMessageNode
	 *            a message node or message document for which the XML elements
	 *            will be created
	 * @param pErrorHandler
	 *            an error handler instance
	 */
	public MTInputProcessor(SchemaDoc pSchemaDoc, Node pMessageNode, IErrorHandler pErrorHandler) {
		super(pSchemaDoc, pErrorHandler);

		if (pMessageNode.getNodeType() == Node.DOCUMENT_NODE) {
			this.mMessageDoc = (Document) pMessageNode;
		} else {
			this.mMessageDoc = pMessageNode.getOwnerDocument();
		}
	}

	/**
	 * Creates a Schema processor for a specified Schema document.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 * @param pMessageNode
	 *            a message node or message document for which the XML elements
	 *            will be created
	 */
	public MTInputProcessor(SchemaDoc pSchemaDoc, Node pMessageNode) {
		this(pSchemaDoc, pMessageNode, new DefaultErrorHandler());
	}
	
	/**
	 * Returns the message document for which the XML elements will be created.
	 * 
	 * @return the message document
	 */
	final public Document getMessageDoc() {
		return mMessageDoc;
	}

	/**
	 * This method starts subfield matching.
	 */
	final protected void subFieldMatchingBegin() {
		mSubFieldMatching = true;
	}

	/**
	 * This method sets the current subfield reader and starts subfield
	 * matching.
	 * 
	 * @param pSubFieldReader
	 *            the new subfield reader
	 */
	final protected void subFieldMatchingBegin(MTSubFieldReader pSubFieldReader) {
		mSubFieldMatching = true;
		mSubFieldReader = pSubFieldReader;
	}

	/**
	 * This method returns the current subfield reader.
	 * 
	 * @return the current subfield reader
	 */
	final protected MTSubFieldReader getSubFieldReader() {
		return mSubFieldReader;
	}

	/**
	 * This method ends subfield matching.
	 */
	final protected void subFieldMatchingEnd() {
		mSubFieldMatching = false;
		mSubFieldReader = null;
	}

	/**
	 * Returns the subfield matching status.
	 * 
	 * @return true if subfields are currently being matched
	 */
	final protected boolean isSubFieldMatching() {
		return mSubFieldMatching;
	}

	/**
	 * This method dispatches the call to
	 * {@link #processSubFieldStart(SchemaElement)} or
	 * {@link #processFieldStart(SchemaElement)} depending on the subfield
	 * matching status.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processSubFieldStart(SchemaElement)
	 * @see #processFieldStart(SchemaElement)
	 */
	final protected MatchResult processStart(SchemaElement pSchemaElement) {
		if (isSubFieldMatching()) {
			return processSubFieldStart(pSchemaElement);
		} else {
			return processFieldStart(pSchemaElement);
		}
	}

	/**
	 * This method is the first subfield processing method that can be
	 * overridden. <br>
	 * It forwards the call to
	 * {@link SchemaProcessor#processStart(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processStart(SchemaElement)
	 */
	protected MatchResult processSubFieldStart(SchemaElement pSchemaElement) {
		return super.processStart(pSchemaElement);
	}

	/**
	 * This method is the first field processing method that can be overridden. <br>
	 * It forwards the call to
	 * {@link SchemaProcessor#processStart(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processStart(SchemaElement)
	 */
	protected MatchResult processFieldStart(SchemaElement pSchemaElement) {
		return super.processStart(pSchemaElement);
	}

	/**
	 * This method dispatches the call to
	 * {@link #processSubFieldLoop(SchemaElement,int,int)} or
	 * {@link #processFieldLoop(SchemaElement,int,int)} depending on the
	 * subfield matching status.
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
	 * @see #processSubFieldLoop(SchemaElement,int,int)
	 * @see #processFieldLoop(SchemaElement,int,int)
	 */
	final protected MatchResult processLoop(SchemaElement pSchemaElement, int pMinOccurs, int pMaxOccurs) {
		if (isSubFieldMatching()) {
			return processSubFieldLoop(pSchemaElement, pMinOccurs, pMaxOccurs);
		} else {
			return processFieldLoop(pSchemaElement, pMinOccurs, pMaxOccurs);
		}
	}

	/**
	 * This method handles all the subfield occurrences of the current Schema
	 * element. <br>
	 * It forwards the call to
	 * {@link SchemaInputProcessor#processLoop(SchemaElement,int,int)}.
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
	protected MatchResult processSubFieldLoop(SchemaElement pSchemaElement, int pMinOccurs, int pMaxOccurs) {
		return super.processLoop(pSchemaElement, pMinOccurs, pMaxOccurs);
	}

	/**
	 * This method handles all the field occurrences of the current Schema
	 * element. <br>
	 * It forwards the call to
	 * {@link SchemaInputProcessor#processLoop(SchemaElement,int,int)}.
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
	protected MatchResult processFieldLoop(SchemaElement pSchemaElement, int pMinOccurs, int pMaxOccurs) {
		return super.processLoop(pSchemaElement, pMinOccurs, pMaxOccurs);
	}

	/**
	 * This method dispatches the call to
	 * {@link #processSubFieldLoopOccurrence(SchemaElement,int)} or
	 * {@link #processFieldLoopOccurrence(SchemaElement,int)} depending on the
	 * subfield matching status.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pOccurrence
	 *            occurrence of element
	 * 
	 * @return a match result
	 * 
	 * @see #processSubFieldLoopOccurrence(SchemaElement,int)
	 * @see #processFieldLoopOccurrence(SchemaElement,int)
	 */
	final protected MatchResult processLoopOccurrence(SchemaElement pSchemaElement, int pOccurrence) {
		if (isSubFieldMatching()) {
			return processSubFieldLoopOccurrence(pSchemaElement, pOccurrence);
		} else {
			return processFieldLoopOccurrence(pSchemaElement, pOccurrence);
		}
	}

	/**
	 * This method handles a single subfield occurrence of the current Schema
	 * element. <br>
	 * It forwards the call to
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
	protected MatchResult processSubFieldLoopOccurrence(SchemaElement pSchemaElement, int pOccurrence) {
		return super.processLoopOccurrence(pSchemaElement, pOccurrence);
	}

	/**
	 * This method handles a single field occurrence of the current Schema
	 * element. <br>
	 * It forwards the call to
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
	protected MatchResult processFieldLoopOccurrence(SchemaElement pSchemaElement, int pOccurrence) {
		return super.processLoopOccurrence(pSchemaElement, pOccurrence);
	}

	/**
	 * This method dispatches the call to
	 * {@link #processSubFieldChoice(SchemaElement)} or
	 * {@link #processFieldChoice(SchemaElement)} depending on the subfield
	 * matching status.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processSubFieldChoice(SchemaElement)
	 * @see #processFieldChoice(SchemaElement)
	 */
	final protected MatchResult processChoice(SchemaElement pSchemaElement) {
		if (isSubFieldMatching()) {
			return processSubFieldChoice(pSchemaElement);
		} else {
			return processFieldChoice(pSchemaElement);
		}
	}

	/**
	 * This method is called for a subfield choice definition. <br>
	 * It forwards the call to
	 * {@link SchemaInputProcessor#processChoice(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result.
	 * @see SchemaInputProcessor#processChoice(SchemaElement)
	 */
	protected MatchResult processSubFieldChoice(SchemaElement pSchemaElement) {
		return super.processChoice(pSchemaElement);
	}

	/**
	 * This method is called for a field choice definition. <br>
	 * It forwards the call to
	 * {@link SchemaInputProcessor#processChoice(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result.
	 * @see SchemaInputProcessor#processChoice(SchemaElement)
	 */
	protected MatchResult processFieldChoice(SchemaElement pSchemaElement) {
		return super.processChoice(pSchemaElement);
	}

	/**
	 * This method dispatches the call to
	 * {@link #processSubFieldChoiceChild(SchemaElement)} or
	 * {@link #processFieldChoiceChild(SchemaElement)} depending on the subfield
	 * matching status.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processSubFieldChoiceChild(SchemaElement)
	 * @see #processFieldChoiceChild(SchemaElement)
	 */
	final protected MatchResult processChoiceChild(SchemaElement pSchemaElement) {
		if (isSubFieldMatching()) {
			return processSubFieldChoiceChild(pSchemaElement);
		} else {
			return processFieldChoiceChild(pSchemaElement);
		}
	}

	/**
	 * This method is called for a child of a subfield choice definition. <br>
	 * It forwards the call to
	 * {@link SchemaInputProcessor#processChoiceChild(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result.
	 * @see SchemaInputProcessor#processChoiceChild(SchemaElement)
	 */
	protected MatchResult processSubFieldChoiceChild(SchemaElement pSchemaElement) {
		return super.processChoiceChild(pSchemaElement);
	}

	/**
	 * This method is called for a child of a field choice definition. <br>
	 * It forwards the call to
	 * {@link SchemaInputProcessor#processChoiceChild(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result.
	 * @see SchemaInputProcessor#processChoiceChild(SchemaElement)
	 */
	protected MatchResult processFieldChoiceChild(SchemaElement pSchemaElement) {
		return super.processChoiceChild(pSchemaElement);
	}
	
	/**
	 * This method dispatches the call to
	 * {@link #processSubFieldChildren(SchemaElement)} or
	 * {@link #processFieldChildren(SchemaElement)} depending on the subfield
	 * matching status.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processSubFieldChildren(SchemaElement)
	 * @see #processFieldChildren(SchemaElement)
	 */
	final protected MatchResult processChildren(SchemaElement pSchemaElement) {
		if (isSubFieldMatching()) {
			return processSubFieldChildren(pSchemaElement);
		} else {
			return processFieldChildren(pSchemaElement);
		}
	}

	/**
	 * This method handles all the subfield child elements of the current Schema
	 * element.
	 * <p>
	 * It forwards the call to
	 * {@link SchemaProcessor#processChildren(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processChildren(SchemaElement)
	 */
	protected MatchResult processSubFieldChildren(SchemaElement pSchemaElement) {
		return super.processChildren(pSchemaElement);
	}

	/**
	 * This method handles all the field child elements of the current Schema
	 * element.
	 * <p>
	 * It forwards the call to
	 * {@link SchemaProcessor#processChildren(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processChildren(SchemaElement)
	 */
	protected MatchResult processFieldChildren(SchemaElement pSchemaElement) {
		return super.processChildren(pSchemaElement);
	}

	/**
	 * This method dispatches the call to
	 * {@link #processSubFieldChild(SchemaElement,boolean)} or
	 * {@link #processFieldChild(SchemaElement,boolean)} depending on the
	 * subfield matching status.
	 * 
	 * @param pChildElement
	 *            the current schema element
	 * @param pNeedSeparator
	 *            indication that a separator is needed
	 * 
	 * @return a match result
	 * 
	 * @see #processSubFieldChild(SchemaElement,boolean)
	 * @see #processFieldChild(SchemaElement,boolean)
	 */
	final protected MatchResult processChild(SchemaElement pChildElement, boolean pNeedSeparator) {
		if (isSubFieldMatching()) {
			return processSubFieldChild(pChildElement, pNeedSeparator);
		} else {
			return processFieldChild(pChildElement, pNeedSeparator);
		}
	}

	/**
	 * This method handles a single child subfield element of the current Schema
	 * element.
	 * <p>
	 * It forwards the call to
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
	protected MatchResult processSubFieldChild(SchemaElement pChildElement, boolean pNeedSeparator) {
		return super.processChild(pChildElement, pNeedSeparator);
	}

	/**
	 * This method handles a single child field element of the current Schema
	 * element.
	 * <p>
	 * It forwards the call to
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
	protected MatchResult processFieldChild(SchemaElement pChildElement, boolean pNeedSeparator) {
		return super.processChild(pChildElement, pNeedSeparator);
	}

	/**
	 * This method dispatches the call to
	 * {@link #processSubFieldElement(SchemaElement)} or
	 * {@link #processFieldElement(SchemaElement)} depending on the subfield
	 * matching status.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processSubFieldElement(SchemaElement)
	 * @see #processFieldElement(SchemaElement)
	 */
	final protected MatchResult processElement(SchemaElement pSchemaElement) {
		if (isSubFieldMatching()) {
			return processSubFieldElement(pSchemaElement);
		} else {
			return processFieldElement(pSchemaElement);
		}
	}

	/**
	 * This method is called for a subfield element definition. <br>
	 * It forwards the call to
	 * {@link SchemaProcessor#processElement(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processElement(SchemaElement)
	 */
	protected MatchResult processSubFieldElement(SchemaElement pSchemaElement) {
		return super.processElement(pSchemaElement);
	}

	/**
	 * This method is called for a field element definition. <br>
	 * It forwards the call to
	 * {@link SchemaProcessor#processElement(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processElement(SchemaElement)
	 */
	protected MatchResult processFieldElement(SchemaElement pSchemaElement) {
		return super.processElement(pSchemaElement);
	}

	/**
	 * This method dispatches the call to
	 * {@link #processSubFieldSimpleType(SchemaElement,SchemaElement)} or
	 * {@link #processFieldSimpleType(SchemaElement,SchemaElement)} depending on
	 * the subfield matching status.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pTypeElement
	 *            the type element to match from the input
	 * @return a match result
	 * 
	 * @see #processSubFieldSimpleType(SchemaElement,SchemaElement)
	 * @see #processFieldSimpleType(SchemaElement,SchemaElement)
	 */
	final protected MatchResult processSimpleType(SchemaElement pSchemaElement, SchemaElement pTypeElement) {
		if (isSubFieldMatching()) {
			return processSubFieldSimpleType(pSchemaElement, pTypeElement);
		} else {
			return processFieldSimpleType(pSchemaElement, pTypeElement);
		}
	}

	/**
	 * Processes a simple type for a subfield.<br>
	 * It forwards the call to
	 * {@link SchemaProcessor#processSimpleType(SchemaElement,SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pTypeElement
	 *            the type element to match from the input
	 * @return a match result
	 * @see SchemaProcessor#processSimpleType(SchemaElement,SchemaElement)
	 */
	protected MatchResult processSubFieldSimpleType(SchemaElement pSchemaElement, SchemaElement pTypeElement) {
		return super.processSimpleType(pSchemaElement, pTypeElement);
	}

	/**
	 * Processes a simple type for a field.<br>
	 * It forwards the call to
	 * {@link SchemaProcessor#processSimpleType(SchemaElement,SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pTypeElement
	 *            the type element to match from the input
	 * @return a match result
	 * @see SchemaProcessor#processSimpleType(SchemaElement,SchemaElement)
	 */
	protected MatchResult processFieldSimpleType(SchemaElement pSchemaElement, SchemaElement pTypeElement) {
		return super.processSimpleType(pSchemaElement, pTypeElement);
	}
}
