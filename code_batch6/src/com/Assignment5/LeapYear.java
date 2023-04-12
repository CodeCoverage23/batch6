package com.Assignment5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner y =new Scanner(System.in);
		System.out.println("Enter The year");
		int year=y.nextInt();
		if(year%4==0) {
			System.out.println(year+ "is leap year");
				
			}
		else{
			System.out.println(year+"is not leap year");
		}
		// TODO Auto-generated method stub

	}

}
