package com.demo;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
//		int n = 5;
		int i;
		int fact=1;
		
		for(i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		}

}

