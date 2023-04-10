package com.assignment4;

public class ArethmeticOperation {
	
	public int add(int a, int b) {
		int add = a+b;
		return add;
	}
	public int sub(int a, int b) {
		int sub = a-b;
		return sub;
	}
	public int mul(int a, int b) {
		int mul = a*b;
		return mul;
	}
	public int div(int a, int b) {
		int div = a/b;
		return div;
	}
	
	public static void main(String[] args) {
		ArethmeticOperation a = new ArethmeticOperation();
		int s = a.add(20, 10);
		int v = a.sub(20, 10);
		int w = a.mul(20, 10);
		int x = a.div(20, 10);
		
		System.out.println("Addition of Two Number :" + s);
		System.out.println("Substraction of Two Number :" + v);
		System.out.println("Multiplication of Two Number :" + w);
		System.out.println("Division of Two Number :" + x);
		
	}
}
