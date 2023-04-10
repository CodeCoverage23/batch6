package com.Assignment_4;

public class CalculationsUsingMethod {
	int a = 65;
	int b = 5;

	public int addition() {
		int c = a + b;
		return c;
	}

	public int substraction() {
		int d = a - b;
		return d;
	}

	public int multipication() {
		int e = a * b;
		return e;
	}

	public int division() {
		int f = a / b;
		return f;
	}

	public static void main(String[] args) {
		CalculationsUsingMethod M = new CalculationsUsingMethod();
		int c = M.addition();
		System.out.println("addition of two numbers is:" + c);
		int d = M.substraction();
		System.out.println("substration of two number is: " + d);
		int e = M.multipication();
		System.out.println("multiplication of two numbers is: " + e);
		int f = M.division();
		System.out.println("division of two numbers is: " + f);
	}

}
