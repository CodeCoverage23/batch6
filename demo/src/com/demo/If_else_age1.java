package com.demo;

import java.util.Scanner;

public class If_else_age1 {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of women greater than 20 yrs old");
		int age = sc.nextInt();
		
		if(age>20 && age<=34)
		{
			System.out.println("Your weight should be 34.8");
		}
		else if(age>=35 && age<44)
		{
			System.out.println("Your weight should be 43.4");
		}
		else if(age>=45 && age<54)
		{
			System.out.println("Your weight should be 42.9");
		}
		else if(age>=55 && age<64)
		{
			System.out.println("Your weight should be 48.2");
		}
		else if(age>=65 && age<74)
		{
			System.out.println("Your weight should be 43.5");
		}
		else if(age>=75)
		{
			System.out.println("Your weight should be 32.7");
		}
		
		}

}



