package com.basic;

public class VariableDemo {

	static int data = 10; // static variable

//	public void method() {
//		int d = 10; // local variable
//	}
//
//	public void method1() {
//		System.out.println(data);
//	}

	public static void main(String[] args) {
		int b = 11;
		int c = data + b;
		System.out.println(c);
	}
}
