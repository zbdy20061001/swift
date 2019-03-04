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

import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;

/**
 * Default implementation of an exception.
 * <P>
 * This exception provides a static method for performing parameter substitution
 * that can be used by other exception implementations if required. Component
 * and application developers are expected to subclass from this exception.
 * <P>
 */
public class SwiftException extends Exception {
	/** Serial Version UID */
	private static final long serialVersionUID = -6088231551450893294L;

	/** Default error code used for unhandled exceptions */
	public static final String UNHANDLED_EXCEPTION = "Swift.000.000";

	/** Constant for system independent newline character */
	public static final String NEWLINE = System.getProperty("line.separator");
	/** Constant for empty actions */
	public static final String EMPTY_ACTION = "";
	/** Trailer used to find text messages */
	public static final String TEXT_TRAILER = ".text";
	/** Trailer user to find action messages */
	public static final String ACTION_TRAILER = ".action";
	/** The name of the property file containing the error text and action. */
	public static final String PROPERTIES_FILE = "Exception.properties";

	/** All errors which were found in loaded Exception.properties files */
	private static final Map/* String,String */ERRORS = new HashMap();
	/**
	 * The classes for which an Exception.properties was loaded. This is used to
	 * avoid loading the file each time an exception is thrown.
	 */
	private static final Set/* Class */LOADED_MAPS = new HashSet();

	/* private member variables */
	private final String mCode;
	private final String mFormat;
	private final Object[] mParameters;
	private final String mAction;

	/**
	 * This constructor will try to find an Exception.properties file that
	 * should be located in the same package as the deriving class. It will use
	 * this file find the corresponding message and action for the exception
	 * code. The Exception.properties file should have an entry for errorID.text
	 * which contains the error messages and an errorID.action which contains
	 * the action.
	 * 
	 * @param pErrorID
	 *            a unique code for this exception constructed from a component
	 *            code AAA and an exception code YYY.ZZZ in the form AAA.YYY.ZZZ
	 * @param pParameters
	 *            the array of parameter object to be substituted in the error
	 *            message
	 * @param pEmbeddedException
	 *            the exception from another layer/component that is being
	 *            re-thrown
	 */
	public SwiftException(String pErrorID, Object[] pParameters, Throwable pEmbeddedException) {
		super(pEmbeddedException);
		mCode = pErrorID;
		mFormat = getTextForCode(pErrorID);
		mParameters = pParameters;
		mAction = getActionForCode(pErrorID);
	}

	/**
	 * Returns the unique ID code of this exception.
	 * <P>
	 * 
	 * @return the unique ID code of this exception
	 */
	public String getCode() {
		return mCode;
	}

	/**
	 * Returns the parameters of this exception.
	 * <P>
	 * 
	 * @return the parameters of this exception
	 */
	public Object[] getParameters() {
		return mParameters;
	}

	/**
	 * Returns the default message of this exception. Parameters are substituted
	 * into their place holders in the message.
	 * <P>
	 * 
	 * @return the default message of this exception
	 */
	public String getMessage() {
		// override Exception.getMessage to return our own
		if (mParameters != null) {
			return MessageFormat.format(mFormat, mParameters);
		}
		return mFormat;
	}

	/**
	 * Returns the format of this exception.
	 * <P>
	 * 
	 * @return the format of this exception
	 */
	public String getFormat() {
		return mFormat;
	}

	/**
	 * Returns the action text for this exception.
	 * <P>
	 * 
	 * @return the action text for this exception
	 */
	public String getAction() {
		return mAction;
	}

	/**
	 * This function retrieves the error text from the Exception.properties
	 * file. This file must be located in the same package as the deriving
	 * class. The function will use this file to find the corresponding error
	 * text for the exception code. The Exception.properties file should have an
	 * entry aCode.text which contains the action.
	 * 
	 * @param pCode
	 *            a unique code for this exception constructed from a component
	 *            code AAA and an exception code YYY.ZZZ in the form AAA.YYY.ZZZ
	 * @return he error text string
	 */
	protected final String getTextForCode(String pCode) {
		String result = null;

		result = getErrorProperty(pCode + TEXT_TRAILER);
		if (result == null) {
			return pCode; // no translation possible
		}
		return result;
	}

	/**
	 * This function retrieves the action from the Exception.properties file.
	 * This file must be located in the same package as the deriving class. The
	 * function will use this file to find the corresponding action for the
	 * exception code. The Exception.properties file should have an entry
	 * aCode.action which contains the action.
	 * 
	 * @param pCode
	 *            a unique code for this exception constructed from a component
	 *            code AAA and an exception code YYY.ZZZ in the form AAA.YYY.ZZZ
	 * @return the action string
	 */
	protected final String getActionForCode(String pCode) {
		String result = null;

		result = getErrorProperty(pCode + ACTION_TRAILER);
		if (result == null) {
			return pCode; // no translation possible
		}
		return result;
	}

	/**
	 * Convenience method to retrieve a key from a set of property files.
	 * 
	 * @param pKey
	 *            the key which needs to be found
	 * @return the value for the specified key
	 */
	private String getErrorProperty(String pKey) {
		String result = null;

		synchronized (SwiftException.class) {
			result = (String) ERRORS.get(pKey);
			if (result == null) {
				if (!LOADED_MAPS.contains(getClass())) {
					ERRORS.putAll(loadMap(PROPERTIES_FILE));
					result = (String) ERRORS.get(pKey);
					LOADED_MAPS.add(getClass());
				}
			}
		}

		return result;
	}

	/**
	 * This function loads the properties of the specified file in a map.
	 * 
	 * @param pFilename
	 *            the property file
	 * @return a map with the properties
	 */
	protected Map loadMap(final String pFilename) {
		Properties result = null;
		InputStream stream = null;

		result = new Properties();
		try {
			stream = (InputStream) AccessController.doPrivileged(new PrivilegedAction() {
				public Object run() {
					return SwiftException.this.getClass().getResourceAsStream(pFilename);
				}
			});

			result.load(stream);
		} catch (final Throwable t) {
			// This should not happen, and if it does it is not fatal.
			// The problem will be unclear error messages if something else goes
			// wrong but will have no impact on the rest of the code.
			try {
				Log.getLogger(SwiftException.class).trace(Level.WARNING, "Failed to loaded {0} for class {1}",
						new Object[] { pFilename, getClass() }, t);
			} catch (final Throwable ignore) {
				// logging the error failed, ignore it
			}
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (final Throwable ignore) {
					// ignore the exception while closing the stream
				}
				stream = null;
			}
		}

		return result;
	}
}
