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
package com.swift.converter.io;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

/**
 * A buffered character-stream reader that allows characters to be pushed back
 * into the stream and that keeps track of line numbers. This class defines
 * methods {@link #setLineNumber(int)} and {@link #getLineNumber()} for setting
 * and getting the current line number respectively.
 * 
 * <p>
 * By default, line numbering begins at 0. This number increments at every line
 * terminator as the data is read, and can be changed with a call to
 * <tt>setLineNumber(int)</tt>. Note however, that
 * <tt>setLineNumber(int)</tt> does not actually change the current position
 * in the stream; it only changes the value that will be returned by
 * <tt>getLineNumber()</tt>.
 * 
 * <p>
 * A line is considered to be terminated by a line feed ('\n').
 * 
 * @see java.io.PushbackReader
 * @see java.io.LineNumberReader
 * @author SWIFT
 */
public class LineNumberPushbackReader extends Reader {
	private final PushbackReader mReader;
	/** The current line number */
	private int mLineNumber = 0;
	/** The current line number */
	private int mPosition = 0;

	/**
	 * Create a new line-numbering push back reader.
	 * 
	 * @param pReader
	 *            a PushbackReader object to provide the underlying stream
	 */
	public LineNumberPushbackReader(PushbackReader pReader) {
		super(pReader);
		this.mReader = pReader;
	}

	/**
	 * Set the current line number.
	 * 
	 * @param pLineNumber
	 *            The current line number
	 * @see #getLineNumber
	 */
	public void setLineNumber(int pLineNumber) {
		mLineNumber = pLineNumber;
	}

	/**
	 * Get the current line number.
	 * 
	 * @return The current line number
	 * @see #setLineNumber
	 */
	public int getLineNumber() {
		return mLineNumber;
	}

	/**
	 * Get the current character position.
	 * 
	 * @return The current character position
	 */
	public int getPosition() {
		return mPosition;
	}
	
	/**
	 * Read a single character.
	 * 
	 * @return The character read, or -1 if the end of the stream has been
	 *         reached
	 * 
	 * @exception IOException
	 *                If an I/O error occurs
	 */
	public int read() throws IOException {
		synchronized (lock) {
			final int c = mReader.read();
			mPosition++;
			if (c == '\n') {
				mLineNumber++;
			}
			return c;
		}
	}

	/**
	 * Read characters into a portion of an array.
	 * 
	 * @param cbuf
	 *            Destination buffer
	 * @param off
	 *            Offset at which to start writing characters
	 * @param len
	 *            Maximum number of characters to read
	 * 
	 * @return The number of characters read, or -1 if the end of the stream has
	 *         been reached
	 * 
	 * @exception IOException
	 *                If an I/O error occurs
	 */
	public int read(char cbuf[], int off, int len) throws IOException {
		synchronized (lock) {
			final int n = mReader.read(cbuf, off, len);
			mPosition += n;
			for (int i = off; i < off + n; i++) {
				if (cbuf[i] == '\n') {
					mLineNumber++;
				}
			}
			return n;
		}
	}

	/**
	 * Push back a single character.
	 * 
	 * @param c
	 *            The character to push back
	 * 
	 * @exception IOException
	 *                If the push back buffer is full, or if some other I/O
	 *                error occurs
	 */
	public void unread(int c) throws IOException {
		synchronized (lock) {
			mReader.unread(c);
			mPosition--;
			if (c == '\n') {
				mLineNumber--;
			}
		}
	}

	/**
	 * Push back a portion of an array of characters by copying it to the front
	 * of the push back buffer. After this method returns, the next character to
	 * be read will have the value <code>cbuf[off]</code>, the character
	 * after that will have the value <code>cbuf[off+1]</code>, and so forth.
	 * 
	 * @param cbuf
	 *            Character array
	 * @param off
	 *            Offset of first character to push back
	 * @param len
	 *            Number of characters to push back
	 * 
	 * @exception IOException
	 *                If there is insufficient room in the push back buffer, or
	 *                if some other I/O error occurs
	 */
	public void unread(char cbuf[], int off, int len) throws IOException {
		synchronized (lock) {
			mReader.unread(cbuf, off, len);
			mPosition -= len;
			for (int i = off; i < off + len; i++) {
				if (cbuf[i] == '\n') {
					mLineNumber--;
				}
			}
		}
	}

	/**
	 * Push back an array of characters by copying it to the front of the push
	 * back buffer. After this method returns, the next character to be read
	 * will have the value <code>cbuf[0]</code>, the character after that
	 * will have the value <code>cbuf[1]</code>, and so forth.
	 * 
	 * @param cbuf
	 *            Character array to push back
	 * 
	 * @exception IOException
	 *                If there is insufficient room in the push back buffer, or
	 *                if some other I/O error occurs
	 */
	public void unread(char cbuf[]) throws IOException {
		unread(cbuf, 0, cbuf.length);
	}

	/**
	 * Close the stream.
	 * 
	 * @exception IOException
	 *                If an I/O error occurs
	 */
	public void close() throws IOException {
		mReader.close();
	}
}
