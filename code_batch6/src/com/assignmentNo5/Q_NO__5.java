package com.assignmentNo5;

import java.util.Scanner;

// To check number is even or odd
public class Q_NO__5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner number = new Scanner(System.in);

		System.out.println("enter the value");
		int num = number.nextInt();

		if (num % 2 == 0) {

			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}

}
