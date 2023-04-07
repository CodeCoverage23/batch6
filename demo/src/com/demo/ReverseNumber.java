package com.demo;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number which we have to Reverse:");
		int num = sc.nextInt();

		for (; num != 0; num = num / 10) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The Reverse of given Number is :" + reverse);
	}

}
