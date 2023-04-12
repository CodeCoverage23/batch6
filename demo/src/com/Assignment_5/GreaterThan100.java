//WAP to check whether number is greater then 100 in java.
package com.Assignment_5;

import java.util.Scanner;

public class GreaterThan100 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		if(num>=100) {
			System.out.println(num + " is greater than 100.");
			
		}
		else {
			System.out.println(num + " is less than 100.");
		}
	}

}
