package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {

		Set s = new LinkedHashSet();

		s.add("A");
		s.add("a");
		s.add(10);
		s.add(null);
		s.add(44.4);

		System.out.println(s.add("A"));
		System.out.println(s);

	}

	public static void main(int a) {

	}
}
