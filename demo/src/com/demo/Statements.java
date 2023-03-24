package com.demo;

import java.util.*;

public class Statements{
	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name ");
		String name =sc.next();
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		if(marks>=80 && marks<= 90)
		
		{
			System.out.println("Grade A+");
		}
		
		else if(marks>=70 && marks<=60)
		{
		System.out.println("Grade B");}
		
		else if(marks>=40 && marks<=50)
		{
			System.out.println("Grade c");
			
		}else{System.out.println(" error");}
		
	}
}

	
	