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
package com.swift.converter;

import java.io.PushbackReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.swift.converter.io.LineNumberPushbackReader;
import com.swift.converter.mt.CreateInfoProcessor;
import com.swift.converter.mt.MT2XmlException;
import com.swift.converter.mt.MT2XmlProcessor;
import com.swift.converter.mt.MTInputProcessor;
import com.swift.converter.mt.io.MTFieldReader;
import com.swift.converter.utils.Log;
import com.swift.converter.utils.PrintableString;
import com.swift.converter.xml.ISchemaDocResolver;
import com.swift.converter.xml.MatchResult;
import com.swift.converter.xml.SchemaDoc;

/**
 * The MT2Xml class is the main entry point for converting MT messages into
 * their corresponding XML format.
 * <p>
 * To create instances, a DOM document, holding the XML schema representing the
 * MT message, needs to be passed to the constructor of the class.<br>
 * A second constructor requires an additional schema resolver that will be
 * called to resolve imported namespaces.
 * <p>
 * Once the instance is created the {@link #convert(String, Node)} method can be
 * used to read a native MT message and convert it into its XML version. The XML
 * version of the MT message will be appended to the provided node.
 * <p>
 * MT2Xml instances can be used to convert several MT messages in sequence. A
 * single MT2Xml instance should not be used concurrently.
 * <p>
 * Example:
 * 
 * <pre>
 * // parse the XML schema into a DOM document
 * final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
 * builderFactory.setNamespaceAware(true);
 * final DocumentBuilder builder = builderFactory.newDocumentBuilder();
 * final Document schema = builder.parse(new File(&quot;fin.103.2008.xsd&quot;));
 * 
 * // create an MT2Xml instance
 * final MT2Xml mt2xml = new MT2Xml(schema);
 * 
 * // convert an MT message to its corresponding XML format
 * final Document result = builder.newDocument();
 * mt2xml.convert(mt103block4content, result);
 * </pre>
 * <p>
 * It is also possible to convert entire MT messages (block 1 to 5) to a DOM
 * document. To do this, the schema for the entire message must be used as input
 * for creating a {@link SchemaDoc} instance. At runtime, dependent schema's
 * will be resolved using a {@link ISchemaDocResolver}. The {@link SchemaDoc}
 * for the entire message schema must be used as argument for creating the
 * MT2Xml instance.
 * <p>
 * Example:
 * 
 * <pre>
 * // parse the XML schema for the entire MT message (block 1 to 5)
 * final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
 * builderFactory.setNamespaceAware(true);
 * final DocumentBuilder builder = builderFactory.newDocumentBuilder();
 * final Document schema = builder.parse(new File(&quot;mtmsg.2008.xsd&quot;));
 * 
 * // create a ISchemaDocResolver which loads the correct schema by filename
 * ISchemaDocResolver resolver = new ISchemaDocResolver() {
 * 	 public SchemaDoc resolveSchemaDoc(final String pNamespaceURI) {
 *     // the namespace which is passed here it the namespace of the block 4 content
 *     if(pNamespaceURI.endsWith(&quot;fin.103.2008&quot;)) {
 *       final DocumentBuilder builder = builderFactory.newDocumentBuilder();
 *       final Document schema = builder.parse(new File(&quot;fin.103.2008.xsd&quot;));
 *       return new SchemaDoc(schema);
 *     }
 *     
 *     return null;
 *   }
 * };
 * 
 * // create an MT2Xml instance
 * final SchemaDoc schemaDoc = new SchemaDoc(schema, resolver);
 * final MT2Xml mt2xml = new MT2Xml(schemaDoc);
 * 
 * // convert an entire MT message (block 1 to 5) to its corresponding XML format
 * final Document result = builder.newDocument();
 * mt2xml.convert(entireMessage, result); 
 * </pre>
 * 
 * @author SWIFT
 */
public class MT2Xml {
	/** The logger used by this class */
	private static final Log LOGGER = Log.getLogger(MT2Xml.class);

	/** The current schema document */
	private final SchemaDoc mSchemaDoc;

	/**
	 * Creates a new MT2Xml class by providing the schema which needs to be used
	 * during the conversion.
	 * 
	 * @param pXmlSchema
	 *            the document holding the schema of the MT message
	 */
	public MT2Xml(Document pXmlSchema) {
		this(new SchemaDoc(pXmlSchema));
	}

	/**
	 * Creates a new MT2Xml class by providing the {@link SchemaDoc} which needs
	 * to be used during the conversion.
	 * 
	 * @param pXmlSchemaDoc
	 *            the schema document holding the schema of the MT message
	 */
	public MT2Xml(SchemaDoc pXmlSchemaDoc) {
		mSchemaDoc = pXmlSchemaDoc;
		final CreateInfoProcessor processor = new CreateInfoProcessor(mSchemaDoc);
		processor.processRootElements();
	}

	/**
	 * Convert an MT message by reading it from the reader and appending the XML
	 * elements to the specified pMessageNode.
	 * 
	 * @param pReader
	 *            the reader containing the MT message
	 * @param pMessageNode
	 *            the message node to which the XML elements will be appended
	 * @throws ErrorReportException
	 *             the exception holding the detailed error report when parsing
	 *             failed
	 */
	private void convert(Reader pReader, Node pMessageNode) throws ErrorReportException {
		final PushbackReader pbReader = new PushbackReader(pReader, MT2XmlProcessor.MT_MAX_MSGSIZE);
		final LineNumberPushbackReader lineReader = new LineNumberPushbackReader(pbReader);
		final MTFieldReader fieldReader = new MTFieldReader(lineReader);
		final ReportErrorHandler errorHandler = new ReportErrorHandler();
		final MT2XmlProcessor processor = new MT2XmlProcessor(mSchemaDoc, fieldReader, pMessageNode, errorHandler);

		MatchResult matchResult = null;
		try {
			matchResult = processor.process();
		} catch (final MT2XmlException e) {
			errorHandler.add(e);
		}
		errorHandler.checkEnd(pMessageNode);
		MTInputProcessor.appendChild(pMessageNode, matchResult);
	}

	/**
	 * The convert method reads the MT message from a Java string and stores the
	 * XML version into the provided DOM node.
	 * 
	 * The message provided in the <code>pMessage</code> parameter should be of
	 * the message type that corresponds to the XML schema passed in the
	 * constructor of the MT2Xml class.
	 * 
	 * @param pMessage
	 *            the string holding the MT message
	 * @param pMessageNode
	 *            the message node to which the XML elements will be appended
	 * @throws ErrorReportException
	 *             the exception holding the detailed error report when parsing
	 *             failed
	 */
	public void convert(String pMessage, Node pMessageNode) throws ErrorReportException {
		LOGGER.trace(Level.FINE, "Message:{0}", new Object[] { new PrintableString(pMessage) }, null);
		if (pMessage != null) {
			convert(new StringReader(pMessage), pMessageNode);
		}
	}
}
