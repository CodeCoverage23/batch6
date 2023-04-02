package com.demo;

public class NestedIf {
		 
	public static void main (String []args){
		 
		int a = 12;
		if (a < 20) {
			System.out.println("A = " + a);
			 if (a % 3 == 0) {
				 
			 System.out.println(" Divided by 3 ");
			 }
	     	}
		 System.out.println(" Rest of the code ");
	  }
	}
