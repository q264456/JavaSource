package com.tops.demo;

import java.util.Iterator;

public interface MyIterable<T> {

	 /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    Iterator<T> iterator();
}
