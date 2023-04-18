package com.demo;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,no,b,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		no = s.nextInt();
		b=no;
		while(no>0)
		{
			a=no%10;
			no=no/10;
			temp=temp*10+a;
		}
		if(temp==b) {
			System.out.println("It is a Pallindrome");
		}
		else {
			System.out.println("It is not a Pallindrome number");
		}

	}

}
