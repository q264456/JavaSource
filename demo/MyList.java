package com.tops.demo;

public interface MyList<E> extends MyCollection<E>{
	
	/**
	 * Returns the number of elements in this list. If this list contains
	 * more than <tt>Integer.MAX_VALUE</tt> elements. returns
	 * <tt>Integer.MAX_VALUE</tt>.
	 * 
	 * @return the number of elements in this list
	 */
	int size();
	
	 /**
     * Returns <tt>true</tt> if this list contains no elements.
     *
     * @return <tt>true</tt> if this list contains no elements
     */
	boolean isEmpty();
	
	/**
	 * 
	 */
	boolean contains(Object o);
	
	/**
	 * 
	 */
	boolean add(E e);
	
	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index index of the element to return
	 * @return the element at the specified position in this list
	 * @throws IndexOutOfBoundsException if the index is out of range
	 */
	E get(int index);
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	E remove(int index);
	
	/**
	 * 
	 * @param o
	 * @return
	 */
	int indexOf(Object o);
	
	/**
	 * Returns an iterator over the elements in this list in proper sequence
	 * 
	 * @return an iterator over the elements in this list in proper sequence
	 */
	MyIterable<E> iterator();
}
