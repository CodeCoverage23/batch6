package com.demo;
import java.util.Scanner;

public class DemoSeason {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any month:");
		String season=sc.next();
		
		switch(season) {
		
		case "February":
		case "March":
		case "April":
		case "May" :
			System.out.println("Summer");
			break;
			
		case "June":
		case "July" :
		case "August" :
		case "September":
			System.out.println("rainy");
			break;
			
		case "Octomber" :
		case "November" :
		case "December" :
		case "Janury" :
			System.out.println("Winter");
			break;
			default:
				System.out.println("Invalid Input");
				
				
		}
		
	}

}

