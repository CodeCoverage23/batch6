package com.assingment5;
//3.write a program to find out maximum number among three number(if else if ladder statement)

import java.util.Scanner;

public class MaximumNumber {
public static void main(String[] args) {
	System.out.println("Enter a three numbers");
	Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	
	if(a>b && a>c) {
		System.out.println("The maximum number is :" + a);
	}else if (b>a && b>c) {
		System.out.println("The maximum number is :" + b);
	}else if (c>a && c>b) {
		System.out.println("The maximum number is :" + c);
	}
}
}
