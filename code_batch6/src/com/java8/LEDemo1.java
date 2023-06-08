package com.java8;

@FunctionalInterface
interface Inter1 {

	void abstractMethod1();

}

public class LEDemo1 {

	/*
	 * @Override public void abstractMethod1() { System.out.println("Hello"); }
	 */

	public static void main(String[] args) {

		Inter1 i = () -> System.out.println("Hello");
		i.abstractMethod1();

	}
}
