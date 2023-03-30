package com.basic;

import java.util.Scanner;

public class DemoScannerClass {
	// int age = 20; //HardCode value

	public static final String PAN_CARD = "";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer value : ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Valid for Vote");
		} else if (age > 12) {
			System.out.println("valid for Par Card");
		} else {
			System.out.println("Invalid Input");
		}
	}

	public void printYourName() {
		String bankName;
		String myName = "Swapnil";

		System.out.println(myName);

	}

	public void name() {

	}

}
