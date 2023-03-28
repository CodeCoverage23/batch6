package com.basic;

import java.util.Scanner;

public class forloop {
	
  public static void main(String[] args) {
	  System.out.println("Enter the number :");
	    Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
    
    // for loop  
    for (int i =1;i <= 10; ++i) {
      System.out.println(n+"*"+i+"="+n*i);
    }
  }
}



