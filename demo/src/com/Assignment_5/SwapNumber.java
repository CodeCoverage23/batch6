//WAP to swap two Number.
package com.Assignment_5;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X and Y :");
		int X = sc.nextInt();
		int Y = sc.nextInt();
		System.out.println("Before swapping numbers are  " + X + " " + Y);
		N = X;
		X = Y;
		Y = N;
		System.out.println("After swappig numbers are  " + X + " " + Y);
	}
}