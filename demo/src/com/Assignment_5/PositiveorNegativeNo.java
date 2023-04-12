//WAP to check number is positive or negative.
package com.Assignment_5;

import java.util.Scanner;

public class PositiveorNegativeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Given number is Negative");
		} else if (num > 0) {
			System.out.println("Given number is Positive");
		} else {
			System.out.println("Given number is zero");
		}
	}

}
