package com.tops.demo;

import java.util.Arrays;
import java.util.Iterator;

public class MyVector<E> extends MyAbstractList<E> implements MyList<E>{

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * The array buffer into which the components of the vector are
	 * stored. The capacity of the vector is the length of this array buffer,
	 * and is at least large enough to contain all the vector's elements.
	 * 
	 * Any array elements following the last elements in the vector are null
	 */
	protected Object[] elementData;
	
	/**
	 * The number of valid components in this Vector object.
	 * Components elementData[elementCount-1] are the actual items.
	 */
	protected int elementCount;
	
	/**
	 * The amount by which the capacity of the vector is automatically
	 * incremented when its size becomes greater than its capacity. If
	 * the capacity increment is less than or equal to zero, the capacity
	 * of the vector is doubled each time it needs to grow.
	 */
	protected int capacityIncrement;
	
	/**
	 * Returns the number of components in this vector
	 *
	 * @return the number of components in this vector
	 */
	@Override
	public synchronized int size() {
		return elementCount;
	}

	/**
	 * Tests if the vector has no components
	 * 
	 * @return true if and only if this vector has no
	 * components.
	 */
	@Override
	public synchronized boolean isEmpty() {
		return elementCount == 0;
	}

	/**
	 * Appends the specified element to the end of this Vector.
	 * 
	 * @param e element to be appended to this Vector
	 */
	@Override
	public synchronized boolean add(E e) {
//		modCount++
		ensureCapacityHelper(elementCount + 1);
		elementData[elementCount++] = e;
		return true;
	}
	
	/**
	 * Adds the specified component to the end of this vector,
	 * increasing its size by one. The capacity of this vector is
	 * increased if its size becomes greater than its capacity.
	 * 
	 * @param obj the component to be added
	 */
	public synchronized void addElement(E obj) {
//		modCount++
		ensureCapacityHelper(elementCount + 1);
		elementData[elementCount++] = obj;
	}

	/**
	 * This implements the unsynchronized semantics of ensureCapacity.
	 * Synchronized methods in this class can internally call this
	 * method for ensuring capacity without incurring the cost of an extra synchronization. 
	 */
	private void ensureCapacityHelper(int minCapacity) {
		// overflow-conscious
		if(minCapacity - elementData.length > 0)
			grow(minCapacity);
	}
	
	/**
	 * The maximum size of array to allocate.
	 * Some VMs reserve some header words in an array.
	 * Attempts to allocate larger arrays may result in
	 * OutOfMemoryError: Requested array size exceeds VM limit.
	 */
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	
	private void grow(int minCapacity) {
		// overflow-conscious
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + ((capacityIncrement > 0) ? capacityIncrement : oldCapacity);
		
		if(newCapacity - minCapacity < 0)
			newCapacity = minCapacity;
		if(newCapacity - MAX_ARRAY_SIZE > 0)
			newCapacity = hugeCapicity(minCapacity);
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	private int hugeCapicity(int minCapacity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Returns the element at the specified position in this Vector.
	 * 
	 * @param index index of the element to return
	 * @return object at the specified index
	 * @throws ArrayIndexOfBoundsException if the index is out of range
	 */
	@Override
	public synchronized E get(int index) {
		if(index >= elementCount)
			throw new ArrayIndexOutOfBoundsException(index);
		return elementData(index);
	}

	//Position Access Operations
	@SuppressWarnings("unchecked")
	E elementData(int index) {
		return (E)elementData[index]; 
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
