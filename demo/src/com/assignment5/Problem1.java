package com.assignment5;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		int a=s.nextInt();
		if(a>0) {
			System.out.println("The given number is positive");
			
		}
		else {
			System.out.println("The given number is negative");
		}
	}

}
