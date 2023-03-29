package com.demo;

import java.util.Scanner;

public class Factorial {
	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print(" Enter number for factorial : ");
	
int m = sc.nextInt();
	for (int i=1;i<=m;i++){    
	      m=m*i; 
	  }    
	 System.out.println(+m);
	
}
}
