package com.basic;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Aadhar no");
		int no =sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		if(age>=60 && age<=70)
		{
			System.out.println("Senior Citizen");
		}
			else if(age>=50 && age<60)
			{
				System.out.println("Very young Senior Citizen");
			}
			else if (age>=40 && age<50)	
			{
			System.out.println("Younng Middle Aged Adult");	
			}
			else if (age>=20 && age<30) 
			{
				System.out.println("Adult Ager");
			}
			else if (age>=13 && age<19)
				
			{
				System.out.println("Teen Ager");
			}
			else if(age>=5 && age<13) 
			{
				System.out.println("Kid Ager");
			}
			else if(age>0 && age<5) 
			{
				System.out.println("Child Ager");
			}
			else if (age>=70 && age<80)
			{
				System.out.println("Super Senior Citizen");
			}
			}
		}
	
		
				
		
		

	



