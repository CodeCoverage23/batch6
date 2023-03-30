package com.demo;

import java.util.Scanner;

public class MethodFactorial {
	
	public long factorialNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:-");
	       int num=sc.nextInt() ;
	       long fact = 1 ;
	       for(int i=1;i<=num;i++) {
	       fact=fact*i;
		}
	       return fact ;
	   	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		MethodFactorial method =new MethodFactorial();
		long output=method.factorialNumber();
		System.out.println("factorial is:"+output);
	}
	
}
