package com.assingment5;
//7.  Write the program to print the square of any number.

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		double s = n*n;
		System.out.println(s);
	}
}
