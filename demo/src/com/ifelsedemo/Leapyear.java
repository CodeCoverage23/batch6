package com.ifelsedemo;


import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		if ( year % 4 == 0 )
		{
			System.out.println(" Leap year ");
		}
		else
		{
			System.out.println( " This is Not Leap Year " );
		}
	}
}
