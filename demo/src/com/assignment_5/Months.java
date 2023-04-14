//4.Write a program to print month of year. Case 1 January case 2 February case n....use switch case

package com.assignment_5;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month (1 to 12) :");
		int n = sc.nextInt();
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


