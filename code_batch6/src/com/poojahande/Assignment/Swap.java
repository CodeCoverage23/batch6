package com.poojahande.Assignment;

import java.util.Scanner;

public class Swap {
	// Scanner sc = new Scanner(System.in); 
	public static void main(String args[]) {
    
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int num2 = scan.nextInt();
		
		System.out.println("Before Swap : ");
		System.out.println(" 1st number :"+num1);
		System.out.println(" 2nd number :"+num2);
		int temp_num;
		
		temp_num = num1;
		num1 = num2;
		num2=temp_num;
		
		System.out.println("After Swap : ");
		System.out.println(" 1st number :"+num1);
		System.out.println(" 2nd number :"+num2);
		
	}
}
