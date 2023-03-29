package com.demo;

import java.util.Scanner;

public class FactorialProgram {
	
public static void main(String[] args) {
	     
	    int fact=1;
			
			Scanner as=new Scanner(System.in);
			System.out.println("Enter a number:  ");
			int num=as.nextInt();
			
			for(int i=1;i<=num;i++) {
				{
				fact=fact*i;
				}
			{ 
			
				System.out.println("Factorial of "+num+" is : " +fact);
            }
			}
}
}
