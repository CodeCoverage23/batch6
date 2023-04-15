package com.assingment5;

import java.util.Scanner;

//8. Write a program to swap the two numbers.
public class Swap2Numbers {
	public static void main(String[] args) {
		System.out.print("Enter a two numbers");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a + " "+ b);
		
		//without third integer
		double x = sc.nextDouble(); //10
		double y = sc.nextDouble(); //20
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x + " "+ y);
		
	
		
	}
}
