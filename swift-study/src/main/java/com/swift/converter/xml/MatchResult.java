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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * This class represents a match result that contains a list of elements and a
 * status that indicates that the match result is negative or positive. <br>
 * It is used as the return type of the processing methods of the
 * {@link SchemaProcessor} and derived classes.
 */
public final class MatchResult {
	/** Status of the match result. */
	private boolean mMatched;
	/** Elements of the match result. */
	private List mObjects;

	/** An unmodifiable empty positive match result. */
	public static final MatchResult MATCHED = new MatchResult(true, Collections.EMPTY_LIST);

	/** An unmodifiable empty negative match result. */
	public static final MatchResult NOT_MATCHED = new MatchResult(false, Collections.EMPTY_LIST);

	/**
	 * Create a match result using the specified list type
	 * 
	 * @param pMatched
	 *            status of the match result
	 * @param pList
	 *            the list
	 */
	private MatchResult(boolean pMatched, List pList) {
		mObjects = pList;
		mMatched = pMatched;
	}

	/**
	 * Creates an empty match result.
	 * 
	 * @param pMatched
	 *            status of the match result
	 */
	public MatchResult(boolean pMatched) {
		this(pMatched, (List) null);
	}

	/**
	 * Creates an empty positive match result.
	 */
	public MatchResult() {
		this(true);
	}

	/**
	 * Creates a match result that contains a single element.
	 * 
	 * @param pMatched
	 *            status of the match result
	 * @param pNode
	 *            element to be added to the match result
	 */
	public MatchResult(boolean pMatched, Object pNode) {
		this(pMatched);
		add(pNode);
	}

	/**
	 * Creates a positive match result that contains a single element.
	 * 
	 * @param pNode
	 *            element to be added to the match result
	 */
	public MatchResult(Object pNode) {
		this(true, pNode);
	}

	/**
	 * Returns the status of this match result.
	 * 
	 * @return true if the result status is positive
	 */
	public boolean isMatched() {
		return mMatched;
	}

	/**
	 * Returns an iterator over the elements in this match result in proper
	 * sequence.
	 * 
	 * @return an iterator over the elements in this match result in proper
	 *         sequence
	 */
	public Iterator iterator() {
		if (mObjects != null) {
			return mObjects.iterator();
		} else {
			return Collections.EMPTY_LIST.iterator();
		}
	}

	/**
	 * Returns the number of elements in this match result.
	 * 
	 * @return the number of elements in this match result
	 */
	public int size() {
		if (mObjects != null) {
			return mObjects.size();
		} else {
			return 0;
		}
	}

	/**
	 * Appends the specified element to the end of this match result.
	 * 
	 * @param pNode
	 *            the object to add.
	 */
	public void add(Object pNode) {
		if (mObjects == null) {
			mObjects = new ArrayList();
		}
		mObjects.add(pNode);
	}

	/**
	 * Inserts the specified element at the specified position in this match
	 * result. Shifts the element currently at that position (if any) and any
	 * subsequent elements to the right (adds one to their indices).
	 * 
	 * @param pIndex
	 *            index at which the specified element is to be inserted
	 * @param pNode
	 *            element to be inserted
	 * @throws IndexOutOfBoundsException
	 */
	public void add(int pIndex, Object pNode) {
		if (mObjects == null) {
			mObjects = new ArrayList();
		}
		mObjects.add(pIndex, pNode);
	}

	/**
	 * Adds all of the elements in the specified match result to this match
	 * result and when the specified match result is negative, sets also the
	 * status of this match result negative.
	 * 
	 * @param pMatchResult
	 *            the matching result to add.
	 */
	public void addAll(MatchResult pMatchResult) {
		if (pMatchResult.size() > 0) {
			if (mObjects == null) {
				mObjects = new ArrayList(pMatchResult.mObjects);
			} else {
				mObjects.addAll(pMatchResult.mObjects);
			}
		}
		if (!pMatchResult.isMatched()) {
			mMatched = false;
		}
	}

	/**
	 * Appends the string representation of all elements of the specified match
	 * result to the specified <tt>StringBuffer</tt>.
	 * 
	 * @param sb
	 *            string buffer that will hold the string representation
	 * @param pMatchResult
	 *            the match result
	 * @return the string buffer
	 */
	public static StringBuffer append(StringBuffer sb, MatchResult pMatchResult) {
		final Iterator e = pMatchResult.iterator();
		while (e.hasNext()) {
			final Object obj = e.next();
			sb.append(obj.toString());
		}
		return sb;
	}

	/**
	 * Returns the concatenation of all string representation of all elements in
	 * this match result.
	 * 
	 * @return string representation of all elements
	 */
	public String toString() {
		return append(new StringBuffer(), this).toString();
	}

	/**
	 * Merge two MatchResult instances, creating a little objects as possible
	 * 
	 * @param pTarget
	 *            the destination merge result, will be reused if possible
	 * @param pSource
	 *            the source merge result
	 * @return the combination of the two MatchResults
	 */
	public final static MatchResult merge(MatchResult pTarget, MatchResult pSource) {
		// if the first is null, return the second
		if (pTarget == null) {
			return pSource;
		}

		// if the second is null, return the first
		if (pSource == null) {
			return pTarget;
		}

		// special case if the target contains no results
		if ((isPredefined(pTarget) || pTarget.mObjects == null || pTarget.mObjects.size() == 0)
				&& (isPredefined(pSource) || pSource.mObjects == null || pSource.mObjects.size() == 0)) {
			return (pTarget.mMatched && pSource.mMatched) ? MATCHED : NOT_MATCHED;
		}

		// if the target is one of the predefined we need to make a read/write
		// version
		if (isPredefined(pTarget)) {
			pTarget = new MatchResult(pTarget.mMatched);
		}

		pTarget.addAll(pSource);
		return pTarget;
	}

	/**
	 * Check if the match result is one of the predefined ones
	 * 
	 * @return true if it is a predefined one
	 */
	private final static boolean isPredefined(MatchResult pResult) {
		return (pResult == MATCHED || pResult == NOT_MATCHED);
	}
}
