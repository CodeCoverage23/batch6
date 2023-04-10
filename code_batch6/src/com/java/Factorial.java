package com.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number :");
		int fact=1;
		int a=sc.nextInt();
		for( int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
