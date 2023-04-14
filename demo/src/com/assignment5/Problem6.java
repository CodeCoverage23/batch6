package com.assignment5;

import java.util.Scanner;

public class Problem6 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the number: ");
	int n=s.nextInt();
	if(n>100) {
		System.out.println("the no.is greater than 100");
		
	}
	else {
		System.out.println("the no.is less than 100");
	}
}
}
