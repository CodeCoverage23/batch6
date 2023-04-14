//1.write a program to check the number is positive or negative.

package com.assignment_5;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int number=sc.nextInt();
		
		if (number > 0) {
			 
		   System.out.println(number + " is positive.");
		 
		   } else if (number < 0) {
		 
		   System.out.println(number + " is negative.");
		 
		   } else {
		 
		   System.out.println(number + " is zero.");
	   }
	}
}
