package com.demo;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		
		String monthString="";
		switch (a) {
		case 1: 
			monthString="january";
			break;
		case 2:
			monthString="february";
			break;
		case 3:
			monthString="march";
			break;
		case 4:
			monthString="April";
			break;
		case 5:
			monthString="may";
			break;
		case 6:
			monthString="june";
			break;
		case 7:
			monthString="july";
			break;
		case 8:
			monthString="august";
			break;
		case 9:
			monthString="september";
			break;
		case 10:
			monthString="octomber";
			break;
		case 11:
			monthString="november";
			break;
		case 12:
			monthString="Dicember";
			break;
			default:System.out.println("invalid input");
			
		
		}
		
	}

}
