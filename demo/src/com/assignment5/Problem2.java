package com.assignment5;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the year");
		int year=s.nextInt();
	    
		   
	     if(year % 4 == 0) {
	    	 
	    	 if(year % 100 !=0 || year % 400==0) {
	    		 System.out.println("the year is leap");
	    	 }
	     }
	     else {
	    	 System.out.println("year is not leap");
	     }

	    
	  
	

}

}

		
	
			 
			    