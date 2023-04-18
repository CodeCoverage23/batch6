package com.poojahande.Assignment;
import java.util.*;

public class Swapnum {

	static Scanner sc = new Scanner(System.in); 
		
	public static void main(String args[])
	{
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();
			
		
		System.out.println("Before Swap : ");
		System.out.println(" 1st number :"+num1);
		System.out.println(" 2nd number :"+num2);
		System.out.println("After Swap : ");
		
		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;
		
		System.out.println(" 1st number :"+num1);
		System.out.println(" 2nd number :"+num2);
		
	}
}
