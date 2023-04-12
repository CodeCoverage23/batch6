//WAP to print month of year. case1 january,case2 fabrary,case n use Switch case. 
package com.Assignment_5;

import java.util.Scanner;

public class MonthOfYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Month:");
		int month = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("february");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid Input");

		}
	}
}
