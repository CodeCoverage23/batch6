package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();

		a.add("Kishor");
		a.add("Pavan");
		a.add("Ashutosh");
		a.add("Akshay");
		a.add("Vishal");
		a.add("Swapnil");
		a.add("Shiva");

		System.out.println(a);

		Iterator<String> iterator = a.iterator();
		while (iterator.hasNext()) {
			String data = iterator.next();
			String upperCaseData = data.toUpperCase();
			System.out.println(upperCaseData);
		}

	}

}
