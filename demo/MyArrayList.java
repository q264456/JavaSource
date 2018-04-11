package com.tops.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;

public class MyArrayList<E> extends MyAbstractList<E> implements MyList<E> {

	/**
	 * Default initial capacity.
	 */
	private static int DEFAULT_CAPACITY = 10;
	
	/**
	 * Shared empty array instance used for empty instances.
	 */
	private static final Object[] EMPTY_ELEMENTDATA = {};
	
	/**
	 * Shared empty array instance used for default sized empty instances. We
	 * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
	 * first element is added.
	 */
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	
	/**
	 * The array buffer into which the elements of MyArraylist are stored.
	 * The capacity of the MyArraylist is the length of this array buffer. Any
	 * empty MyArraylist with elemenData == 
	 */
	transient Object[] elementData;
	
	/**
	 * The size of the MyArraylist (the number of elements in contains)
	 */
	private int size;
	
	/**
	 * Constructs an empty list with the specified initial capacity.
	 * 
	 * @param initialCapacity  the initial capacity if the list
	 * @throws IllefalArgumentException if the specified initial capacity
	 * 			is negative
	 */
	public MyArrayList(int initialCapacity) {
		if(initialCapacity > 0) {
			this.elementData = new Object[initialCapacity];
		}else if(initialCapacity == 0) {
			this.elementData = EMPTY_ELEMENTDATA;
		}else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
	}
	
	/**
	 * Constructs an empty list with an initial capacity of ten. 
	 */
	public MyArrayList() {
		this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
	
	/**
	 * 
	 * @param c
	 */
	 public MyArrayList(Collection<? extends E> c) {
		 // TODO Auto-generated method stub
	 }
	 
	 /**
	  * 
	  */
	 public void trimToSize() {
		 // TODO Auto-generated method stub
	 }
	
	 /**
	  * 
	  * @param minCapacity
	  */
	 public void ensureCapacity(int minCapacity) {
		 // TODO Auto-generated method stub
	 }

	 private void ensureCapacityInternal(int minCapacity) {
		 if(elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
			 minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
		 }
		 ensureExplicitCapacity(minCapacity);
	 }

	 private void ensureExplicitCapacity(int minCapacity) {
		 //modCount++;
		
		 // overflow-conscious code
		 if(minCapacity - elementData.length > 0)
			 grow(minCapacity);
	 }
	 
	 /**
	  * 
	  */
	 private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	
	/**
	 *  Increases the capacity to ensure that it can hold at least the
	 *  number of elements specified by the minimum capacity argument.
	 *  
	 * @param minCapacity the desired minimum capacity
	 */
	 private void grow(int minCapacity) {
		 //overflow-conscious code
		 int oldCapacity = elementData.length;
		 int newCapacity = oldCapacity + (oldCapacity >> 1);
		 if(newCapacity - minCapacity < 0)
			 newCapacity = minCapacity;
		 // minCapacity is usually close to size, so this is a win:
		 elementData = Arrays.copyOf(elementData, newCapacity);
	 }
	
	 private static int hugeCapacity(int mincapacity) {
		 // TODO Auto-generated method stub
		 return 0;
	 }
	 
	 /**
	  * Returns the number of elements in this list.
	  * 
	  * @return the number of elements in this list
	  */
	 @Override
	 public int size() {
		 return size;
	 }
	 
	 /**
	  * Returns <tt>true</tt> if this list contains no elements.
	  * 
	  * @return <tt>true</tt> if this list contains no elements
	 */
	 @Override
	 public boolean isEmpty() {
		 return size == 0;
	 }
	 
	 /**
	  * 
	  */
	 @Override
	 public boolean contains(Object o) {
		 // TODO Auto-generated method stub
		 return false;
	 }
	 
	 /**
	  * 
	  * @param o
	  * @return
	  */
	 public int indexOf(Object o) {
		 // TODO Auto-generated method stub
		 return 0;
	 }
	 
	 /**
	  * 
	  * @param o
	  * @return
	  */
	 public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		 return 0;
	 }
	 
	 /**
	  * 
	  */
	 public Object clone() {
		 // TODO Auto-generated method stub
		 return null;
	 }
	 
	 /**
	  * 
	  * @return
	  */
	 public Object[] toArray() {
		 // TODO Auto-generated method stub
		 return null;
	 }
	 
	 /**
	  * 
	  * @param a
	  * @return
	  */
	 public <T> T[] toArray(T[] a) {
		 // TODO Auto-generated method stub
		 return null;
	 }
	 
	 // Position Access Operations
	 @SuppressWarnings("unchecked")
	 E elementData(int index) {
		 rangeCheck(index);
		
		 return (E) elementData[index];
	 }
	 
	 /**
	  * Returns the element at the specified position in this list.
	  * 
	  * @param index  index of the element to return
	  * @return the element at the specified position in this list
	  */
	 @Override
	 public E get(int index) {
		 rangeCheck(index);
		
		 return elementData(index);
	 }
	 
	 /**
	  * 
	  * @param index
	  * @param element
	  * @return
	  */
	 public E set(int index, E element) {
		 return null;
	 }
	 
	 /**
	  * Appends the specified element to the end of this list.
	  * 
	  * @param e element to be appended to this list
	  * @return <tt>true</tt>
	  */
	 @Override
	 public boolean add(E e) {
		 ensureCapacityInternal(size + 1); //Increments modCount!!
		 elementData[size++] = e;
		 return true;
	 }
	 
	 /**
	  * 
	  */
	 public void add(int index, E element) {
		 rangeCheckForAdd(index);
		 
		 ensureCapacityInternal(size + 1);
		 System.arraycopy(elementData, index, elementData, index + 1, size - index);
		 
		 elementData[index] = element;
		 size++;
	 }
	 
	 /**
	  * Remove the element at the specified position in this list.
	  * Shifts any subsequent elements to the left(subtracts one from their
	  * indices)
	  * 
	  * @param index the index of the element to be removed
	  * @return the element that war removed from the list
	  * @throws IndexOutOfBoundsException
	  */
	 @Override
	 public E remove(int index) {
		 rangeCheck(index);
		
//		modCount++;
		 E oldValue = elementData(index);
		
		 int numMoved = size - index -1;
		 if(numMoved > 0)
			 System.arraycopy(elementData, index+1, elementData, index, numMoved);
		
		 elementData[--size] = null; // clear to let GC do its word
		
		 return oldValue;
	 }
	 
	 /**
	  * 
	  * @param o
	  * @return
	  */
	 public boolean remove(Object o) {
		// TODO Auto-generated method stub
		 return false;
	 }
	 
	 /**
	  * 
	  * @param index
	  */
	 private void fastRemove(int index) {
		// TODO Auto-generated method stub
	 }
	 
	 /**
	  * 
	  */
	 public void clear() {
		// TODO Auto-generated method stub
	 }
	 
	 /**
	  * 
	  * @param c
	  * @return
	  */
	 public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		 return false;
	 }
	 
	 /**
	  * 
	  * @param index
	  * @param c
	  * @return
	  */
	 public boolean addAll(int index, Collection<? extends E> c) {
		 // TODO Auto-generated method stub
		 return false;
	 }
	 
	 /**
	  * 
	  * @param fromIndex
	  * @param toIndex
	  */
	 protected void removeRange(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
	 }
	
	 /**
	  * Checks if the given index is in range. If not, throws an appropriate
	  * runtime exception. This method does not check if the index is
	  * negative: It is always used immediately prior to an array access,
	  * which throws an ArrayIndexOutOfBoundsException if index is negative.
	  */
	 private void rangeCheck(int index) {
		 if(index >= size)
			 throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	 }
	 
	 /**
	  * A version of rangeCheck used by add and addAll
	  */
	 private void rangeCheckForAdd(int index) {
		 if(index > size || index < 0)
			 throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	 }
	 
	 /**
	  * Constructs an IndexOutOfBoundsException detail message.
	  * Of the many possible refactorings of the error handling code,
	  * this outlining performs best with both server and client VMS.
	  */
	 private String outOfBoundsMsg(int index) {
		 return "Index: " + index + ", Size: " + size;
	 }
	 
	 /**
	  * 
	  * @param c
	  * @return
	  */
	 public boolean removeAll(Collection<?> c) {
		 // TODO Auto-generated method stub
		 return false;
	 }
	 
	 /**
	  * 
	  * @param c
	  * @return
	  */
	 public boolean retainAll(Collection<?> c) {
		 // TODO Auto-generated method stub
		 return false;
	 }
	 
	 /**
	  * 
	  * @param c
	  * @return
	  */
	 public boolean batchRemove(Collection<?> c, boolean complement) {
		// TODO Auto-generated method stub
		 return false;
	 }
	
	 /**
	  * 
	  * @param s
	  */
	 private void writeObject(java.io.ObjectOutputStream s) {
		// TODO Auto-generated method stub
	 }
	 
	 /**
	  * 
	  * @param s
	  * @throws java.io.IOException
	  * @throws ClassNotFoundException
	  */
	 private void readObject(java.io.ObjectInputStream s)throws java.io.IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	 }
	
	 /**
	  * 
	  * @param index
	  * @return
	  */
	 public ListIterator<E> listIterator(int index) {
		 return null;
	 }
	
	 /**
	  * 
	  * @return
	  */
    public ListIterator<E> listIterator() {
    	// TODO Auto-generated method stub
        return null;
    }
	 
	/**
	 * 
	 */
	 @Override
	 public MyIterable<E> iterator() {
		// TODO Auto-generated method stub
		 return null;
	 }

	

}
