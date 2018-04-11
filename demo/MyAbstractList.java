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
	 * <p>This implementation always throws an UnsupportedOperationException
	 * 
	 * @throws UnsupportedOperationException 
	 */
	public void add(int index, E element) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @throws IndexOutOfBoundsException
	 */
	public abstract E get(int index);
	
	public int indexOf(Object o) {
		//TODO
		return 0;
	}
}
