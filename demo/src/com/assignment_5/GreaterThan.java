//6. Write the program to check whether the no is greater than 100.

package com.assignment_5;

import java.util.Scanner;

public class GreaterThan {
	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number :");
       int num=sc.nextInt();
    
       if(num>100) {
    	System.out.println("Number is greater than 100" );
       }
       else if (num>100){
     	System.out.println("Number is less than 100");
       }
       else{
    	System.out.println("Number is equal to 100");
    }
  }
}
