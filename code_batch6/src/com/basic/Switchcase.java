package com.basic;

import java.util.Scanner;

public class Switchcase {

	//private static String month;

	public static void main(String[] args) {
		String season;
	Scanner ak =new Scanner(System.in); 
	//System.out.println("enter the month name");
	//String name=ak.next();
		System.out.println("Enter the month no (1 to 12)");
		//int no =ak .nextInt();
		int entry = ak.nextInt();

		switch (entry)
		{
		case 2:System.out.println("February");
		season="Summer";
		break;
	    case 3:System.out.println("March");
	    season="Summer season";
	    break;
		case 4:System.out.println("April");
		season="Summer season";
		break;
		case 5:System.out.println("may");
        season= "Summer season";
         break;
	    case 1: System.out.println("january");
	    season = "winter season";
		break;
		case 10:System.out.println("October");
		season = "winter season";
		break;
		case 11:System.out.println("November");
		season = "winter season";
		break;
		case 12:System.out.println("December");
			season = "winter season";
		break;
		case 6:System.out.println("June");
		season="rainy season";
		break;
		case 7:System.out.println("July");
		season="rainy season";
		break;
		case 8:System.out.println("Augst");
		season="rainy season";
		break;
		case 9:System.out.println("September ");
	    season="rainy season";
		break;
		default:
			season="invalied input";
			break;
		}
			System.out.println("The entered month is the " +season + ".");
	
		
		}
		

	}

