package com.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(10);
		a.add(10);
		a.add(11);
		a.add(1);
		a.add(78);
		a.add(44);
		a.add(0);
		a.add(44);
		a.add("Java");
		a.add(4.4d);
		a.add(4.4d);
		ArrayList a2 = new ArrayList(a);
		System.out.println(a.size());
		System.out.println(a);
		System.out.println(a2);

	}

}
