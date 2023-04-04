package com.demo;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter a value");
     int n = scanner.nextInt();
     for(int i=1;i<=1;i++) {
    	 int count=0;
    	 for(int j=1;j<=i;j++)
    		 if(i%j==0) {
    			 count++;
    		 }
    if(count==2) 
    {
    	System.out.println("prime number");
    }
    else
    {
    	System.out.println("Not a prime number");
    }
    
       
     }
		
		}

}
