package com.demo;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num;
		int a=0,b=1;
		int c;
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			 
			System.out.print(a + " ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
