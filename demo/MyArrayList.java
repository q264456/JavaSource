package com.tops.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

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
	  * Trims the capacity of this ArrayList instance to be the
	  * list's current size. An application can use this operation to minimize
	  * the storage of an ArrayList instance.
	  */
	 public void trimToSize() {
//		 modCount++;
		 if(size < elementData.length) {
			 elementData = (size == 0) ? EMPTY_ELEMENTDATA : Arrays.copyOf(elementData, size);
		 }
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
	  * Returns <tt>true</tt> if this list contains the specified element.
	  * More formally, returns <tt>true</tt> if and only if this list contains
	  * at least one element.
	  * 
	  * @param o element whose presence in this list is to be tested
	  * @return <tt>true</tt> if this list contains the specified element
	  */
	 public boolean contains(Object o) {
		 return indexOf(o) >= 0;
	 }
	 
	 /**
	  * Returns the index of the first occurrence of the specified element
	  * in this list, or -1 if this list does not contain the element.
	  * More formally, returns the lowest index <tt>i</tt> or -1 if there
	  * is no such index.
	  */
	 public int indexOf(Object o) {
		 if(o == null) {
			 for(int i = 0; i < size; i++) {
				 if(elementData[i] == null)
					 return i;
			 }
		 }else {
			 for(int i = 0; i < size; i++) {
				 if(o.equals(elementData[i]))
					 return i;
			 }
		 }
		 return -1;
	 }
	 
	 /**
	  * Returns the index of the last occurrence of the specified element
	  * in this list, or -1 if this list does not contain the element.
	  * More formally returns the highest index <tt>i</tt> or -1 if there
	  * is no such index.
	  */
	 public int lastIndexOf(Object o) {
		 if(o == null) {
			 for(int i = size -1; i >= 0; i--)
				 if(elementData[i] == null)
					 return i;
		 }else {
			 for(int i = size -1; i >= 0; i--) {
				 if(o.equals(elementData[i]))
					 return i;
			 }
		 }
		 return -1;
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
	  *	Replaces the elements at the specified position in this list with
	  * the specified element.
	  *  
	  * @param index index of the element to replace
	  * @param element element to be stored at the specified position
	  * @return the element previously at the specified position
	  * @throws IndexOutOfBoundsException
	  */
	 public E set(int index, E element) {
		 rangeCheck(index);
		 
		 E oldValue = elementData(index);
		 elementData[index] = element;
		 return oldValue;
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
	  * Inserts the specified element at the specified position in this
	  * list. Shifts the element currently at that position(if any) and
	  * any subsequent elements to the rights(adds one to their indices).
	  * 
	  * @param index index at which the specified element is to be inserted
	  * @param element element to be inserted
	  * @throws IndexOutOfBoundsException
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
	  * Remove the first occurrence of the specified element from this list,
	  * if it is present. If the list does not contain the element, it is
	  * unchanged. More formally, removes the element with the lowest index,
	  * Returns true if this list contained the specified element
	  * 
	  * @param o element to be removed from this list, if present
	  * @return true if this list contained the specified element
	  */
	 public boolean remove(Object o) {
		 if(o == null) {
			 for(int index = 0; index < size; index++) {
				 if(elementData[index] == null) {
					 fastRemove(index);
					 return true;
				 }
			 }
		 }else {
			 for(int index = 0; index < size; index++) {
				 if(o.equals(elementData[index])) {
					 fastRemove(index);
					 return true;
				 }
			 }
		 }
		 return false;
	 }
	 
	 /**
	  * Private remove method that skips bounds checking and does not
	  * return the value removed.
	  */
	 private void fastRemove(int index) {
//		 modCount++
		 int numMoved = size - index - 1;
		 if(numMoved > 0)
			 System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		 
		 elementData[--size] = null; // clear to let GC do its work
	 }
	 
	 /**
	  * Removes all of the elements from this list. The list will
	  * be empty after this call returns.
	  */
	 public void clear() {
//		 modCount++
		 
		 for(int i = 0; i < size; i++)
			 elementData[i] = null;
		 
		 size = 0;
	 }
	 
	 /**
	  * 
	  * @param c
	  * @return
	  */
	 public boolean addAll(MyCollection<? extends E> c) {
//		 c.to
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
     * Returns an iterator over the elements in this list in proper sequence
     * 
     * @return an iterator over the elements in this list in proper sequence
     */
	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}

	/**
	 * An optimized version of AbstractList.Itr
	 */
	private class Itr implements Iterator<E>{
		int cursor; 		//index of next element to return
		int lastRet = -1; 	//index of last element returned; -1 if no such
//		int expectedModCount = modCount;
		
		@Override
		public boolean hasNext() {
			return cursor != size;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
//			
			int i = cursor;
			if(i >= size)
				throw new NoSuchElementException();
			Object[] elementData = MyArrayList.this.elementData;
			if(i >= elementData.length)
				throw new ConcurrentModificationException();
			cursor = i + 1;
			return (E) elementData[lastRet = i];
		}
		
//		final void checkForComodification() {
			
//		}
		
	}
}
