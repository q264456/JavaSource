package com.tops.demo;

public abstract class MyAbstractCollection<E> implements MyCollection<E>{
	/**
	 * Sole constructor. (For invocation by subclass constructors, typically
	 * implicit.)
	 */
	protected MyAbstractCollection() {
	}
	
	public abstract int size();

	/**
	 * This implementation returns <tt>size() == 0</tt>.
	 */
	public boolean isEmpty() {
		return size() == 0;
	}
  
	/**
	 * <p>This implementation always throws an
	 * <tt>UnsupportedOperationException</tt>.
	 * 
	 * @throws UnsupportedOperationException
	 */
	public boolean add(E e) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Returns an iterator over the elements contained in this collection.
	 * 
	 * @return an iterator over the elements contained in this collection
	 */
	public abstract MyIterable<E> iterator();
		
}
