package com.assignmentNo5;

import java.util.Scanner;

// to check whether year is leap year or not.
public class Q_NO__2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("year is ");
		int year = sc.nextInt();
		// A normal calendar year consists of 365 day
		// but leap year have 366 days.
		// leap year is used every 4 years to eliminate the error 
		// caused by 3 normal years.
		// it comes every 4 years. ex:1996,2000,2016,2024
		
		if (year% 4 == 0) {
			System.out.println("year is leap");
		} else {
			System.out.println("year is not leap");

		}
	}

}
