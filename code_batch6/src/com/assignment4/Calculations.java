package com.assignment4;

public class Calculations {

	private int Add() {
		int a=10,b = 10 ,c;
		return c=a+b;
	}
	private int sub() {
	    int a=10, b=10,c;
		return c= a-b;
	}
	private int mul() {
		int a= 10,b=10,c;
		return c=a*b;
	}
	private int div() {
		int a=10,b=10,c;
		return c= a/b;
	}
public static void main(String[] args) {

	Calculations c = new Calculations();
	int A = c.Add();
	System.out.println("Addition is : "+A);
	System.out.println("substraction is : "+A);
	System.out.println("multiplication is : "+A);
	System.out.println("division is : "+A);

}

}
