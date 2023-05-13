package com.collection;

public class DemoWrapperClasses {

	public static void main(String[] args) {

		Integer i = new Integer(4);

		int j = i.intValue();// explicit

		int k = i; // unboxing

		System.out.println(i + " " + j + " " + k);

		int a = 44;

		Integer b = Integer.valueOf(a); // explicit

		Integer c = a;// AutoBoxing

		System.out.println(a + " " + b + " " + c);

	}

}
