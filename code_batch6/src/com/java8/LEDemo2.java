package com.java8;

@FunctionalInterface
interface Inter2 {

	void abstractMethod(int a, int b);

}

public class LEDemo2 {

	/*
	 * @Override public void abstractMethod(int a, int b) {
	 * 
	 * System.out.println(a + b);
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Inter2 l = (a, b) -> System.out.println(a + b);
		l.abstractMethod(44, 33);

	}

}
