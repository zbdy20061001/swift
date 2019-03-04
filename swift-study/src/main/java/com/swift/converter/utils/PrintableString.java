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

/**
 * Class that does a lazy conversion of an {@link Object#toString()} to a Java
 * string, replacing special characters.
 * <P>
 * This class is used in situations where the conversion is not always needed.
 * Practically we use this class in tracing statements. When tracing is disabled
 * then the toString method will not be invoked saving lots of CPU cycles.
 */
public class PrintableString {
	private final Object mObj;

	/**
	 * Create a new PrintableString object.
	 * 
	 * @param pObj
	 *            the object which toString method must be made printable
	 */
	public PrintableString(Object pObj) {
		mObj = pObj;
	}

	/**
	 * Converts the toString of the contained object in a string which can be
	 * used for logging purposes. This method will only do the processing when
	 * the toString method is called.
	 * 
	 * @return a printable version of the embedded object's toString() result
	 */
	public String toString() {
		if(mObj == null) {
			return "(null)";
		}
		final StringBuffer sb = new StringBuffer();
		final String s = mObj.toString();
		for (int i = 0; i < s.length(); i++) {
			final char ch = s.charAt(i);

			if (Character.isLetterOrDigit(ch) || Character.isSpaceChar(ch) || ("+-*/=?,.:;(){}[]<>_\"'".indexOf(ch) != -1)) {
				sb.append(ch);
			} else if (ch == '\r') {
				sb.append("\\r");
			} else if (ch == '\n') {
				sb.append("\\n");
			} else {
				final String c = Integer.toString(ch);
				if (c.length() <= 3) {
					sb.append('\\').append("000".substring(c.length())).append(c);
				} else {
					sb.append("\\[").append(c).append(']');
				}
			}
		}
		return sb.toString();
	}
}
