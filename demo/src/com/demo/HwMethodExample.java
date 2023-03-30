package com.demo;

import java.util.Scanner;

    public class HwMethodExample {
	
   public int addition(int a, int b) {
		int Add = a + b;
		return Add;
	}

	public int substraction(int a, int b) {
		int Sub = a - b;
		return Sub;
	}

	public int multiplication(int a, int b) {
		int Mul = a * b;

		return Mul;
	}

	public int division(int a, int b) {
		int Div = a / b;

		return Div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any  Number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		HwMethodExample obj = new HwMethodExample();

		int c = obj.addition(a, b);
		System.out.println("Addition:" + c);
		int d = obj.substraction(a, b);
		System.out.println("Substraction:" + d);
		int e = obj.multiplication(a, b);
		System.out.println("Multiplication:" + e);

		int f = obj.division(a, b);
		System.out.println("Division:" + f);

	}

}
