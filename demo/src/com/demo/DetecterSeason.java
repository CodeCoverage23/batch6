package com.demo;

import java.util.Scanner;

public class DetecterSeason {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any month(1 to 12");
	
	String season=sc.next();
	switch(season) {
	case "octomber":
	case "november":
	case "december":
	case "january":
		System.out.println("Winter");
		break;
	case "february":
	case "march":
	case "April":
	case  "may":
		System.out.println("Summer");
		break;
	case "june":
	case "july ":
	case "agust":
	case "september":
		System.out.println("Rainy");
		break;
		default:System.out.println("Invalid input");
	
	}
	
}
}
