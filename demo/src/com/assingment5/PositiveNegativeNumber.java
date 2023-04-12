package com.assingment5;

import java.util.Scanner;

//1.write a program to check the number is positive or negative.
public class PositiveNegativeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		double n = sc.nextDouble();

		if (n >= 0) {
			System.out.println("The number is Positive");
		} else {
			System.out.println("The number is Negative");
		}
	}
}
