package com.demo;

import java.util.Scanner;

public class PrimeNumbers2 {

	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Enter Number= ");
		Scanner sc=  new Scanner(System.in);
		int num= sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2)
		    System.out.println("Peime");
	    else  
	    	System.out.println("Not Prime");
		    
			

	}

}
