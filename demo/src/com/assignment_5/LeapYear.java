//2.write a program  to check whether  year is leap year or not. (If else stmt).

package com.assignment_5;

import java.util.Scanner;

public class LeapYear {
       
	 public static void main(String[] args) {
		 int year;
		 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Year: ");
	    year = sc.nextInt();
	 
	    if (year%4==0)
	     {
	    System.out.println(year + " : Leap Year");
	     }
	     else {
	    System.out.println(year + " : Non - Leap Year");
	     }
	}
}
