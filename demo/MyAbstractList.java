package com.tops.demo;

public abstract class MyAbstractList<E> extends MyAbstractCollection<E> implements MyList<E>{
	/**
	 * Sole constructor. (For invocation by subclass constructors, typically
	 * implicit)
	 */
	protected MyAbstractList() {
	}
	
	/**
	 * @param e element to be appended to this list
	 * @return true
	 */
	public boolean add(E e) {
		add(size(), e);
		return true;
	}
	
	/**
	 * @throws IndexOutOfBoundsException
	 */
	public abstract E get(int index);
	
	/**
	 * 
	 */
	public E set(int index, E element) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <p>This implementation always throws an UnsupportedOperationException
	 * 
	 * @throws UnsupportedOperationException 
	 */
	public void add(int index, E element) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 
	 */
	public E remove(int index) {
		throw new UnsupportedOperationException();
	}
	
}
