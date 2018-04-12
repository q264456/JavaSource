package com.tops.demo;

public interface MyCollection<E> extends MyIterable<E> {
	
	/**
	 * Return the number of elements in this collection. If this collection
	 * contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
	 * <tt>Integer.MAX_VALUE</tt>
	 * 
	 * @return the number of elements in this collection
	 */
	int size();
	
	/**
	 * Return <tt>true</tt> if this collection contains no elements
	 * 
	 * @return <tt>true</tt> if this collection contains no elements
	 */
	boolean isEmpty();

	/**
	 * 
	 * @param e
	 * @return
	 */
	boolean add(E e);
	
	/**
	 * 
	 * @param o
	 * @return
	 */
	boolean remove(Object o);
	
	/**
	 * 
	 * @param o
	 * @return
	 */
	boolean equals(Object o);
	
	/**
	 * 
	 * @return
	 */
	int hashCode();
	
	/**
	 * Removes all of the elements from this collection(optional operation).
	 * The collection will be empty after this method returns.
	 * 
	 * @throws UnsupportedOperationException if the <tt>clear</tt> operation
	 * 			is not supported by this collection
	 */
	void clear();
	
}
