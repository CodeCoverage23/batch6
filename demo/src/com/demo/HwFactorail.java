package com.demo;

import java.util.Scanner;

public class HwFactorail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,fact=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			fact=fact*i;
			}
		
		System.out.println("The factorail is:  "+fact);

	}

}
