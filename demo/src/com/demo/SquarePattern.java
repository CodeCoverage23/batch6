package com.demo;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Length of Side:");

		int number = sc.nextInt();
		System.out.println("The Square Pattern is: \n ");

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				;
				System.out.print("*  ");

			}
			System.out.println("    ");

		}
	}
}
