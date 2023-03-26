package com.basic;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any month(1 to 12");

		String season=sc.next();
		switch(season) {
		case "10":
		case "11":
		case "12":
		case "1":
			System.out.println("Winter");
			break;
		case "2":
		case "3":
		case "4":
		case  "5":
			System.out.println("Summer");
			break;
		case "6":
		case "7 ":
		case "8":
		case "9":
			System.out.println("Rainy");
			break;
			default:System.out.println("Invalid input");

		}

	}



	}

