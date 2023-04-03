package com.java;

import java.util.Scanner;

public class SwitchSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter month");
		String season = sc.next();

		switch (season) {
		case "feb":
		case "march":
		case "april":
		case "may":
			System.out.println("Summer");
			break;

		case "june":
		case "july":
		case "aug":
		case "sep":
			System.out.println("Rainy");
			break;

		case "oct":
		case "nov":
		case "dec":
		case "jan":
			System.out.println("Winter");
			break;
		 default:
			System.out.println("Invalid SEASON ");
			break;
		}
	}

}
