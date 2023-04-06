package com.demo;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n,rev;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		while(n > 0) {
			rev= n%10;
			System.out.print(" " +rev);
			n=n/10;
			
			
			
		}

	}

}
