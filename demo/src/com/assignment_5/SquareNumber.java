//7.  Write the program to print the square of any number.

package com.assignment_5;

import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        int n = sc.nextInt();

	        int square = n * n;
	        System.out.println("The square of " + n + " is " + square);
	    }
	}


