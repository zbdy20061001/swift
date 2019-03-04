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

import org.w3c.dom.Node;

import com.swift.converter.mt.Xml2MTProcessor;

/**
 * A class that provides the basic functionality to process an XML message for which the syntax is defined by the XML schema
 * document. <br>
 * This class extends the {@link SchemaInputProcessor} class and adds support to process the elements of an XML message while
 * traversing the elements of the schema. The class overrides the methods {@link #processRootElements()},
 * {@link #processElement(SchemaElement)}, {@link #processAny(SchemaElement)} and
 * {@link #processSimpleType(SchemaElement,SchemaElement)}. <br>
 * This class is used as the base class for the XML converter {@link Xml2MTProcessor}.
 * 
 * <p>
 * Processing starts by calling the new method {@link #processRootElements()}.
 * 
 * <pre>
 * 
 * -&gt; processRootElements (LOOP)! &lt;---------------------------------------------
 *    -&gt; process &lt;------------------------------------------------------------ &circ;
 *       -&gt; processStart                                                     &circ; |
 *          -&gt; processLoop (LOOP)                                            | |
 *             -&gt; processLoopOccurrence                                      | |
 *                -&gt; processDispatch                                         | |
 *                   -&gt; processRefElement -----------------------------------&circ; |
 *                   -&gt; processElement!                                      | |
 *                      -&gt; processMessageElement(pSchemaElement)             | |
 *                      -&gt; processMessageElement(pSchemaElement,Node)        | |
 *                         -------------------&gt; processTypeAndChildren       | |
 *                   -&gt; processAttribute ---&circ;   -&gt; processType               | |
 *                   -&gt; processRestriction -&circ;   -v -&gt; processSimpleType!     | |
 *                   -&gt; processExtension ---&circ;    | --------------------------&circ; | 
 *                   -&gt; processSequence -v       v                           | |
 *                   ------------------------------&gt; processChildren (LOOP)  | |
 *                                                   -&gt; processChild --------&circ; |
 *                   -&gt; processChoice (LOOP) --------------------------------&circ; |
 *                   -&gt; processAnnotation                                      |
 *                   -&gt; processAny! -------------------------------------------&circ;
 * </pre>
 * 
 * The method {@link #processElement(SchemaElement)} is checking if the current XML message node matches the current Schema element.
 * The current XML message node returned by {@link #getCurrentMessageNode()}, will traverse child nodes of the current XML message
 * before sibling nodes. If it matches, the next XML message node is selected and a new method
 * {@link #processMessageElement(SchemaElement,Node)} is called with the matched message node as extra argument. If there is no
 * match a new method {@link #processMessageElement(SchemaElement)} is called that by default returns a negative matched result.
 * <p>
 * The method {@link #processAny(SchemaElement)} resolves the namespace URI of the current XML message node and continues processing
 * the XML message for which the syntax is defined by the new XML schema document.
 * <p>
 * The method {@link #processSimpleType(SchemaElement,SchemaElement)} returns the content of all text nodes of the message.
 * 
 * @see SchemaMessageProcessor
 * @see Xml2MTProcessor
 * 
 * @author SWIFT
 */
public class SchemaMessageProcessor extends SchemaInputProcessor {
	/** XML message node */
	private final Node mMessageNode;
	/** current XML message node */
	private Node mCurrentMessageNode;
	/** current XML message node is a child node */
	private boolean mIsChildMessageNode;

	/**
	 * Creates an XML message processor for which the syntax is defined by the XML schema document.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 * @param pMessageNode
	 *            the DOM node containing the XML message
	 * @param pErrorHandler
	 *            an error handler instance
	 */
	protected SchemaMessageProcessor(SchemaDoc pSchemaDoc, Node pMessageNode, IErrorHandler pErrorHandler) {
		super(pSchemaDoc, pErrorHandler);

		mMessageNode = pMessageNode;
		mCurrentMessageNode = mMessageNode.getFirstChild();
		mIsChildMessageNode = true;
	}

	/**
	 * Creates an XML message processor for which the syntax is defined by the XML schema document.
	 * 
	 * @param pSchemaDoc
	 *            a Schema document
	 * @param pMessageNode
	 *            the DOM node containing the XML message
	 */
	protected SchemaMessageProcessor(SchemaDoc pSchemaDoc, Node pMessageNode) {
		this(pSchemaDoc, pMessageNode, new DefaultErrorHandler());
	}

	/**
	 * Gets the current XML message node.
	 * 
	 * @return the current XML message node
	 */
	final public Node getCurrentMessageNode() {
		return mCurrentMessageNode;
	}

	/**
	 * Returns the XPath expression of a specified XML message node as a String.
	 * 
	 * @param pMessageNode
	 *            an XML message node
	 * @return the XPath expression of a specified XML message node
	 */
	protected static String getXPath(Node pMessageNode) {
		final StringBuffer sb = new StringBuffer();
		for (; pMessageNode != null; pMessageNode = pMessageNode.getParentNode()) {
			if (pMessageNode.getNodeType() == Node.ELEMENT_NODE) {
				int index = 1;
				for (Node previousSibling = pMessageNode.getPreviousSibling(); previousSibling != null; previousSibling = previousSibling
						.getPreviousSibling()) {
					if ((previousSibling.getNodeType() == Node.ELEMENT_NODE)
							&& pMessageNode.getNodeName().equals(previousSibling.getNodeName())) {
						index++;
					}
				}
				sb.insert(0, ']').insert(0, index).insert(0, '[').insert(0, pMessageNode.getNodeName()).insert(0, '/');
			}
		}
		return sb.toString();
	}

	/**
	 * Gets the next node of a specified XML message node. <br>
	 * It will return a sibling node first before reverting back to the sibling nodes of the parent node.
	 * 
	 * @param pMessageNode
	 *            an XML message node
	 * @return the next XML message node
	 */
	private Node getNextMessageNode(Node pMessageNode) {
		if (pMessageNode.getNextSibling() != null) {
			return pMessageNode.getNextSibling();
		} else if ((pMessageNode.getParentNode() != null) && (pMessageNode.getParentNode() != mMessageNode)) {
			mIsChildMessageNode = false;
			return getNextMessageNode(pMessageNode.getParentNode());
		} else {
			return null;
		}
	}

	/**
	 * Sets the next XML message node. <br>
	 * The current XML message node will traverse child nodes of the current XML message before sibling nodes.
	 */
	private void setNextMessageNode() {
		if (mCurrentMessageNode.getFirstChild() != null) {
			mIsChildMessageNode = true;
			mCurrentMessageNode = mCurrentMessageNode.getFirstChild();
		} else {
			mCurrentMessageNode = getNextMessageNode(mCurrentMessageNode);
		}
	}

	/**
	 * Skip any non-element nodes as next XML message node.
	 */
	private void skipNonElementNode() {
		while ((getCurrentMessageNode() != null) && (getCurrentMessageNode().getNodeType() != Node.ELEMENT_NODE)) {
			mIsChildMessageNode = false;
			setNextMessageNode();
		}
	}

	/**
	 * This method is checking if the current XML message node matches the current Schema element. <br>
	 * The current XML message node returned by {@link #getCurrentMessageNode()} , will traverse child nodes of the current XML
	 * message before sibling nodes. If it matches, the next XML message node is selected and a new method
	 * {@link #processMessageElement(SchemaElement,Node)} is called with the matched message node as extra argument. If there is no
	 * match a new method {@link #processMessageElement(SchemaElement)} is called.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see #processMessageElement(SchemaElement,Node)
	 * @see #processMessageElement(SchemaElement)
	 */
	final protected MatchResult processElement(SchemaElement pSchemaElement) {

		skipNonElementNode();
		if (getCurrentMessageNode() != null) {
			final String nameAttr = pSchemaElement.getNameAttribute();
			final String localName = getCurrentMessageNode().getLocalName();
			if (nameAttr.equals(localName)) {
				final Node messageNode = getCurrentMessageNode();
				mIsChildMessageNode = false;
				setNextMessageNode();
				return processMessageElement(pSchemaElement, messageNode);
			}
		}
		return processMessageElement(pSchemaElement);
	}

	/**
	 * This method is called when the current XML message node matches the current Schema element. <br>
	 * It will forward the call to the method {@link SchemaProcessor#processElement(SchemaElement)}.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param messageNode
	 *            the XML message node that matches the current Schema element
	 * 
	 * @return a match result
	 * 
	 * @see SchemaProcessor#processElement(SchemaElement)
	 */
	protected MatchResult processMessageElement(SchemaElement pSchemaElement, Node messageNode) {
		return super.processElement(pSchemaElement);
	}

	/**
	 * This method is called when the current XML message node doesn't match the current Schema element. <br>
	 * It returns an empty negative match result.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return an empty negative match result
	 */
	protected MatchResult processMessageElement(SchemaElement pSchemaElement) {
		return MatchResult.NOT_MATCHED;
	}

	/**
	 * This method is called for an any definition.<br>
	 * This method resolves the namespace URI of the current XML message node and continues processing the XML message for which the
	 * syntax is defined by the new XML schema document.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * 
	 * @return a match result
	 */
	protected MatchResult processAny(SchemaElement pSchemaElement) {
		try {
			skipNonElementNode();
			final Node node = getCurrentMessageNode();
			if (node != null) {
				final String namespaceURI = node.getNamespaceURI();
				final SchemaDoc schemaDoc = pSchemaElement.getSchemaDoc().getSchemaDoc(namespaceURI);
				return processRootElements(schemaDoc);
			} else {
				return MatchResult.NOT_MATCHED;
			}
		} catch (SchemaException e) {
			getErrorHandler().add(e);
			return MatchResult.NOT_MATCHED;
		}
	}

	/**
	 * This method returns a positive match result that holds the content of all text or cdata section nodes of the current XML
	 * message node.
	 * 
	 * @param pSchemaElement
	 *            the current Schema element
	 * @param pTypeElement
	 *            the type element to match from the input
	 * 
	 * @return a positive match result
	 */
	protected MatchResult processSimpleType(SchemaElement pSchemaElement, SchemaElement pTypeElement) {
		final StringBuffer result = new StringBuffer();
		while ((getCurrentMessageNode() != null)
				&& mIsChildMessageNode
				&& ((getCurrentMessageNode().getNodeType() == Node.TEXT_NODE) || (getCurrentMessageNode().getNodeType() == Node.CDATA_SECTION_NODE))) {
			result.append(getCurrentMessageNode().getNodeValue());
			setNextMessageNode();
		}
		return new MatchResult(result);
	}

	/**
	 * Processes one of the root elements of the specified XML schema document from the input message.
	 * <p>
	 * It will forward the call to the method {@link SchemaInputProcessor#processRootElements()} and skips any additional
	 * non-element XML message nodes.
	 * 
	 * @param pSchemaDoc
	 * 
	 * @return a match result
	 * 
	 * @see SchemaInputProcessor#processRootElements()
	 */
	final public MatchResult processRootElements(SchemaDoc pSchemaDoc) {
		final MatchResult matchResult = super.processRootElements(pSchemaDoc);
		skipNonElementNode();
		return matchResult;
	}
}
