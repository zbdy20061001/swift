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
import java.util.regex.Pattern;

import com.swift.converter.io.LineNumberPushbackReader;
import com.swift.converter.mt.MT2XmlException;
import com.swift.converter.mt.Xml2MTException;
import com.swift.converter.utils.PrintableString;
import com.swift.converter.xml.SchemaHelper;

/**
 * An object of this class represent a block structure field or a MT structure
 * field. Objects of this class can be instantiated so they can be used to
 * produce the FIN output of a message serialiser. or they can be read from a
 * FIN input so they can be used as input tokens for a message deserialiser.
 * 
 * @author SWIFT
 */
public class MTField {
	/** Regular expression matching a tag */
	private final static Pattern TAG_PATTERN = Pattern.compile("[0-9A-Z]+");

	/** End of file constant */
	private static final int EOF = -1;

	/** Unknown field type */
	public static final int TYPE_UNKNOWN = 0x00;
	/** Block structure type: '{' &lt;identifier&gt; ':' &lt;content&gt; '}' */
	public static final int TYPE_BLOCK = 0x01;
	/** Fin structure field type: 'CrLf' ':' &lt;tag> ':' &lt;content&gt; */
	public static final int TYPE_MT = 0x02;
	/** Fin structure field type: 'CrLf' ':' &lt;tag> ':' &lt;content&gt; */
	public static final int TYPE_MT_ALL = 0x04;
	/** No-tag field: &lt;content&gt; */
	public static final int TYPE_ALL = 0x08;
	/** No-tag field: 'CrLf' &lt;content&gt; */
	public static final int TYPE_CRLF_ALL = 0x10;

	private int mType;
	private String mTag;
	private String mContent;
	private int mLineNumber;
	private Object mUserItem = null;
	/** The current reader */
	private LineNumberPushbackReader mReader = null;
	/**
	 * Not processed but already read characters (lookahead characters) from the
	 * current reader
	 */
	private final CircularIntBuffer mLookahead = new CircularIntBuffer(10);

	/**
	 * Creates a field of a specified type (block structure, fin structure or
	 * no-tag) with specified tag and content.
	 * 
	 * @param pType
	 *            type of field (TYPE_BLOCK, TYPE_MT, TYPE_MT_ALL, TYPE_ALL or TYPE_CRLF_ALL)
	 * @param pTag
	 *            tag of the field it must be null for a no-tag field type
	 *            (TYPE_ALL or TYPE_CRLF_ALL)
	 * @param pContent
	 *            content of field
	 * @param pUserItem
	 *            user defined object
	 * @throws Xml2MTException
	 *             format error occurred (tag or content have an invalid
	 *             content)
	 */
	public MTField(int pType, String pTag, String pContent, Object pUserItem) throws Xml2MTException {
		validate(pType, pTag, pContent);
		mType = pType;
		mTag = pTag;
		mContent = pContent;
		mLineNumber = -1;
		mUserItem = pUserItem;
	}

	/**
	 * Creates a single field of a specified type (block structure, fin
	 * structure or no-tag) by parsing the If TYPE_UNKNOWN is specified as type,
	 * the type will end up as TYPE_BLOCK or TYPE_MT depending on the input read
	 * from the reader
	 * 
	 * @param pType
	 *            type of field to read (TYPE_BLOCK, TYPE_MT, TYPE_MT_ALL, TYPE_ALL,
	 *            TYPE_CRLF_ALL or TYPE_UNKNOWN)
	 * @param pReader
	 *            reader
	 * @throws IOException
	 *             I/O exception occurred
	 * @throws MT2XmlException
	 *             parsing error occurred
	 */
	public MTField(int pType, LineNumberPushbackReader pReader) throws IOException, MT2XmlException {
		read(pType, pReader);
	}

	/**
	 * Get the type (TYPE_BLOCK, TYPE_MT, TYPE_MT_ALL, TYPE_ALL, TYPE_CRLF_ALL or
	 * TYPE_UNKNOWN)
	 * 
	 * @return The type.
	 */
	public int getType() {
		return mType;
	}

	/**
	 * Get the tag.
	 * 
	 * @return The tag.
	 */
	public String getTag() {
		return mTag;
	}

	/**
	 * Get the content.
	 * 
	 * @return The content.
	 */
	public String getContent() {
		return mContent;
	}

	/**
	 * Return the line number for the tag.
	 * 
	 * @return the line number for the tag.
	 */
	public int getLineNumberOfTag() {
		if ((mType == TYPE_MT) || (mType == TYPE_MT_ALL) || (mType == TYPE_CRLF_ALL)) {
			return mLineNumber + 1;
		}
		return mLineNumber;
	}

	/**
	 * Set the line number.
	 * 
	 * @param pLineNumber
	 *            the line number.
	 */
	public void setLineNumber(int pLineNumber) {
		mLineNumber = pLineNumber;
	}

	/**
	 * This method allows to attach a user defined object to the field.
	 * 
	 * @param pUserItem
	 *            the user item.
	 */
	public void setUserItem(Object pUserItem) {
		mUserItem = pUserItem;
	}

	/**
	 * Get the user attached object from the field.
	 * 
	 * @return The user item.
	 */
	public Object getUserItem() {
		return mUserItem;
	}

	/**
	 * Validate the format of the tag and content of the current field.
	 * 
	 * @param pType
	 *            type of field to read (TYPE_BLOCK, TYPE_MT, TYPE_MT_ALL, TYPE_ALL or
	 *            TYPE_CRLF_ALL)
	 * @param pTag
	 *            tag of the field it must be null for a no-tag field type
	 *            (TYPE_ALL or TYPE_CRLF_ALL)
	 * @param pContent
	 *            content of field
	 * @throws MT2XmlException
	 *             format error occurred (tag or content have an invalid
	 *             content)
	 */
	private void validate(int pType, String pTag, String pContent) throws Xml2MTException {
		switch (pType) {
		case TYPE_BLOCK:
			if (pTag == null || !TAG_PATTERN.matcher(pTag).matches()) {
				throw new Xml2MTException(Xml2MTException.ERROR_BLOCK_TOKEN, new Object[] { pTag }, null);
			}
			if (!SchemaHelper.checkChars(pContent.toString(), 0, 255)) {
				throw new Xml2MTException(Xml2MTException.ERROR_BLOCK_CONTENT, new Object[] { new PrintableString(pContent
						.toString()) }, null);
			}
			break;
		case TYPE_MT:
		case TYPE_MT_ALL:
			if (pTag == null || !TAG_PATTERN.matcher(pTag).matches()) {
				throw new Xml2MTException(Xml2MTException.ERROR_MT_TOKEN, new Object[] { pTag }, null);
			}
			if (!SchemaHelper.checkChars(pContent.toString(), 0, 255)) {
				throw new Xml2MTException(Xml2MTException.ERROR_MT_CONTENT,
						new Object[] { new PrintableString(pContent.toString()) }, null);
			}
			break;
		case TYPE_ALL:
		case TYPE_CRLF_ALL:
			if (pTag != null) {
				throw new Xml2MTException(Xml2MTException.ERROR_ALL_TOKEN, new Object[] { pTag }, null);
			}
			if (!SchemaHelper.checkChars(pContent.toString(), 0, 255)) {
				throw new Xml2MTException(Xml2MTException.ERROR_ALL_CONTENT,
						new Object[] { new PrintableString(pContent.toString()) }, null);
			}
			break;
		default:
			throw new RuntimeException("Unsupported type " + pType);
		}
	}

	/**
	 * Return the character peeked from the reader at the specified relative
	 * position.
	 * 
	 * @param pPos
	 *            the relative position where to peek the next character
	 * @return the character at the specified position or EOF
	 */
	private int getLookahead(int pPos) {
		try {
			while (mLookahead.size() <= pPos) {
				final int c = mReader.read();
				if (c == -1) {
					return EOF;
				}
				mLookahead.add(c);
			}
			return mLookahead.peek(pPos);
		} catch (final IOException e) {
			return EOF;
		}
	}

	/**
	 * Return the next character peeked from the reader.
	 * 
	 * @return the next character
	 */
	private int getLookahead() {
		return getLookahead(0);
	}

	/**
	 * Return all unprocessed characters back to the reader.
	 */
	private void ungetAllLookahead() {
		try {
			for (int i = mLookahead.size() - 1; i >= 0; i--) {
				mReader.unread(mLookahead.peek(i));
			}
			mLookahead.consume(mLookahead.size());
		} catch (final IOException e) {
			// ASSERT:
			throw new RuntimeException("Can't put lookaheads back to reader");
		}
	}

	/**
	 * Process the next character from the reader.
	 * 
	 * @return the next character or EOF
	 */
	private int match() {
		if (mLookahead.size() > 0) {
			final int c = getLookahead();
			if (c != EOF) {
				mLookahead.consume(1);
			}
			return c;
		} else {
			try {
				return mReader.read();
			} catch (IOException e) {
				return EOF;
			}
		}
	}

	/**
	 * Process the next character from the reader if it matches the specified
	 * one or generate a format error.
	 * 
	 * @param pChar
	 *            the character the match from the reader
	 * @return the matched character
	 * @throws MT2XmlException
	 *             format error occurred (the next character doesn't match the
	 *             specified one)
	 */
	private int match(int pChar) throws MT2XmlException {
		final int ch = getLookahead();
		if (ch == pChar) {
			mLookahead.consume(1);
			return ch;
		} else {
			throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_CHAR_EXPECTED, new Object[] { new Character(
					(char) pChar) }, null);
		}
	}

	/**
	 * Parse a block tag from the reader: '{' <identifier> ':'
	 * 
	 * @return the block identifier read from the reader
	 * @throws MT2XmlException
	 *             format error occurred
	 */
	private String readBlockTag() throws MT2XmlException {
		final StringBuffer tag = new StringBuffer();

		match('{');

		for (int i = 0; i < 3; i++) {
			if ((getLookahead() != EOF) && Character.isLetterOrDigit((char) getLookahead())) {
				tag.append((char) match());
			} else if (tag.length() == 0) {
				throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_ALPHA_EXPECTED, null, null);
			} else {
				break;
			}
		}

		match(':');

		return tag.toString();
	}

	/**
	 * Check if the next input characters from the reader will match a new begin
	 * block: '{' <identifier> ':'
	 * 
	 * @return the block identifier read from the reader or null
	 */
	private String checkBlockTag() {
		final StringBuffer tag = new StringBuffer();

		if (getLookahead(0) != '{') {
			return null;
		}

		int pos;
		for (pos = 1; pos < 4; pos++) {
			if ((getLookahead(pos) != EOF) && Character.isLetterOrDigit((char) getLookahead(pos))) {
				tag.append((char) getLookahead(pos));
			} else if (tag.length() == 0) {
				return null;
			} else {
				break;
			}
		}

		if (getLookahead(pos) != ':') {
			return null;
		}

		return tag.toString();
	}

	/**
	 * Read from the stream until a certain pattern is found
	 * 
	 * @param pPattern
	 *            the string to look for
	 * @param pIsEOFValidEnd
	 *            true to return the string when the pattern is not found at EOF
	 * @param pUnreadPattern
	 *            true if the pattern should be unread when it is found
	 * @return the string until the pattern
	 */
	private String readUntil(String pPattern, boolean pIsEOFValidEnd, boolean pUnreadPattern) throws MT2XmlException {
		final StringBuffer content = new StringBuffer();

		ungetAllLookahead();
		final char[] buffer = new char[1024];
		try {
			for (;;) {
				int count = mReader.read(buffer);
				if (count == EOF) {
					if (!pIsEOFValidEnd) {
						throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_CHAR_EXPECTED,
								new Object[] { (new PrintableString(pPattern)).toString() }, null);
					} else {
						return content.toString();
					}
				}

				if (count > 0) {
					content.append(buffer, 0, count);

					if (pPattern != null) {
						final int idx = content.indexOf(pPattern);
						if (idx >= 0) {
							final int unreadLength = content.length() - idx - (pUnreadPattern ? 0 : pPattern.length());
							if(unreadLength<=count) {
								mReader.unread(buffer, count - unreadLength, unreadLength);
							} else {  // the pattern is on the boundary of the buffer
								mReader.unread(buffer, 0, count);
								content.getChars(idx , idx + unreadLength - count, buffer, 0);
								mReader.unread(buffer, 0, unreadLength - count);
							}
							content.setLength(idx);
							return content.toString();
						}
					}
				}
			}
		} catch (IOException e) {
			throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_CHAR_EXPECTED,
					new Object[] { (new PrintableString(pPattern)).toString() }, e);
		}
	}

	/**
	 * Parse a block 4 with FIN content from the reader: <content> CrLf '-' '}'
	 * 
	 * @return the block content read from the reader
	 * @throws MT2XmlException
	 *             format error occurred
	 */
	private String readBlock4FinContent() throws MT2XmlException {
		return readUntil("\r\n-}", false, false);
	}

	/**
	 * Read No-Tag content
	 * 
	 * @return The No-Tag content.
	 */
	private String readAllContent() throws MT2XmlException {
		return readUntil(null, true, false);
	}
	
	/**
	 * Parse a block content from the reader: <content> '}' The block content
	 * can contain nested blocks
	 * 
	 * @return the block content read from the reader
	 * @throws MT2XmlException
	 *             format error occurred
	 */
	private String readBlockContent() throws MT2XmlException {
		final StringBuffer content = new StringBuffer();

		for (;;) {
			if (getLookahead() == EOF) {
				throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_CHAR_EXPECTED, new Object[] { "}" }, null);
			}
			final String nestedBlockTag = checkBlockTag();
			if (nestedBlockTag != null) {
				content.append('{');
				content.append(readBlockTag());
				content.append(':');
				if ("4".equals(nestedBlockTag) && getLookahead() != '{' && getLookahead() != '}') {
					content.append(readBlock4FinContent());
					content.append("\r\n-}");
				} else {
					content.append(readBlockContent());
					content.append('}');
				}
			} else if (getLookahead() == '}') {
				match('}');
				return content.toString();
			} else {
				content.append((char) match());
			}
		}
	}

	/**
	 * Parse a block structure from the reader: '{' <identifier> ':' <content>
	 * '}'
	 * 
	 * @throws MT2XmlException
	 *             format error occurred
	 */
	private void readBlock() throws MT2XmlException {
		mType = TYPE_BLOCK;
		mTag = readBlockTag();
		if ("4".equals(mTag) && getLookahead() != '{' && getLookahead() != '}' ) {
			mContent = readBlock4FinContent();
		} else {
			mContent = readBlockContent();
		}
	}
	
	/**
	 * Parse a fin tag from the reader: 'CrLf' ':' <tag> ':'
	 * 
	 * @return the fin tag read from the reader
	 * @throws MT2XmlException
	 *             format error occurred
	 */
	private String readMTTag() throws MT2XmlException {
		final StringBuffer tag = new StringBuffer();

		match('\r');
		match('\n');
		match(':');

		for (int i = 0; i < 2; i++) {
			final int ch = getLookahead();
			if ((ch != EOF) && Character.isDigit((char) ch)) {
				tag.append((char) match());
			} else {
				throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_DIGIT_EXPECTED, null, null);
			}
		}

		final int ch = getLookahead();
		if ((ch != EOF) && Character.isLetter((char) ch)) {
			tag.append((char) match());
		}

		match(':');

		return tag.toString();
	}

	/**
	 * Parse a fin structure from the reader: 'CrLf' ':' <tag> ':' <content>
	 * 
	 * @throws MT2XmlException
	 *             format error occurred
	 */
	private void readMT() throws MT2XmlException {
		mType = TYPE_MT;
		mTag = readMTTag();
		mContent = readUntil("\r\n:", true, true);
	}
	
	/**
	 * Reads a single field of a specified type (block structure, fin structure
	 * or no-tag) by parsing the delimiters, tag and content from the specified
	 * reader. If TYPE_UNKNOWN is specified as type, the type will end up as
	 * TYPE_BLOCK or TYPE_MT depending on the input read from the reader
	 * 
	 * @param pType
	 *            type of field to read (TYPE_BLOCK, TYPE_MT, TYPE_ALL,
	 *            TYPE_CRLF_ALL or TYPE_UNKNOWN)
	 * @param pReader
	 *            reader
	 * @throws IOException
	 *             I/O exception occurred
	 * @throws MT2XmlException
	 *             parsing error occurred
	 */
	private void read(int pType, LineNumberPushbackReader pReader) throws IOException, MT2XmlException {
		mReader = pReader;
		mType = TYPE_UNKNOWN;
		mTag = null;
		mContent = null;
		mLineNumber = mReader.getLineNumber();

		try {
			if (getLookahead() == EOF) {
				throw new IOException("End of file");
			}

			switch (pType) {
			case MTField.TYPE_BLOCK:
				readBlock();
				break;
			case MTField.TYPE_MT:
				readMT();
				break;
			case MTField.TYPE_MT_ALL:
				mType = TYPE_MT_ALL;
				mTag = readMTTag();
				mContent = readAllContent();
				break;
			case MTField.TYPE_ALL:
				mType = TYPE_ALL;
				mTag = null;
				mContent = readAllContent();
				break;
			case MTField.TYPE_CRLF_ALL:
				match('\r');
				match('\n');

				mType = TYPE_CRLF_ALL;
				mTag = null;
				mContent = readAllContent();
				break;
			default:
				switch (getLookahead()) {
				case '{':
					readBlock();
					break;
				case '\r':
					readMT();
					break;
				default:
					throw new MT2XmlException(mReader.getLineNumber(), MT2XmlException.SYNTAX_CHAR2_EXPECTED, new Object[] { "{",
							"\\r" }, null);
				}
			}
		} finally {
			ungetAllLookahead();
		}
	}

	/**
	 * The output produced is equal to the input parsed to read the field from
	 * an input reader. It can be used to re-generate the input or to generate a
	 * new message.
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		final StringBuffer sb = new StringBuffer();
		switch (mType) {
		case TYPE_BLOCK:
			sb.append("{");
			sb.append(mTag);
			sb.append(":");
			sb.append(mContent);
			if ("4".equals(mTag) && (mContent.length() > 0) && (mContent.charAt(0) != '{')) {
				sb.append("\r\n-}");
			} else {
				sb.append("}");
			}
			break;
		case TYPE_MT:
		case TYPE_MT_ALL:
			sb.append("\r\n:");
			sb.append(mTag);
			sb.append(":");
			sb.append(mContent);
			break;
		case TYPE_ALL:
			sb.append(mContent);
			break;
		case TYPE_CRLF_ALL:
			sb.append("\r\n");
			sb.append(mContent);
			break;
		}
		return sb.toString();
	}

	/**
	 * Circular buffer of characters
	 */
	private static final class CircularIntBuffer {
		private final int[] mBuffer;
		private int mStart;
		private int mEnd;

		/**
		 * Create a new buffer of the specified size (should be bigger than the
		 * lookahead needed
		 * 
		 * @param pSize
		 *            the size of the buffer
		 */
		public CircularIntBuffer(int pSize) {
			mBuffer = new int[pSize];
		}

		/**
		 * Add an integer to the buffer
		 * 
		 * @param pValue
		 *            the integer
		 */
		public final void add(int pValue) {
			mBuffer[mEnd] = pValue;
			mEnd = index(mEnd, 1);
		}

		/**
		 * Read an integer from the buffer without modifying the position
		 * markers
		 * 
		 * @param pPos
		 *            the position
		 * @return the value
		 */
		public final int peek(int pPos) {
			return mBuffer[index(mStart, pPos)];
		}

		/**
		 * Move the position markers
		 * 
		 * @param pCount
		 *            the number of positions to mark as read
		 */
		public final void consume(int pCount) {
			mStart = index(mStart, pCount);
		}

		/**
		 * Calculate the index
		 * 
		 * @param pIndex
		 *            the starting index
		 * @param pCount
		 *            the increment
		 * @return the new index
		 */
		private final int index(int pIndex, int pCount) {
			return (pIndex + pCount) % mBuffer.length;
		}

		/**
		 * Get the size of the buffer
		 * 
		 * @return the size
		 */
		public final int size() {
			if (mEnd >= mStart) {
				return mEnd - mStart;
			} else {
				return mEnd + (mBuffer.length - mStart);
			}
		}

		/**
		 * Get the capacity of the buffer
		 * 
		 * @return the capacity
		 */
		public final int capacity() {
			return mBuffer.length;
		}
	}
}
