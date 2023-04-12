package com.ifelsedemo;

import java.util.Scanner;

public class Positivenumber {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int a=sc.nextInt();
	if (a<0 ) {
		System.out.println(" Number is Negative ");
	}
	else if (a==0)
	{
	System.out.println(" Null Value ");
	}
	else 
	{
	System.out.println(" Number is Positive ");
	}
}
	
}
