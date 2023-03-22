package com.demo;

import java.util.*;

public class Statements{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter the age of student"); 
		//Describe those student who are eligible to vote above 18
		 int student=sc.nextInt();
		 
		
		int Student=18;
		
		if(student>18) {
			
			System.out.println(" eligible to vote");
			
		}
		else {
			System.out.println("not eligible to vote");
		}
		
		
	}
	
	
	
}
