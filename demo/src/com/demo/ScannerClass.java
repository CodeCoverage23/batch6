package com.demo;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer value:");
		
		int age = sc.nextInt();
		
		if (age>18) {
			
			System.out.println("Valid for vote");
		}
		else if (age>12) {
			System.out.println("valid for card");
		}
		else {
			System.out.println("invalid vote");
		}
	}
}
