package com.demo;

import java.util.Scanner;

public class Arithmetic_Operation {

	public static void Arithmetic_Operation(int a, int b) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 4 ");
		int n = sc.nextInt();

		int sum = a + b;
		int difference = a - b;
		int product = a * b;
		int quotient = a / b;
		
						//This is for normal output
		
//		System.out.println("The sum of two number is : " + sum);
//		System.out.println("The difference of two number is : " + difference);
//		System.out.println("The product of two number is : " + product);
//		System.out.println("The quotient of two number is : " + quotient);

						//
		
		if (n == 1) {
			System.out.println("The sum of two number is : " + sum);
		} else if (n == 2) {
			System.out.println("The difference of two number is : " + difference);
		} else if (n == 3) {
			System.out.println("The product of two number is : " + product);
		} else if (n == 4) {
			System.out.println("The quotient of two number is : " + quotient);
		}
	}

	

	public static void main(String[] args) {

//	Arithmetic_Operation n = new Arithmetic_Operation();
		Arithmetic_Operation(50, 10);

	}

}
