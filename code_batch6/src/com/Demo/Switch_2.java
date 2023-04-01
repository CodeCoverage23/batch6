package com.Demo;

import java.util.Scanner;

public class switch_2 {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any month(1 to 12");
	String season=scan.next();
	switch(season) {
	case "feb":
	case "march":
	case "april":
	case "may":
	System.out.println("summer");
	break;
	case "jun":
	case "july":
	case "Agust":
	case  "sept":
	System.out.println("rainy");
	break;
	case "oct":
	case "Nov":
	case "dec":
	case "Jan":
	System.out.println("Winter");
	break;
	default:System.out.println("Invalid input");
	}
 }
}