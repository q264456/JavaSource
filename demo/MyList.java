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
	boolean add(E e);
	
	/**
	 * 
	 */
	boolean remove(Object o);
	
	/**
	 * Remove all of the elements from this list(optional operation).
	 * This list will be empty after this call returns.
	 * 
	 * @throws UnsupportedOperationException if the <tt>clear</tt> operation
	 * 			is not supported by this list
	 */
	void clear();
	
	
	/**
	 * 
	 */
	boolean equals(Object o);
	
	/**
	 * 
	 */
	int hashCode();
	
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
	 * @param element
	 * @return
	 */
	E set(int index, E element);
	
	/**
	 * 
	 * @param index
	 * @param element
	 */
	void add(int index, E element);
	
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
	 * 
	 * @param o
	 * @return
	 */
	int lastIndexOf(Object o);
	

}
