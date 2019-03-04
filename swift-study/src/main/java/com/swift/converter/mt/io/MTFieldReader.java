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
package com.swift.converter.mt.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.swift.converter.io.LineNumberPushbackReader;
import com.swift.converter.mt.MT2XmlException;

/**
 * An object of this class represent an MT field reader. It reads
 * {@link MTField} objects from a reader.
 * <p>
 * The methods {@link #getLookahead()} or {@link #getLookahead(int)} returns the
 * next input field. The method {@link #check(int,String)} checks if the next
 * input field matches a specific type and tag and the methods
 * {@link #match(int)} or {@link #match(int,String)} checks if the next input
 * field matches a specific type and tag and removes it from the input.
 * <p>
 * The methods {@link #getPosition()} and {@link #restorePosition(int)} can be
 * used to save and restore the position of the next input field.
 * 
 * @see MTField
 * @see LineNumberPushbackReader
 * 
 * @author SWIFT
 */
public class MTFieldReader {
	/** the current reader from which fields will be read */
	private final LineNumberPushbackReader mReader;
	/** all the MT fields read so far */
	private final List /* <MTField> */mMTFields = new ArrayList();
	/** position of the next input field */
	private int mLookaheadPosition = 0;
	/** position of the last next input field ever seen */
	private int mMaxLookaheadPosition = 0;
	/** last parsing exception */
	private MT2XmlException mException = null;

	/**
	 * Creates a MT field reader, reading MT fields form the specified reader.
	 * 
	 * @param pReader
	 *            a buffered character-stream reader from which fields will be
	 *            read that allows characters to be pushed back into the stream
	 *            and that keeps track of line numbers
	 */
	public MTFieldReader(LineNumberPushbackReader pReader) {
		mReader = pReader;
	}

	/**
	 * @return the current reader from which fields will be read
	 */
	public LineNumberPushbackReader getReader() {
		return mReader;
	}

	/**
	 * Return all lookahead token(s) started from the specified position back to input stream.
	 * 
	 * @param pPosition
	 *            the position of the input field
	 */
	private void unreadLookahead(int pPosition) {
		while (pPosition < mMTFields.size()) {
			final MTField getLookahead = (MTField) mMTFields.remove(mMTFields.size() - 1);
			try {
				mReader.unread(getLookahead.toString().toCharArray());
			} catch (final IOException e) {
				throw new RuntimeException("Can't put lookaheads back to reader");
			}
		}
	}

	/**
	 * Return all lookahead token(s) back to input stream.
	 */
	public void unreadLookahead() {
		unreadLookahead(mLookaheadPosition);
	}
	
	/**
	 * Returns the input field of a specific type at a specific field position.
	 * 
	 * @param pPosition
	 *            the position of the input field
	 * @param pMTFieldType
	 *            the expected field type (MTField.TYPE_UNKNOWN,
	 *            MTField.TYPE_BLOCK, MTField.TYPE_MT, MTField.TYPE_ALL or
	 *            MTField.TYPE_CRLF_ALL)
	 * @return the MT field
	 * @throws IOException
	 *             if an I/O error occurs
	 * @throws MT2XmlException
	 *             parsing error occurred
	 */
	private MTField getLookahead(int pPosition, int pMTFieldType) throws IOException, MT2XmlException {
		MTField getLookahead;
		if (pPosition < mMTFields.size()) {
			getLookahead = (MTField) mMTFields.get(pPosition);
			if ((pMTFieldType == MTField.TYPE_UNKNOWN) || (pMTFieldType == getLookahead.getType())) {
				return getLookahead;
			}

			// return all lookahead token(s) back to input stream if wrong type
			// was parsed
			mException = null;
			unreadLookahead(pPosition);
		}

		if(pPosition == 0) {
			mException = null;
		} else if (mException != null) {
			throw mException;
		}

		while (pPosition >= mMTFields.size()) {
			try {
				getLookahead = new MTField(pMTFieldType, mReader);
				mMTFields.add(getLookahead);
			} catch (final MT2XmlException e) {
				mException = e;
				throw e;
			}
		}
		getLookahead = (MTField) mMTFields.get(pPosition);
		return getLookahead;
	}

	/**
	 * Returns the next input field of a specific type.
	 * 
	 * @param pMTFieldType
	 *            the expected field type (MTField.TYPE_UNKNOWN,
	 *            MTField.TYPE_BLOCK, MTField.TYPE_MT, MTField.TYPE_ALL or
	 *            MTField.TYPE_CRLF_ALL)
	 * @return the next MT field of a specific type
	 * @throws IOException
	 *             if an I/O error occurs
	 * @throws MT2XmlException
	 *             parsing error occurred
	 */
	public MTField getLookahead(int pMTFieldType) throws IOException, MT2XmlException {
		return getLookahead(mLookaheadPosition, pMTFieldType);
	}

	/**
	 * Returns the next input field. The field type will end up as
	 * MTField.TYPE_BLOCK or MTField.TYPE_MT depending on the input read.
	 * 
	 * @return the next MT field
	 * @throws MT2XmlException
	 *             parsing error occurred
	 */
	public MTField getLookahead() throws MT2XmlException {
		try {
			return getLookahead(MTField.TYPE_UNKNOWN);
		} catch (final IOException e) {
			return null;
		}
	}

	/**
	 * Returns the last next input field ever seen.
	 * 
	 * @return the MT field
	 * @throws MT2XmlException
	 *             parsing error occurred
	 */
	public MTField getMaxLookahead() throws MT2XmlException {
		try {
			return getLookahead(mMaxLookaheadPosition, MTField.TYPE_UNKNOWN);
		} catch (final IOException e) {
			return null;
		}
	}

	/**
	 * Returns the current position of the next input field.
	 * 
	 * @return the current position of the next input field
	 */
	public int getPosition() {
		return mLookaheadPosition;
	}

	/**
	 * Sets a new position for the next input field.
	 * 
	 * @param pPosition
	 *            the new position of the next input field
	 */
	public void restorePosition(int pPosition) {
		mLookaheadPosition = pPosition;
	}

	/**
	 * Matches the next input field with the specific type.
	 * 
	 * @param pMTFieldType
	 *            the expected field type (MTField.TYPE_BLOCK, MTField.TYPE_MT,
	 *            MTField.TYPE_ALL or MTField.TYPE_CRLF_ALL)
	 * @return the matched MT field
	 * @throws IOException
	 *             if an I/O error occurs
	 * @throws MT2XmlException
	 *             parsing error occurred or when the next input field doesn't
	 *             match the specified field type
	 */
	public MTField match(int pMTFieldType) throws IOException, MT2XmlException {
		final MTField getLookahead = getLookahead(pMTFieldType);
		mLookaheadPosition++;
		if (mLookaheadPosition > mMaxLookaheadPosition) {
			mMaxLookaheadPosition = mLookaheadPosition;
		}
		return getLookahead;
	}

	/**
	 * Checks if the next input field will match the specific type and tag.
	 * 
	 * @param pMTFieldType
	 *            the expected field type (MTField.TYPE_BLOCK, MTField.TYPE_MT,
	 *            MTField.TYPE_ALL or MTField.TYPE_CRLF_ALL)
	 * @param pTag
	 *            the expected field tag or null if the tag should not be
	 *            checked (must always be null for MTField.TYPE_ALL or
	 *            MTField.TYPE_CRLF_ALL)
	 * @return true if the next input field matches the specific tag
	 * @throws IOException
	 *             if an I/O error occurs
	 * @throws MT2XmlException
	 *             parsing error occurred or when the next input field doesn't
	 *             match the specified field type
	 */
	private boolean checkWithException(int pMTFieldType, String pTag) throws IOException, MT2XmlException {
		final MTField getLookahead = getLookahead(pMTFieldType);
		return ((pTag == null) || getLookahead.getTag().equals(pTag));
	}

	/**
	 * Checks if the next input field matches the specific type and tag.
	 * 
	 * @param pMTFieldType
	 *            the expected field type (MTField.TYPE_BLOCK, MTField.TYPE_MT,
	 *            MTField.TYPE_ALL or MTField.TYPE_CRLF_ALL)
	 * @param pTag
	 *            the expected field tag or null if the tag should not be
	 *            checked (must be null for MTField.TYPE_ALL or
	 *            MTField.TYPE_CRLF_ALL)
	 * @return true if the next input field matches the specific field type and
	 *         tag
	 */
	public boolean check(int pMTFieldType, String pTag) {
		try {
			return checkWithException(pMTFieldType, pTag);
		} catch (final IOException e) {
			return false;
		} catch (final MT2XmlException e) {
			return false;
		}
	}

	/**
	 * Matches the next input field with the specific type and tag.
	 * 
	 * @param pMTFieldType
	 *            the expected field type (MTField.TYPE_BLOCK, MTField.TYPE_MT,
	 *            MTField.TYPE_ALL or MTField.TYPE_CRLF_ALL)
	 * @param pTag
	 *            the expected field tag or null if the tag should not be
	 *            matched (must be null for MTField.TYPE_ALL or
	 *            MTField.TYPE_CRLF_ALL)
	 * @return the matched MT field
	 * @throws IOException
	 *             if an I/O error occurs
	 * @throws MT2XmlException
	 *             parsing error occurred or when the next input field doesn't
	 *             match the specified field type and tag
	 */
	public MTField match(int pMTFieldType, String pTag) throws IOException, MT2XmlException {
		if (!checkWithException(pMTFieldType, pTag)) {
			switch (pMTFieldType) {
			case MTField.TYPE_BLOCK:
				throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_BLOCK_EXPECTED, new Object[] { pTag },
						null);
			case MTField.TYPE_MT:
				throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_MT_EXPECTED, new Object[] { pTag }, null);
			case MTField.TYPE_ALL:
				throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_ALL_EXPECTED, null, null);
			case MTField.TYPE_CRLF_ALL:
				throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_CRLF_ALL_EXPECTED, null, null);
			default:
				throw new RuntimeException("Unsupported type " + pMTFieldType);
			}
		}
		return match(pMTFieldType);
	}

	/**
	 * Flush all the read MT fields from the reader, resetting it to its initial
	 * state
	 */
	public void flush() {
		mMTFields.clear();
		mLookaheadPosition = 0;
		mMaxLookaheadPosition = 0;
	}
}
