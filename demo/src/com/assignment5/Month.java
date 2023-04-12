package com.assignment5;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		System.out.println("enter the month");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		String month = " ";
		switch(nextInt) {
		case 1: 
			month = "January";
			break;
		case 2:
			month ="february";
			break;
		case 3:
		     month ="march";
			break;
		case 4:
			month ="April";
			break;
		case 5: 
			month = "May";
			break;
		case 6:
			month ="June";
			break;
		case 7:
		     month ="July";
			break;
		case 8:
			month ="August";
			break;
		case 9: 
			month = "September";
			break;
		case 10:
			month ="October";
			break;
		case 11:
		     month ="November";
			break;
		case 12:
			month ="December";
			break;
		default:
			month ="Not Found";
			break;
		}
		System.out.println(month);

	}

}