//5. Write a program to check whether number is even or odd.

package com.assignment_5;

import java.util.Scanner;

public class Even_Odd {
	
	public static void main (String[]args)  {
 	   
    	Scanner sc=new Scanner (System.in);
   		System.out.println("Enter the number");
   		int num=sc.nextInt();
   		
   		if(num%2==0) 
   		{ 
   			System.out.println("Number is even");
   		}
   		else 
   		{
   			System.out.println("number is odd");
   		}
   	}   
}
