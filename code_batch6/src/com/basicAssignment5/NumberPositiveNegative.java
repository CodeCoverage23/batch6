package com.basicAssignment5;

import java.util.Scanner;

public class NumberPositiveNegative {

  public static void main(String[]args) {
  
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter value");
		int number = sc.nextInt();
	  
	
    if (number < 0.0)
        System.out.println(number + " is a negative number.");

   
    else if ( number > 0.0)
        System.out.println(number + " is a positive number.");

   
    else
        System.out.println(number + " is 0.");
}
}
	
           
