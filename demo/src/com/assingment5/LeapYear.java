package com.assingment5;

import java.util.Scanner;

//2.write a program  to check whether  year is leap year or not. (If else ).
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter a year");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();

		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
			System.out.println("This is a leap year");
		} else {
			System.out.println("This is not leap year");
		}
	}

}
