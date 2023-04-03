package com.basic;

import java.util.Scanner;

public class PrimeNumber {
	
	   public static void main(String[] args) 
	   {
	      int no, s, e;
	      Scanner ak = new Scanner(System.in);
	      System.out.println ("Please enter a number: ");
	      no = ak.nextInt(); 
	      s = 1;
	      e = 0; 
	      while(s <= no)
	      {
	         if((no % s) == 0) 
	            e = e + 1;
	         s++;
	      }
	      if(e == 2)
	      {
	         System.out.println(no + " is a prime number.");
	      }
	      else
	      {
	         System.out.println(no + " is not a prime number.");
	      }
	     // no.close();
	   
	}


		
		
		// TODO Auto-generated method stub

	}


