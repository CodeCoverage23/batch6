package com.basic;

import java.util.Scanner;

public class Primenumber {
	
	public static void main(String[] args) {
		 
	     int  num;
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter a number : ");
		num = scan.nextInt();	
	
		 int s = 0;
		 
		 for (int i = 1; i <= num; i++)
	 
	        {
	 
	            if (num % i == 0)
	 
	                s++;
	        }
	 
	        if (s == 2)
	 
	            System.out.println(num + " is prime");
	 
	        else
	 
	            System.out.println(num + " is not prime");
	 }
	 
	 }
