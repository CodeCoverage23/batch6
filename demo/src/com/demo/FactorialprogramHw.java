package com.demo;

import java.util.Scanner;

public class FactorialprogramHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial : ");
		int fact=1;
		int s = sc.nextInt();
		for(int i=1;i<=s;i++) {
			
			fact=fact*i;
		}
		System.out.println(fact);

	}
}
