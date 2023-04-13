package com.assignmentNo5;

import java.util.Scanner;

// To check whether the number is greater than 100.
public class Q_NO__6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number > 100) {
			System.out.println("number is greater than 100");
		} else if (number == 100) {
			System.out.println("number is equal to 100");
		} else {
			System.out.println("number is less than 100");
		}
	}

}
