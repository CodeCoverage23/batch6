//WAP to check whether year is leap or not(if else statement)

package com.assignment5;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the year");
		
		int a= sc.nextInt();
		
		if(a%4==0) {
			
			System.out.println("The given year is leap year");
			
		}
		else {
			System.out.println("The given year is not leap year");
		}
		
	}

}
