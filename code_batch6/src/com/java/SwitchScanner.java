package com.java;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int roollnumber = 67;
		//String name = (" ");
		System.out.println("enter your rollnumber :");

		//System.out.println("Student name :");

		Scanner scanner = new Scanner(System.in);

		int rollnumber = scanner.nextInt();

		switch (rollnumber) {

		case 3:
			System.out.println("good in all subject");
			break;
		case 5:
			System.out.println("good in chemistry");
			break;
		case 2:
			System.out.println("good in marathi");
			break;
		case 10:
			System.out.println("good in hindi");
			break;
		case 9:
			System.out.println("good in english");
			break;
		case 11:
			System.out.println("good in physics");
			break;
		case 12:
			System.out.println("good in geology");
			break;
		case 13:
			System.out.println("goo in geoghraphy");
			break;
		case 14:
			System.out.println("good in maths");
			break;
		case 25:
			System.out.println("good in biology");
			break;
		case 16:
			System.out.println(" good in saskrit");
		case 17:
			System.out.println("good in sport");

		case 18:
			System.out.println("good in current affair");
		case 67:
			System.out.println("good in history");
			break;
		default:
			System.out.println("Invalid Data");
		}

	}

}
