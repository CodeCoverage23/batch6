package com.demo;

public class DemoSum {

	public int sum(int a , int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		DemoSum d = new DemoSum();
		
		int add=d.sum(10, 20);
		System.out.println(add);
	}
}
