package com.basicAssignment5;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args)
	   {
	     
	      int num, i, count=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      for(i=1; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("\nIt is a Even Number.");
	      else
	         System.out.println("\nIt is not a Odd Number.");
	   }
	
  
}














