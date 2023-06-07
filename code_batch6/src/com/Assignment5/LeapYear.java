package com.Assignment5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("Enter The year");
		int a = y.nextInt();
		if (a % 4 == 0 ) {
			System.out.println(" is leap year");

		} else {
			System.out.println("is not leap year");
		}
	

	}

}
