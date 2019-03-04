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

import java.util.logging.Level;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.swift.converter.mt.CreateInfoProcessor;
import com.swift.converter.mt.Xml2MTException;
import com.swift.converter.mt.Xml2MTProcessor;
import com.swift.converter.utils.Log;
import com.swift.converter.utils.PrintableString;
import com.swift.converter.xml.ISchemaDocResolver;
import com.swift.converter.xml.MatchResult;
import com.swift.converter.xml.SchemaDoc;
import com.swift.converter.xml.SchemaHelper;

/**
 * The Xml2MT class is the main entry point for converting an XML version of an
 * MT message into its native MT format.
 * <p>
 * To create instances, a DOM document, holding the XML schema representing the
 * MT message, needs to be passed to the constructor of the class.
 * A second constructor requires an additional schema resolver that will be called to
 * resolve imported namespaces.
 * <p>
 * Once the instance is created the {@link #convert(Node)} method can be used to
 * parse the XML. The method returns the MT message as its return value.
 * <p>
 * Xml2MT instances can be used to convert several XML versions of MT messages
 * in sequence. A single Xml2MT instance should not be used concurrently.
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
 * // create an Xml2MT instance
 * final Xml2MT xml2mt = new Xml2MT(schema);
 * 
 * // convert an XML version of an MT message to its native format
 * final String mt103block4content = xml2mt.convert(xmlMt103);
 * </pre>
 * 
 * <p>
 * It is also possible to convert entire MT messages (block 1 to 5).
 * To do this, the schema for the entire message must be used as input
 * for creating a {@link SchemaDoc} instance. At runtime, dependent schema's
 * will be resolved using a {@link ISchemaDocResolver}. The {@link SchemaDoc}
 * for the entire message schema must be used as argument for creating the
 * Xml2MT instance.
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
 * // create an Xml2MT instance
 * final SchemaDoc schemaDoc = new SchemaDoc(schema, resolver);
 * final Xml2MT xml2mt = new Xml2MT(schemaDoc);
 * 
 * // convert an XML version of an entire MT message (block 1 to 5) to its native format
 * final String entireMtMessage = xml2mt.convert(entireXMLMessage);
 * </pre>
 * 
 * @author SWIFT
 */
public class Xml2MT {
	/** The logger used by this class */
	private final static Log LOGGER = Log.getLogger(Xml2MT.class);

	/** The current schema document */
	private final SchemaDoc mSchemaDoc;

	/**
	 * Creates a new Xml2MT class by providing the schema which needs to be used
	 * during the conversion.
	 * 
	 * @param pXmlSchema
	 *            the document holding the schema of the MT message.
	 */
	public Xml2MT(Document pXmlSchema) {
		this(new SchemaDoc(pXmlSchema));
	}

	/**
	 * Creates a new Xml2MT class by providing the {@link SchemaDoc} which needs
	 * to be used during the conversion.
	 * 
	 * @param pXmlSchemaDoc
	 *            the schema document holding the schema of the MT message
	 */
	public Xml2MT(SchemaDoc pXmlSchemaDoc) {
		mSchemaDoc = pXmlSchemaDoc;
		final CreateInfoProcessor processor = new CreateInfoProcessor(mSchemaDoc);
		processor.processRootElements();
	}

	/**
	 * Convert an XML version of an MT message to its native format
	 * 
	 * The message provided in the <code>pMessageNode</code> parameter should
	 * be of the message type that corresponds to the XML schema passed in the
	 * constructor of the Xml2MT class.
	 * 
	 * @param pMessageNode
	 *            the DOM node containing the XML message
	 * @return the MT message
	 * @throws ErrorReportException
	 *             an exception containing a detailed error report if the
	 *             conversion failed
	 */
	public String convert(Node pMessageNode) throws ErrorReportException {
		final MatchResult matchResult = convert0(pMessageNode);
		String result = SchemaHelper.getStringWithCr2CrLf(matchResult);
		LOGGER.trace(Level.FINE, "Message:{0}", new Object[] { new PrintableString(result) }, null);
		return result;
	}

	/**
	 * Convert an XML version of an MT message to its native format
	 * 
	 * @param pMessageNode
	 *            the DOM node containing the message
	 * @return the MatchResult containing the native MT message
	 * @throws ErrorReportException
	 *             an exception containing a detailed error report if the
	 *             conversion failed
	 */
	private MatchResult convert0(Node pMessageNode) throws ErrorReportException {
		final ReportErrorHandler errorHandler = new ReportErrorHandler();
		final Xml2MTProcessor processor = new Xml2MTProcessor(mSchemaDoc, pMessageNode, errorHandler);

		MatchResult matchResult = null;
		try {
			matchResult = processor.process();
		} catch (final Xml2MTException e) {
			errorHandler.add(e);
		}
		errorHandler.checkEnd(pMessageNode);
		return matchResult;
	}
}
