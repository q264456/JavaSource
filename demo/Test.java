package com.tops.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import com.tops.po.Rental;

public class Test {
	
	public static void main(String[] args) {
		
		MyArrayList<String> lst = new MyArrayList<String>();
		
		for(int i = 0; i <= 50; i++) {
			lst.add(String.valueOf(i));
		}
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println(lst.isEmpty());
		lst.trimToSize();
		System.out.println(lst.get(50));
		System.out.println(lst.remove(1));
		System.out.println(lst.get(1));
		lst.add(3, "fuck");
		System.out.println(lst.get(3));
//		ArrayList<Rental> arr = new ArrayList<Rental>();
//		arr.add(new Rental("1", 1));
//		arr.add(new Rental("2", 1));
//		arr.add(new Rental("3", 1));
//		System.out.println(arr);
//		Iterator<Rental> itr = arr.iterator();
//		while(itr.hasNext()) {
//			Rental next = itr.next();
//			String m = next.getMovie();
//			System.out.println(m);
//		}
		
		Iterator<String> iterator = lst.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		
		LinkedList<String> llst = new LinkedList<String>();
		
		
	}

}
