package com.Assignment5;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month (1 to 12)");
		int n = s.nextInt();
		String monthName;

		switch (n) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "Invalid month number";
			break;
		}

		System.out.println(monthName);
	}

}