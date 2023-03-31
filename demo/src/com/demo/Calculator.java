package com.demo;

import java.util.Scanner;

public class Calculator {

	public int calculation() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of a: ");
		int a = s.nextInt();

		System.out.println("Enter a value of b:");
		int b = s.nextInt();
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		float div = (float) a / b;
		System.out.println("addition is:" + add);
		System.out.println("substraction is:" + sub);
		System.out.println("multiplication is:" + mul);
		System.out.println("division is:" + div);
		return b;
	}

	public static void main(String[] args) {
		Calculator m = new Calculator();
		int d = m.calculation();
	}
}