package com.java;

public class Calculation {
	public void calculator(int a, int b) {

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
	}

	public static void main(String[] args) {
		Calculation sc = new Calculation();
		sc.calculator(5, 10);

	}
}
