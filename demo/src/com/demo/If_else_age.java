package com.demo;

import java.util.Scanner;

public class If_else_age {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		if(age>=1 && age<=10)
		{
			System.out.println("Live your childhood fully");
		}
		else if(age>=10 && age<20)
		{
			System.out.println("Don't do hard work do smart work and focus on studies");
		}
		else if(age>=20 && age<30)
		{
			System.out.println("Be matured and keep going");
		}
		else if(age>=30 && age<50)
		{
			System.out.println("live your life like no one cares");
		}
		else if(age>=50 && age<80)
		{
			System.out.println("Spend a happy time with your family");
		}
		else if(age>=80 && age<90)
		{
			System.out.println("Take care of yourself");
		}
		else if(age>90)
		{
			System.out.println("Rest in peace");
	
		}
		}

}
