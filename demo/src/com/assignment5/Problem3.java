//WAP to find maximum number among three number(if else if ladder)


package com.assignment5;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the 1St No: ");
		
		int A= sc.nextInt();
System.out.println("Enter the 2nd No: ");
		
		int B= sc.nextInt();

System.out.println("Enter the 3rd No: ");
		
		int C= sc.nextInt();
		
		
		if(A>=B && A>=C) {
			
			System.out.println("A is grater than B & C");
		}
			
		else if (B>=A && B>=C) {
				 
				System.out.println("B is grater than A & C");
				
			}
		else {
			System.out.println("C is grater than B & A");
		}
		}


	}


