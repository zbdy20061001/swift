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
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

import org.w3c.dom.Element;

import com.swift.converter.mt.CreateInfoProcessor;
import com.swift.converter.mt.MT2XmlProcessor;
import com.swift.converter.mt.MTInputProcessor;
import com.swift.converter.mt.Xml2MTProcessor;

/**
 * A class that provides the basic functionality to traverse the elements of an
 * XML schema document. <br>
 * A derived class that doesn't override the process flow of the processing
 * methods will traverse the schema with all schema element paths processed only
 * once. <br>
 * This class is also used as the base class for the generic input processor
 * {@link SchemaInputProcessor} and the schema enricher
 * {@link CreateInfoProcessor}.
 * 
 * <p>
 * All processing methods return a match result, an instance of the
 * {@link MatchResult} class that contains a list of objects and a status that
 * indicates that the match result is negative or positive.
 * 
 * <p>
 * Processing starts by calling the method {@link #processRootElements()}. For
 * each root element definition in the XML schema document, the method
 * {@link #process(SchemaElement)} is called. The loop is ended earlier when a
 * negative match result is returned. All the object lists of the returned match
 * results are added together in order and returned as the match result of this
 * method. The status is set to negative if the process was ended by a negative
 * result.
 * 
 * <pre>
 * 
 * -&gt; processRootElements (LOOP)
 *    -&gt; process &lt;------------------------------------------------------------
 *       -&gt; processStart                                                     &circ;
 *          -&gt; processLoop                                                   |
 *             -&gt; processLoopOccurrence                                      |
 *                -&gt; processDispatch                                         |
 *                   -&gt; processRefElement -----------------------------------&circ;
 *                   -&gt; processElement -------&gt; processTypeAndChildren       |
 *                   -&gt; processAttribute ---&circ;   -&gt; processType               |
 *                   -&gt; processRestriction -&circ;   -v -&gt; processSimpleType      |
 *                   -&gt; processExtension ---&circ;    | --------------------------&circ; 
 *                   -&gt; processSequence -v       |                           |
 *                   -&gt; processChoice ---v       v                           |
 *                   ------------------------------&gt; processChildren (LOOP)  |
 *                                                   -&gt; processChild --------&circ;
 *                   -&gt; processAnnotation
 *                   -&gt; processAny
 * </pre>
 * 
 * <p>
 * The method {@link #process(SchemaElement)} is the starting processing method
 * that is called recursively for each Schema element during the traversal of
 * the Schema. It keeps track of the Schema element path of the current
 * processed element within the Schema and forward the call to the next
 * processing method {@link #processStart(SchemaElement)}. The method
 * {@link #getXPath()} returns the XPath expression of the current processed
 * Schema element.
 * 
 * <p>
 * The method {@link #processStart(SchemaElement)} is the first processing
 * method that can be overridden. It forwards the call to
 * {@link #processLoop(SchemaElement,int,int)} with the minimum and maximum
 * occurrence information extracted from the current Schema element.
 * 
 * <p>
 * The method {@link #processLoop(SchemaElement,int,int)} will simply forward
 * the call to the method {@link #processLoopOccurrence(SchemaElement,int)}.
 * 
 * <p>
 * The method {@link #processLoopOccurrence(SchemaElement,int)} will simply
 * forward the call to the method {@link #processDispatch(SchemaElement)}.
 * 
 * <p>
 * The method {@link #processDispatch(SchemaElement)} will dispatch the call to
 * the next processing method depending on the element definition of the current
 * schema element:<br>
 * the method {@link #processRefElement(SchemaElement, SchemaElement)} is called
 * for an element reference definition, the method
 * {@link #processElement(SchemaElement)} is called for an element definition,
 * the method {@link #processAttribute(SchemaElement)} is called for an
 * attribute definition, the method {@link #processRestriction(SchemaElement)}
 * is called for a restriction definition, the method
 * {@link #processExtension(SchemaElement)} is called for a extension
 * definition, the method {@link #processSequence(SchemaElement)} is called for
 * a sequence definition, the method {@link #processChoice(SchemaElement)} is
 * called for a choice definition, the method
 * {@link #processAnnotation(SchemaElement)} is called for an annotation
 * definition, the method {@link #processAny(SchemaElement)} is called for an
 * any definition and the method {@link #processChildren(SchemaElement)} is
 * called for any other definition.
 * 
 * <p>
 * The methods {@link #processElement(SchemaElement)} and
 * {@link #processAttribute(SchemaElement)} will forward the call to the method
 * {@link #processTypeAndChildren(SchemaElement,String)}. The type is
 * identified by the "type" attribute of the current schema element.
 * 
 * <br>
 * The methods {@link #processRestriction(SchemaElement)} and
 * {@link #processExtension(SchemaElement)} will forward the call to the method
 * {@link #processTypeAndChildren(SchemaElement,String)}. The type is
 * identified by the "base" attribute of the current schema element.
 * 
 * <br>
 * The methods {@link #processSequence(SchemaElement)} and
 * {@link #processChoice(SchemaElement)} will simply forward the call to the
 * method {@link #processChildren(SchemaElement)}.
 * 
 * <p>
 * The method {@link #processTypeAndChildren(SchemaElement,String)} will call
 * the method {@link #processType(SchemaElement,String)} if the specified
 * attribute exists for the current schema element and will call in subsequence
 * the method {@link #processChildren(SchemaElement)}. The process is ended
 * earlier when a negative match result is returned by
 * {@link #processType(SchemaElement,String)}. The processing match results are
 * added together in order and returned as the match result of this method. The
 * status is set to negative if there was any negative match result returned.
 * 
 * <p>
 * The method {@link #processType(SchemaElement,String)} will recursively call
 * the method {@link #process(SchemaElement)} for a defined type or will call
 * the method {@link #processSimpleType(SchemaElement,SchemaElement)} for a type
 * not defined in the schema.
 * 
 * <p>
 * The method {@link #processChildren(SchemaElement)} will recursively call the
 * method {@link #processChild(SchemaElement,boolean)} for each child element of
 * the current schema element. The process is ended earlier when a negative
 * match result is returned. The processing match results are added together in
 * order and returned as the match results of this method. The status is set to
 * negative if the process was ended by a negative result.
 * 
 * <p>
 * The method {@link #processChild(SchemaElement,boolean)} will recursively call
 * the method {@link #process(SchemaElement)}.
 * 
 * 
 * @see CreateInfoProcessor
 * @see SchemaInputProcessor
 * @see MTInputProcessor
 * @see MT2XmlProcessor
 * @see SchemaMessageProcessor
 * @see Xml2MTProcessor
 * 
 * @author SWIFT
 */
public class SchemaProcessor {
	/**
	 * A class that represents a single step of a simple XPath expression.
	 * <p>
	 * It is represented by a Schema element and an optional index predicate.
	 * <br>
	 * A simple XPath expression is represented as a list of this class.
	 */
	public static class XPathStep {
		/** index value representing no predicate */
		public static final int NO_INDEX = -1;
		/** Schema element */
		private final SchemaElement mElement;
		/** index predicate */
		private int mIndex;

		/**
		 * Creates a simple XPath expression step for the specified Schema
		 * element with no index predicate.
		 * 
		 * @param pElement
		 *            the Schema element to be used for the single XPath
		 *            expression step
		 */
		protected XPathStep(SchemaElement pElement) {
			mElement = pElement;
			mIndex = NO_INDEX;
		}

		/**
		 * Returns the the Schema element of this XPath expression step.
		 * 
		 * @return the Schema element
		 */
		public SchemaElement getElement() {
			return mElement;
		}

		/**
		 * Returns the the index predicate of this XPath expression step. <br>
		 * The index starts from 1.
		 * 
		 * @return the index predicate (or NO_INDEX if there is no predicate)
		 */
		public int getIndex() {
			return mIndex;
		}

		/**
		 * Sets the the index predicate of this XPath expression step. <br>
		 * The index starts from 1.
		 * 
		 * @param pIndex
		 *            the index predicate
		 */
		protected void setIndex(int pIndex) {
			mIndex = pIndex;
		}
	}

	/** value representing no occurrence */
	public static final int NO_OCCURRENCE = -1;
	/** current Schema document */
	private final SchemaDoc mSchemaDoc;
	/** the current error handler */
	private final IErrorHandler mErrorHandler;
	/**
	 * number of parent elements for the current processed Schema that are a
	 * Composite Field
	 */
	private int mCompositeFields = 0;
	/**
	 * the current processed Schema element has a parent that is a Composite
	 * Field
	 */
	private boolean mInCompositeField = false;

	/** XPath expression of the current processed element */
	private final LinkedList /* <XPathStep> */mXPath = new LinkedList();

	/** The last processed qualifier */
	private String mCurrentQualifier;

	/**
	 * Creates a Schema processor for a specified Schema document and error handler.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 * @param pErrorHandler
	 *            an error handler instance
	 */
	public SchemaProcessor(SchemaDoc pSchemaDoc, IErrorHandler pErrorHandler) {
		mSchemaDoc = pSchemaDoc;
		mErrorHandler = pErrorHandler;
	}

	/**
	 * Creates a Schema processor for a specified Schema document.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 */
	public SchemaProcessor(SchemaDoc pSchemaDoc) {
		this(pSchemaDoc,new DefaultErrorHandler());
	}
	
	/**
	 * Returns the Schema document of this Schema processor.
	 * 
	 * @return the current Schema document
	 */
	public final SchemaDoc getSchemaDoc() {
		return mSchemaDoc;
	}

	/**
	 * Returns the current error handler.
	 * 
	 * @return the current error handler
	 */
	protected final IErrorHandler getErrorHandler() {
		return mErrorHandler;
	}
	
	/**
	 * Returns a list iterator for the XPath expression steps of the current
	 * processed Schema element.
	 * 
	 * @return a list iterator
	 * 
	 * @see XPathStep
	 */
	public final ListIterator /* <XPathStep> */getXPathIterator() {
		return mXPath.listIterator(mXPath.size());
	}

	/**
	 * Returns the parent element in the XPath expression of the current
	 * processed Schema element that has the specified property set in the
	 * specified property map.
	 * 
	 * @param pPropertyMaps
	 *            a property map that maps an Element to a HashMap that maps
	 *            Strings to Objects
	 * @param pPropertyName
	 *            the property name
	 * @return the parent element or null if there was no element found
	 */
	protected final SchemaElement findParentWithProperty(Map /* <Element, HashMap < String, Object > > */pPropertyMaps,
			String pPropertyName) {
		final ListIterator li = getXPathIterator();
		if (li.hasPrevious()) {
			// skip first element to get first parent
			li.previous();
			while (li.hasPrevious()) {
				final XPathStep e = (XPathStep) li.previous();
				if (SchemaHelper.getProperty(pPropertyMaps, e.getElement(), pPropertyName) != null) {
					return e.getElement();
				}
			}
		}
		return null;
	}

	/**
	 * Returns the XPath expression of the current processed Schema element as a
	 * String.
	 * 
	 * @return the XPath expression of the current processed Schema element
	 */
	public String getXPath() {
		final StringBuffer name = new StringBuffer();

		for (final ListIterator li = mXPath.listIterator(); li.hasNext();) {
			final XPathStep e = (XPathStep) li.next();
			if (e.getElement().getLocalName().equals("element")) {
				final String elementName = e.getElement().getNameAttribute();
				if ((elementName != null) && (elementName.length() > 0)) {
					name.append("/").append(elementName);
					if (e.getIndex() != XPathStep.NO_INDEX) {
						name.append("[").append(e.getIndex()).append("]");
					}
				}
			}
		}
		return name.toString();
	}

	/**
	 * Returns true if there is a parent element in the XPath expression of the
	 * current processed Schema element that is a Composite Field.
	 * 
	 * @return the current processed Schema is processed within a Composite
	 *         Field
	 */
	protected final boolean inCompositeField() {
		return mInCompositeField;
	}

	/**
	 * This method is the starting processing method that is called recursively
	 * for each Schema element during the traversal of the Schema. <br>
	 * It keeps track of the XPath expression of the current processed element
	 * within the Schema and forward the call to the next processing method
	 * {@link #processStart(SchemaElement)}. The method {@link #getXPath()}
	 * returns the XPath expression of the current processed Schema element.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processStart(SchemaElement)
	 * @see #getXPath()
	 */
	protected final MatchResult process(SchemaElement pSchemaElement) {
		final int baseType = pSchemaElement.getBaseType();

		final boolean mPrevInCompositeField = mInCompositeField;
		mInCompositeField = mCompositeFields > 0;

		switch (baseType) {
		case SchemaConstants.COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD:
			mCompositeFields++;
			break;
		case SchemaConstants.COMPLEX_CONTENT_MTTYPE_QUALIFIER:
			mCurrentQualifier = pSchemaElement.getNameAttribute();
			break;
		}

		mXPath.add(new XPathStep(pSchemaElement));
		try {
			return processStart(pSchemaElement);
		} finally {
			mXPath.removeLast();

			switch (baseType) {
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_COMPOSITEFIELD:
				mCompositeFields--;
				break;
			case SchemaConstants.COMPLEX_CONTENT_MTTYPE_QUALIFIER:
				mCurrentQualifier = null;
				break;
			}

			mInCompositeField = mPrevInCompositeField;
		}
	}

	/**
	 * This method is the first processing method that can be overridden. <br>
	 * It forwards the call to {@link #processLoop(SchemaElement,int,int)} with
	 * the minimum and maximum occurrence information extracted from the current
	 * Schema element.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processLoop(SchemaElement,int,int)
	 */
	protected MatchResult processStart(SchemaElement pSchemaElement) {
		return processLoop(pSchemaElement, pSchemaElement.getMinOccurs(), pSchemaElement.getMaxOccurs());
	}

	/**
	 * This method handles all the occurrences of the current Schema element.
	 * <br>
	 * It will simply forward the call to the method
	 * {@link #processLoopOccurrence(SchemaElement,int)} with the occurrence
	 * argument set to NO_OCCURRENCE.
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
	 * @see #processLoopOccurrence(SchemaElement,int)
	 */
	protected MatchResult processLoop(SchemaElement pSchemaElement, int pMinOccurs, int pMaxOccurs) {
		return processLoopOccurrence(pSchemaElement, NO_OCCURRENCE);
	}

	/**
	 * This method handles a single occurrence of the current Schema element.
	 * <br>
	 * It sets the index of the current XPath expression depending on the
	 * occurrence and forward the call to the method
	 * {@link #processDispatch(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pOccurrence
	 *            occurrence of element
	 * 
	 * @return a match result
	 * 
	 * @see #processDispatch(SchemaElement)
	 */
	protected MatchResult processLoopOccurrence(SchemaElement pSchemaElement, int pOccurrence) {
		final XPathStep e = (XPathStep) mXPath.getLast();
		e.setIndex(pOccurrence == NO_OCCURRENCE ? XPathStep.NO_INDEX : pOccurrence + 1);
		return processDispatch(pSchemaElement);
	}

	/**
	 * This method dispatches the call depending depending on the element
	 * definition of the current Schema element. <br>
	 * It calls the following processing methods:<br>
	 * the method {@link #processRefElement(SchemaElement,SchemaElement)} is
	 * called for an element reference definition, the method
	 * {@link #processElement(SchemaElement)} is called for an element
	 * definition, the method {@link #processAttribute(SchemaElement)} is called
	 * for an attribute definition, the method
	 * {@link #processRestriction(SchemaElement)} is called for a restriction
	 * definition, the method {@link #processExtension(SchemaElement)} is called
	 * for a extension definition, the method
	 * {@link #processSequence(SchemaElement)} is called for a sequence
	 * definition, the method {@link #processChoice(SchemaElement)} is called
	 * for a choice definition, the method
	 * {@link #processAnnotation(SchemaElement)} is called for an annotation
	 * definition , the method {@link #processAny(SchemaElement)} is called for
	 * an any definition and the method {@link #processChildren(SchemaElement)}
	 * is called for any other definition.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processRefElement(SchemaElement,SchemaElement)
	 * @see #processElement(SchemaElement)
	 * @see #processAttribute(SchemaElement)
	 * @see #processRestriction(SchemaElement)
	 * @see #processExtension(SchemaElement)
	 * @see #processSequence(SchemaElement)
	 * @see #processChoice(SchemaElement)
	 * @see #processChildren(SchemaElement)
	 * @see #processAnnotation(SchemaElement)
	 * @see #processAny(SchemaElement)
	 */
	protected MatchResult processDispatch(SchemaElement pSchemaElement) {
		final String localName = pSchemaElement.getLocalName();
		if (localName.equals("element")) {
			final String refName = pSchemaElement.getRefAttribute();
			if (refName != null) {
				try {
					final SchemaElement refElement = pSchemaElement.getSchemaDoc().getRootElement(refName);
					return processRefElement(pSchemaElement, refElement);
				} catch (SchemaException e) {
					getErrorHandler().add(e);
					return MatchResult.NOT_MATCHED;
				}
			}
			return processElement(pSchemaElement);
		} else if (localName.equals("attribute")) {
			return processAttribute(pSchemaElement);
		} else if (localName.equals("restriction")) {
			return processRestriction(pSchemaElement);
		} else if (localName.equals("extension")) {
			return processExtension(pSchemaElement);
		} else if (localName.equals("sequence")) {
			return processSequence(pSchemaElement);
		} else if (localName.equals("choice")) {
			return processChoice(pSchemaElement);
		} else if (localName.equals("annotation")) {
			return processAnnotation(pSchemaElement);
		} else if (localName.equals("any")) {
			return processAny(pSchemaElement);
		} else {
			return processChildren(pSchemaElement);
		}
	}

	/**
	 * This method is called for an annotation.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 */
	protected MatchResult processAnnotation(SchemaElement pSchemaElement) {
		return MatchResult.MATCHED;
	}

	/**
	 * This method is called for an any definition.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 */
	protected MatchResult processAny(SchemaElement pSchemaElement) {
		return MatchResult.MATCHED;
	}
	
	/**
	 * This method is called for an element reference definition. <br>
	 * It will forward the call to the method {@link #process(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pRefElement
	 *            the referenced element
	 * 
	 * @return a match result
	 * 
	 * @see #process(SchemaElement)
	 */
	protected MatchResult processRefElement(SchemaElement pSchemaElement, SchemaElement pRefElement) {
		return process(pRefElement);
	}

	/**
	 * This method is called for an element definition. <br>
	 * It will forward the call to the method
	 * {@link #processTypeAndChildren(SchemaElement,String)}. The type is
	 * identified by the "type" attribute of the current Schema element.

	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processTypeAndChildren(SchemaElement,String)
	 */
	protected MatchResult processElement(SchemaElement pSchemaElement) {
		return processTypeAndChildren(pSchemaElement, "type");
	}

	/**
	 * This method is called for an attribute definition. <br>
	 * It will forward the call to the method
	 * {@link #processTypeAndChildren(SchemaElement,String)}. The type is
	 * identified by the "type" attribute of the current Schema element.

	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processTypeAndChildren(SchemaElement,String)
	 */
	protected MatchResult processAttribute(SchemaElement pSchemaElement) {
		return processTypeAndChildren(pSchemaElement, "type");
	}

	/**
	 * This method is called for a restriction definition. <br>
	 * It will forward the call to the method
	 * {@link #processTypeAndChildren(SchemaElement,String)}. The type is
	 * identified by the "base" attribute of the current schema element.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processTypeAndChildren(SchemaElement,String)
	 */
	protected MatchResult processRestriction(SchemaElement pSchemaElement) {
		return processTypeAndChildren(pSchemaElement, "base");
	}

	/**
	 * This method is called for an extension definition. <br>
	 * It will forward the call to the method
	 * {@link #processTypeAndChildren(SchemaElement,String)}. The type is
	 * identified by the "base" attribute of the current schema element.
	 * 
	 * @param pSchemaElement
	 *            the current schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processTypeAndChildren(SchemaElement,String)
	 */
	protected MatchResult processExtension(SchemaElement pSchemaElement) {
		return processTypeAndChildren(pSchemaElement, "base");
	}

	/**
	 * This method is called for a sequence definition. <br>
	 * It will forward the call to the method
	 * {@link #processChildren(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processChildren(SchemaElement)
	 */
	protected MatchResult processSequence(SchemaElement pSchemaElement) {
		return processChildren(pSchemaElement);
	}

	/**
	 * This method is called for a choice definition. <br>
	 * It will forward the call to the method
	 * {@link #processChildren(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processChildren(SchemaElement)
	 */
	protected MatchResult processChoice(SchemaElement pSchemaElement) {
		return processChildren(pSchemaElement);
	}

	/**
	 * Processes the optional type found in the specified attribute and all
	 * child elements of the current schema element.
	 * <p>
	 * It will call the method {@link #processType(SchemaElement,String)} if the
	 * specified attribute exists for the current schema element and will call
	 * in subsequence the method {@link #processChildren(SchemaElement)}. The
	 * process is ended earlier when a negative match result is returned by
	 * {@link #processType(SchemaElement,String)}. <br>
	 * The processing match results are added together in order and returned as
	 * the match result of this method. The status is set to negative if there
	 * was any negative match result returned.
	 * 
	 * @param pSchemaElement
	 *            the current schema element
	 * @param pTypeAttribute
	 *            the attribute name where a optional type is specified
	 * 
	 * @return a match result
	 * 
	 * @see #processType(SchemaElement,String)
	 * @see #processChildren(SchemaElement)
	 */
	protected MatchResult processTypeAndChildren(SchemaElement pSchemaElement, String pTypeAttribute) {
		MatchResult matched = null;

		final String type = pSchemaElement.getElement().getAttribute(pTypeAttribute);
		if (type != null) {
			final MatchResult matchResult = processType(pSchemaElement, type);
			matched = MatchResult.merge(matched, matchResult);
			if (!matched.isMatched()) {
				return MatchResult.merge(matched, MatchResult.MATCHED);
			}
		}
		final MatchResult matchResult = processChildren(pSchemaElement);
		matched = MatchResult.merge(matched, matchResult);
		return MatchResult.merge(matched, MatchResult.MATCHED);
	}

	/**
	 * This method handles all the child elements of the current Schema element.
	 * <p>
	 * It will call the method {@link #processChild(SchemaElement,boolean)} for
	 * each child element of the current schema element. The process is ended
	 * earlier when a negative match result is returned. The processing match
	 * results are added together in order and returned as the match results of
	 * this method. The status is set to negative if the process was ended by a
	 * negative result.
	 * 
	 * @param pSchemaElement
	 *            the current schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processChild(SchemaElement,boolean)
	 */
	protected MatchResult processChildren(SchemaElement pSchemaElement) {
		MatchResult matched = null;

		// process all child elements
		final Iterator iterator = pSchemaElement.getChildren().iterator();
		while (iterator.hasNext()) {
			final SchemaElement childNode = (SchemaElement) iterator.next();
			final MatchResult matchResult = processChild(childNode, matched != null && matched.size() > 0);
			matched = MatchResult.merge(matched, matchResult);
			if (!matchResult.isMatched()) {
				return MatchResult.merge(matched, MatchResult.MATCHED);
			}
		}

		// all child elements returned a positive match result
		return MatchResult.merge(matched, MatchResult.MATCHED);
	}

	/**
	 * This method handles a single child element of the current Schema element.
	 * <p>
	 * It will recursively call the method {@link #process(SchemaElement)}
	 * 
	 * @param pChildElement
	 *            the current schema element
	 * @param pNeedSeparator
	 *            indication that a separator is needed
	 * 
	 * @return a match result
	 * 
	 * @see #process(SchemaElement)
	 */
	protected MatchResult processChild(SchemaElement pChildElement, boolean pNeedSeparator) {
		return process(pChildElement);
	}

	/**
	 * Processes a specified type from the input.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pType
	 *            the type to match from the input
	 * 
	 * @return a match result
	 * 
	 * @see #process(SchemaElement)
	 * @see #processSimpleType(SchemaElement,SchemaElement)
	 */
	protected MatchResult processType(SchemaElement pSchemaElement, String pType) {
		try {
			final SchemaElement typeElement = pSchemaElement.getSchemaDoc().getTypeElement(pType);
			if (typeElement != null) {
				if (typeElement.getLocalName().equals("simpleType")) {
					return processSimpleType(pSchemaElement, typeElement);
				} else {
					return process(typeElement);
				}
			}
			return MatchResult.MATCHED;
		} catch (SchemaException e) {
			getErrorHandler().add(e);
			return MatchResult.NOT_MATCHED;
		}
	}

	/**
	 * Processes a simple type.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pTypeElement
	 *            the type element to match from the input
	 * @return a match result
	 */
	protected MatchResult processSimpleType(SchemaElement pSchemaElement, SchemaElement pTypeElement) {
		return process(pTypeElement);
	}

	/**
	 * Processes all root element of the specified XML schema document.
	 * <p>
	 * For each root element definition in the XML Schema document, the method
	 * {@link #process(SchemaElement)} is called. The loop is ended earlier when
	 * a negative match result is returned. All the object lists of the returned
	 * match results are added together in order and returned as the match
	 * result of this method. The status is set to negative if the process was
	 * ended by a negative result.
	 * 
	 * @param pSchemaDoc
	 *            the XML schema document
	 * 
	 * @return a match result
	 * 
	 * @see #process(SchemaElement)
	 */
	protected MatchResult processRootElements(SchemaDoc pSchemaDoc) {
		final Element schema = pSchemaDoc.getDocument().getDocumentElement();
		if (schema != null) {
			MatchResult matched = null;

			final SchemaElement schemaElement = pSchemaDoc.getSchemaElement(schema);
			final Iterator iterator = schemaElement.getChildren().iterator();
			while (iterator.hasNext()) {
				final SchemaElement childNode = (SchemaElement) iterator.next();

				if (childNode.getLocalName().equals("element")) {
					final MatchResult matchResult = process(childNode);
					matched = MatchResult.merge(matched, matchResult);
					if (!matched.isMatched()) {
						return MatchResult.merge(matched, MatchResult.MATCHED);
					}
				}
			}
			return MatchResult.merge(matched, MatchResult.MATCHED);
		} else {
			return MatchResult.NOT_MATCHED;
		}
	}

	/**
	 * Processes all root element of the current XML schema document.
	 * <p>
	 * For each root element definition in the XML Schema document, the method
	 * {@link #process(SchemaElement)} is called. The loop is ended earlier when
	 * a negative match result is returned. All the object lists of the returned
	 * match results are added together in order and returned as the match
	 * result of this method. The status is set to negative if the process was
	 * ended by a negative result.
	 * 
	 * @return a match result
	 * 
	 * @see #process(SchemaElement)
	 */
	final public MatchResult processRootElements() {
		return processRootElements(mSchemaDoc);
	}
	
	/**
	 * Get the qualifier which is currently being processed
	 * 
	 * @return the qualifier
	 */
	public String getCurrentQualifier() {
		return mCurrentQualifier;
	}
}
