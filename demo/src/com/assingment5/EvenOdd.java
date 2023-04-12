package com.assingment5;

import java.util.Scanner;

//5. Write a program to check whether number is even or odd.
public class EvenOdd {
	public static void main(String[] args) {

		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();

		if (n%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
	}
}
