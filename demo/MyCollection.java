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
	 * @param o
	 * @return
	 */
	boolean contains(Object o);
	
	/**
	 * 
	 * @param e
	 * @return
	 */
	boolean add(E e);
	
	/**
	 * Return an MyIterator over the elements in this collection. There are no
	 * guarantees concerning the order in which the elements are returned
	 * (unless this collection is an instance of some class that provides a
	 * guarantee).
	 * 
	 * @return an <tt>MyIterable</tt> over the elements in this collection
	 */
	MyIterable<E> iterator();
	
}
