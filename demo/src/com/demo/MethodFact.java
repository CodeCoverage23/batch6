package com.demo;

import java.util.Scanner;
public class MethodFact{
	public int FactorialNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int fact =1;
		
		 for(int i=1; i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[]args) {
		
		MethodFact obj = new MethodFact();
		int result = obj.FactorialNumber();
		System.out.println("Factorial of a number =" +result);
	}
	
}

			
		

