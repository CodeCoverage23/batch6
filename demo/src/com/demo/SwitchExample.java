package com.demo;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		//System.out.println("Enter the season");
	//	int winter=1;
	//	int summer=2;
		//int rainy=3;
		//int autumn=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the season");
		
		String month = sc.next();

		switch(month) {

		case "winter": 
			month = "January,February,March";
			break;
		case "summer":
			month ="April,may,june";
			break;
		case "rainy":
		     month ="July,August,September";
			break;
		case "autumn":
			month ="October,November,December";
			break;
		default:
			month ="Not Found";
			break;
		}
		System.out.println(month);
 
	}

}
