package com.assignment5;

public class Swap {
	//without using 3rd variable
	public static void main(String[] args) {
		int a=30, b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+ "b="+b);	
	}
}
//with using 3rd variable
//int a=20,b=30,c;
//c=a;
//a=b;
//b=a;
//System.out.println("a="+a+ "b="+b);	
