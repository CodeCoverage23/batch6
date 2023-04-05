package com.basic;

public class DemoStaticMethod {

	static int b = 10; // non static

	public static void calculation() {
		int a = 10;

		System.out.println(a * 150 * b);
	}

	public static void main(String[] args) {

		DemoStaticMethod.calculation();

		System.out.println(b);
	}

}
