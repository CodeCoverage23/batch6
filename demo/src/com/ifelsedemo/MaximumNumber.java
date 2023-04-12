package com.ifelsedemo;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter A Number: ");
		int a=sc.nextInt();
		if ( a % 2 == 0 ) 
		{
			System.out.println(" Number is Even " );
		}
		else
		{
			System.out.println(" Number is Odd ");
		}
		}
	}
