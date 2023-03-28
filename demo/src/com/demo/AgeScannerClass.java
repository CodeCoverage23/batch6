package com.demo;

import java.util.Scanner;

public class AgeScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of candidates:");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("you are eligible for voting");
		} else if (age < 18) {
			System.out.println("your are not eligible for voting");
		}

	}

}

