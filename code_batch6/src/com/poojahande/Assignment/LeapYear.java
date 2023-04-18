package com.poojahande.Assignment;
import java.util.Scanner;

public class LeapYear {

public static void main(String[] args) {
		
		int year;
		System.out.println("Enter the year : ");
		Scanner sc = new Scanner(System.in);
		year= sc.nextInt();
		
		if(year/4==0) {
			System.out.println("Entered year is Leap year");
		}else
		{
			System.out.println("Entered is not a Leap year");
		}
	}
}
