package com.basicAssignment5;

import java.util.Scanner;

public class NumberPositiveNegative {

  public static void main(String[]args) {
  
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter value");
		int number = sc.nextInt();
	  
	  // true if number is less than 0
    if (number < 0.0)
        System.out.println(number + " is a negative number.");

    // true if number is greater than 0
    else if ( number > 0.0)
        System.out.println(number + " is a positive number.");

    // if both test expression is evaluated to false
    else
        System.out.println(number + " is 0.");
}
}
	
           
