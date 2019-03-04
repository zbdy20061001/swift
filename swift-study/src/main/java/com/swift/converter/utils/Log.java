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
package com.swift.converter.utils;

import java.text.MessageFormat;
import java.util.logging.Level;

/**
 * Convenience class to allow logging.
 * 
 * The default implementation will trace message to the
 * {@link java.lang.System#out} and stack traces to the
 * {@link java.lang.System#err}.
 */
public class Log {
	/**
	 * The class to used when logging statements, by default it is the Log class
	 * itself.
	 */
	private static Class sLogClass = Log.class;
	/** The level which is used for logging, by default it is set to INFO. */
	private static Level sLevel = Level.INFO;
	/** The subject for which logging is generated. */
	private String mSubject;

	/**
	 * Set the implementing class for logging.
	 * 
	 * @param pLogClass
	 *            the implementing class
	 */
	public static void setLogClass(Class pLogClass) {
		sLogClass = pLogClass;
	}

	/**
	 * Set the log level.
	 * 
	 * @param pLevel
	 *            the log level
	 */
	public static void setLevel(Level pLevel) {
		sLevel = pLevel;
	}

	/**
	 * Get the implementing class for logging.
	 * 
	 * @return the implementing class for logging
	 */
	public static Class getLogClass() {
		return sLogClass;
	}

	/**
	 * Get the logger for the specified subject.
	 * 
	 * @param pSubject
	 *            the subject
	 * @return the logger for the subject
	 */
	public static Log getLogger(String pSubject) {
		try {
			final Log instance = (Log) sLogClass.newInstance();
			instance.setSubject(pSubject);
			return instance;
		} catch (final Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Get the logger for the specified class. The class name is used as
	 * subject.
	 * 
	 * @param pClass
	 *            the class
	 * @return the logger for the subject class
	 */
	public static Log getLogger(Class pClass) {
		return getLogger(pClass.getName());
	}

	/**
	 * Set the subject of the logger.
	 * 
	 * @param pSubject
	 *            the subject
	 */
	public void setSubject(String pSubject) {
		mSubject = pSubject;
	}

	/**
	 * Check if tracing is enabled for the specified level.
	 * 
	 * @param pLevel
	 *            the level
	 * @return true if tracing is enabled for the specified level
	 */
	public boolean isTraceEnabled(Level pLevel) {
		return sLevel.intValue() <= pLevel.intValue();
	}

	/**
	 * Trace a message.
	 * 
	 * @param pLevel
	 *            the level of the message
	 * @param pMessage
	 *            the message text
	 * @param pParams
	 *            the parameters which will be copied into the message using the
	 *            {@link java.text.MessageFormat} API
	 * @param pError
	 *            the exception which caused the message to be traced (can be
	 *            null)
	 */
	public void trace(Level pLevel, String pMessage, Object[] pParams, Throwable pError) {
		if (isTraceEnabled(pLevel)) {
			String text = pMessage;
			if ((pParams != null) && (pParams.length > 0)) {
				text = MessageFormat.format(text, pParams);
			}
			System.out.println("TRACE: " + mSubject + ": " + text);
			if (pError != null) {
				pError.printStackTrace();
			}
		}
	}
}
