package com.Assignment5;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int a=sc.nextInt();
		if(a%4==0) {
			System.out.println("the given year is leap year");
		}
		else {
		System.out.println("the given year is not leap year");
		}
	}

}
