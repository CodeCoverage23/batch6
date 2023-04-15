package com.demo;

public class Test {
	
	private double sum(double a , double b) {
//		double c = a+b;
		return a+b;
	}
	public static void main(String[] args) {
		Test t = new Test();
//		double s = t.sum(10.10, 20);
		System.out.println(t.sum(10.10, 20));
	}
}
