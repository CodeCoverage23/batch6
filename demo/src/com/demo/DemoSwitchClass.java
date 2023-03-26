package com.demo;

import java.util.Scanner;

public class DemoSwitchClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Month:  ");
		
		String  month=sc.nextLine();
	
		//String month="january";
	     
		switch(month) {
		
		
		case "febrary":
			System.out.println(" Summer Season");
			break;
			
		case "march": 
			System.out.println(" Summer Season");
			break;
		case "april": 
			System.out.println(" Summer Season");
			break;
			
		case "may": 
			System.out.println(" Summer Season");
			break;
		case "jun": 
			System.out.println(" Rainy Season");
			break;
		case "july": 
			System.out.println(" Rainy Season");
			break;
		
		case "august": 
			System.out.println(" Rainy Season");
			break;
			
		case "september": 
			System.out.println(" Rainy Season");
			break;
			
		case "october": 
			System.out.println(" Winter Season");
			break;
		case "november": 
			System.out.println(" Winter Season");
			break;
		case "december": 
			System.out.println(" Winter Season");
			break;
		
		case "january": 
			System.out.println(" Winter Season");
			break;
			
			default: 
				System.out.println("INVALID MONTH");
			
		
		}
		
		

	}

}
