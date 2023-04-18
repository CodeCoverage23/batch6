//WAP to check whether leap year or not

package com.Assignment_5;

import java.util.Scanner;

public class LeapYearProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		
		if (year%4==0) {
			System.out.println(year +"The year is leap year");
		}
		else {
			System.out.println(year+"The year is not leap year");
		
		
		}

	}

}
