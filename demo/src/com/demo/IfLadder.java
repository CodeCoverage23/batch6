package com.demo;

import java.util.Scanner;

public class IfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  	int marks =10;
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter a value :");
		int marks=scanner.nextInt();
		if(marks>=80 && marks<=90) {
			System.out.println("grade A++");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("grade A");
			
		}
		else if(marks>=60 && marks<70) {
			System.out.println("geade B");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("grade C");
		}
		else if(marks>=40 && marks<50) {
			System.out.println("Failed");
		}
			
	}

}
