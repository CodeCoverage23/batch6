package com.Assignment5;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner sc= new Scanner(System.in);
		 int num= sc.nextInt();
  System.out.println("Enter number");
  
  if(num>2) {
	  System.out.println("number is positive");
  }
  else if(num<2 ) {
	  System.out.println("number is negative");
  }
  
	
	else {
		System.out.println("not number");
	}

	}
}

