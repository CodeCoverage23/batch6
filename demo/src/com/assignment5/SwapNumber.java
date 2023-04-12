package com.assignment5;

public class SwapNumber {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("Before Swap: a = " +a);
		System.out.println("Before Swap: b = " +b);
		
		int c=a; a=b; b=c;
		
		 System.out.println("After Swap: a = " +a);
		 System.out.println("After Swap: b = " +b);

	}

}
