package com.demo;

import java.util.Scanner;

public class HwIfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any  Number: ");
		
		int num=sc.nextInt();
		
		if(num%5==0 && num%7==0 ) {
			System.out.println("Full Name :Shweta Sanjay Lohakare");
		}
		
		else if(num%7==0) {
			System.out.println("Last name:Lohakare");
		}
		else if(num%5==0) {
			
			System.out.println("First name:Shweta");
		}
		else {
			System.out.println("Error");
		}
		

	}

}
