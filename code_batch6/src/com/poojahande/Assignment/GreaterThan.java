package com.poojahande.Assignment;

import java.util.Scanner;

public class GreaterThan {

public static void main(String[] args) {
		
		int num1,num2;
		System.out.println("Enter the number 1st number : ");
		Scanner sc1 = new Scanner(System.in);
		num1= sc1.nextInt();
		
		System.out.println("Enter the number 2nd number : ");
		Scanner sc2 = new Scanner(System.in);
		num2= sc2.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is greater number");
		}else
		{
			System.out.println(num2+" is greater number");
		}
	}
}

