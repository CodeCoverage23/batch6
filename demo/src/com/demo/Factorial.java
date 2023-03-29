package com.demo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int a;
		int fact = 1;
		
		for(a=1; a<=number; a++) {
			fact = fact*a;
		}
		System.out.println(fact);
		
		

	}

}
