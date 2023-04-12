package com.assignment5;

import java.util.Scanner;

public class PossitiveOrNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int number = sc.nextInt();
		
		if(number>=0) {
			System.out.println("Possitive Number");
		}
		else {
			System.out.println("Negative Number");
		}

	}

}
