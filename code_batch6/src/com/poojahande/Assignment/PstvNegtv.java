package com.poojahande.Assignment;

import java.util.Scanner;

public class PstvNegtv {

public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		
		if(num>=0) {
			System.out.println("Entered number is Positive ");
		}else
		{
			System.out.println("Entered number is Negative");
		}
	}
}
