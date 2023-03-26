package com.basic;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter any Month: ");
     String month=scan.next();
     switch(month) {
     
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
    	 default:
    		 System.out.println("Invalid month");
    		 break;
     }
     
	}

}
