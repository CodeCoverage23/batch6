package com.demo;

import java.util.Scanner;  

public class Arethmeticoperation {  


public static void main (String args[])  
  {      
	Arethmeticoperation.findArethmeticOperation(20,10);
}

public static void findArethmeticOperation(int a, int b)  
{  
//	Scanner sc=new Scanner(System.in);  
//	System.out.print("Enter the first number: ");   
//    int  a= sc.nextInt();  
//	System.out.print("Enter the second number: ");
//	 int b=sc.nextInt();
	 
//	int sum = a + b;
//    int difference = a - b;
//    int product = a * b;
//    int quotient = a / b;
    
     			System.out.println("The sum of the two numbers is: " + (a+b));
     			System.out.println("The difference of the two numbers is: " + (a-b));
     			System.out.println("The product of the two numbers is: " + (a*b));
     			System.out.println("The quotient of the two numbers is: " + (a/b));
}

}  