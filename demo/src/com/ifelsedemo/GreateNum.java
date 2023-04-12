package com.ifelsedemo;

import java.util.Scanner;

public class GreateNum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter A Number: ");
		int a = sc.nextInt();
		if ( a >= 100 )
		{
			System.out.println(" Number is Greater than 100 ");
		}
		else
		{
			System.out.println( " Number is Less than 100 " );
		}
		
	}

}
