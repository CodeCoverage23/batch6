//WAP to check whether program is odd or even.
package com.Assignment_5;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is odd");
		}
	}
}
