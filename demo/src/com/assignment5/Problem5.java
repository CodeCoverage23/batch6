//WAP to check whether the number is even or odd.

package com.assignment5;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  No: ");

		int A = sc.nextInt();

		if (A % 2 == 0) {
			System.out.println("This is even number");

		} else {
			System.out.println("This is Odd number");
		}

	}

}
