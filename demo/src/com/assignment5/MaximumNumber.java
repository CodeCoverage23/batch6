package com.assignment5;

public class MaximumNumber {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 50;
		int c = 70;
		
		if(a>=b && a>=c) {
			System.out.println("Maximum Number is : " + a);
		}
		else if(b>=a && b>=c) {
			System.out.println("Maximum Number is : " + b);
		}
		else {
			System.out.println("Maximum Number is : " + c);
		}
	}
}
