package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.addElement(10);
		v.addElement(12);
		v.addElement(18);
		v.addElement(22);
		v.addElement(94);
		v.addElement(53);
		v.addElement(18);
		v.addElement(77);

		System.out.println(v);

		Enumeration<Integer> elements = v.elements();
		while (elements.hasMoreElements()) {
			Integer data = elements.nextElement();
			System.out.println(data + 2);
		}

	}

}
