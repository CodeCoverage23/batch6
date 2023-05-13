package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add("Code");
		l.add("Java");
		l.add(40);
		l.add(null);
		l.add("Code");
		l.add("HTML");
		l.add("Go");
		l.addFirst("JS");
		l.removeLast();
		l.set(1, 78.4f);

		System.out.println(l);

	}

}
