//Write a program to check whether year is leap year or not .(if else state)

package com.assignment5;
import java.util.Scanner;
public class LeapYearOrNot {
	public static void main(String[]args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		year = sc.nextInt();
		
		if(year%400==0||year%4==0 && year % 100!=0)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
	}

}
