//WAP to check the number to positive or negative

package com.Assignment_5;

import java.util.Scanner;

public class NumberProgam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		if(n>0)
		{
			System.out.println("Number is positive");
			
		}
		else
		{
			System.out.println("Number is negative");
		}
	}

}
