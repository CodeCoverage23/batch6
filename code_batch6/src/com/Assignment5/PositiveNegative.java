package com.Assignment5;

import java.util.Scanner;

public class PositiveNegative {
public static void main(String[] args) {
	Scanner p = new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=p.nextInt();
	if(n>=0) {
		System.out.println("Number is positive");
	}
	
	else{
		System.out.println("Number is negative");
	}
	
}
}