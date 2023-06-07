package com.oops;

class Calculator {
	public int add(int a, int b) {// method 01
		int c = a + b;
		return c;
	}

	public int add1(int a, int b, int c) {// method 2
		return a + b + c;
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int add = calculator.add(10, 20);
		int add1 = calculator.add(20, 30);
		System.out.println("Two parametre Additionn " + add);
		System.out.println("Two parametre Additionn " + add1);
	}

}
