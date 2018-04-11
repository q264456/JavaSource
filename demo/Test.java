package com.tops.demo;

public class Test {
	
	public static void main(String[] args) {
		
		MyArrayList<String> lst = new MyArrayList<String>();
		
		for(int i = 0; i <= 50; i++) {
			lst.add(String.valueOf(i));
		}
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println(lst.isEmpty());
		System.out.println(lst.get(1));
		System.out.println(lst.remove(1));
		System.out.println(lst.get(1));
		lst.add(3, "fuck");
		System.out.println(lst.get(3));
		
	}

}
