package com.demo;

import java.util.Scanner;

public class TheCalculater {
         
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
	     int firstnumber = sc.nextInt(); 
	     System.out.println("Enter the second number: ");
	     int secondnumber = sc.nextInt();
	     System.out.println("Enter the type of operation (+, -, *, /): ");
	     String operation = sc.next();
	     int result =  performoperation(firstnumber, secondnumber, operation);
	     System.out.println("The answer is:" + result );
	   }
	    public static int performoperation(int firstnumber, int secondnumber, String operation) {
	    	int result = 0;
	    	if (operation.equals("+")) {
	    		result = firstnumber + secondnumber;
	    	}
	    	else if (operation.equals("-")) {
	    		result = firstnumber - secondnumber;
	    	}
	    	else if (operation.equals("*")) {
		    		result = firstnumber * secondnumber;
	    	}
		    else if (operation.equals("/")) {
			    		result = firstnumber / secondnumber;
		    }
		    else {
	            System.out.println("Invalid operation");
	        }
	    	return result;
	    	
	    }
	
}
