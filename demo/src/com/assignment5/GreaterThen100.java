package com.assignment5;

import java.util.Scanner;

public class GreaterThen100 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int number = sc.nextInt();
		
		
		if(number>100) {
			System.out.println("Greater Then 100");
		}
		else {
		System.out.println("Less Then 100");
	}
	
	}
}

