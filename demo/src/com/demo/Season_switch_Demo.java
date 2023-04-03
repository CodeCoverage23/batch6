package com.demo;

import java.util.Scanner;

public class Season_switch_Demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Month Name To check the season");
		String month = sc.next();

		switch (month) {
		case  "february":
		case  "march":
		case  "april":
		case  "may":
			System.out.println("Summer season");
			break;
		case  "june":
		case  "july":
		case  "august":
		case  "september":
			System.out.println("Rainy season");
			break;
		case  "october":
		case  "november":
		case  "december":
		case  "january":
			System.out.println("Winter season");
		}
	}
}