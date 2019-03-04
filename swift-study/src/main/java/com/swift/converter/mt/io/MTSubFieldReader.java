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

/**
 * An object of this class represent an subfield reader.
 * <p>
 * 
 * The methods {@link #getContentLeft()} or {@link #getContentLeft(int)} returns the
 * remaining characters. The methods {@link #match()}, {@link #match(int)} and
 * {@link #match(String)} removes a specific number of characters from the
 * content.
 * <p>
 * The methods {@link #getPosition()} and {@link #restorePosition(int)} can be
 * used to save and restore the position of the next input.
 * 
 * @see MTField
 * @author SWIFT
 */
public class MTSubFieldReader {
	private final String mContent;
	private int mPos;
	private int mPosEnd;

	/**
	 * Creates a subfield reader, reading characters form the specified field
	 * content.
	 * 
	 * @param pContent
	 *            the field content
	 */
	public MTSubFieldReader(String pContent) {
		mContent = pContent;
		mPos = 0;
		mPosEnd = mContent.length();
	}

	/**
	 * Returns the current position in the field content.
	 * 
	 * @return the current position.
	 */
	public int getPosition() {
		return mPos;
	}

	/**
	 * Restores the current position in the field content.
	 * 
	 * @param pPos
	 *            the position to restore.
	 */
	public void restorePosition(int pPos) {
		mPos = pPos;
	}

	/**
	 * Returns the field content starting at the current position.
	 * 
	 * @return the field content.
	 */
	public String getContentLeft() {
		return mContent.substring(mPos, mPosEnd);
	}

	/**
	 * Returns the field content starting at the current position limited to a
	 * maximum length.<br>
	 * 
	 * @param pMaxLength
	 *            the maximum length for the field content.
	 * 
	 * @return the field content
	 */
	public String getContentLeft(int pMaxLength) {
		if (pMaxLength <= mPosEnd - mPos) {
			return mContent.substring(mPos, mPos + pMaxLength);
		}
		return mContent.substring(mPos, mPosEnd);
	}

	/**
	 * Removes the specified number of characters from the field content at the
	 * current position.
	 * 
	 * @param pSize
	 *            the number of characters to remove.
	 * 
	 * @return the removed characters.
	 */
	public String match(int pSize) {
		final String subField = getContentLeft(pSize);
		mPos += subField.length();
		return subField;
	}

	/**
	 * Removes all characters from the field content at the current position.
	 * 
	 * @return the removed characters.
	 */
	public String match() {
		return match(mPosEnd - mPos);
	}

	/**
	 * Removes a prefix from the field content at the current position.
	 * 
	 * @param pPrefix
	 *            the prefix to remove.
	 * 
	 * @return true if prefix could be removed.
	 */
	public boolean match(String pPrefix) {
		// matching null or an empty string is successful
		if ((pPrefix == null) || (pPrefix.length() == 0)) {
			return true;
		} else if (getContentLeft().startsWith(pPrefix)) {
			mPos += pPrefix.length();
			return true;
		} else {
			return false;
		}
	}
}
