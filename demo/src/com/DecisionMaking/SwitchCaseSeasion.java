package com.DecisionMaking;

import java.util.Scanner;

public class SwitchCaseSeasion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month");
		String month =sc.next();
		
		switch (month) {
		case "February":
		case "March":
		case "April":
		case "May":
			System.out.println("Summer Season");
			break;
		
		case "June":
		case "July":
		case "August":
		case "September":
			System.out.println("Rainy Season");
			break;
		
		case "October":
		case "November":
		case "December":
		case "January":
			System.out.println("Winter Season");
			break;
		
		default:
			System.out.println("You entered Wrong Month");
		}
	}
}
