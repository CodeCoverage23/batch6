//3.write a program to find out maximum number among three number(if else if ladder statement)

package com.assignment_5;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println(" The maximum number " + a);
			
		} else if (b > a && b > c) {
			System.out.println(" The maximum number " + b);

		} else {
			System.out.println(" The maximum number " + c);
		}
	}
}
