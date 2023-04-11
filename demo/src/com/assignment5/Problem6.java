//WAP to check whether the number is grater then 100

package com.assignment5;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  No: ");

		int A = sc.nextInt();
		
		if(A>100) {
			System.out.println("The given number is grater than 100");
		}
		else {
			System.out.println("The given number is less than 100");
		}

	}

}
