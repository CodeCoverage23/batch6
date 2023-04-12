//WAP to print square of any number.
package com.Assignment_5;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = sc.nextInt();
		int square = n * n;
		System.out.println(" The Square of given number is :" + square);

	}

}
