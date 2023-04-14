package com.assignment5;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no.:");
		int n=s.nextInt();
		if(n%2==0) {
			System.out.println("the no.is even");
		}
		else {
			System.out.println("the number is odd");
		}
	}

}
