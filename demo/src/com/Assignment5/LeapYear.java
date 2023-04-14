package com.Assignment5;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		if(year%4==0) {
			System.out.println("This is leap year");
		}

		else {
			System.out.println("This is not a leaf year");
		}
	}

}
