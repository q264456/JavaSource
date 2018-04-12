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
	 * 
	 */
	public boolean remove(Object o) {
		return false;
	}
	
	/**
	 * 
	 */
//	public Object[] toArray() {
//		Object[] r = new Object[size()];
//		MyIterable<E> it = iterator();
//		for(int i = 0; i < r.length; i++) {
//			if()
//		}
//		
//	}
	
}
