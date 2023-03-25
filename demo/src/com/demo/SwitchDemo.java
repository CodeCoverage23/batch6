package com.demo;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int age = 20;
		System.out.println("Enter your age");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		String msg = "";
		switch (nextInt) {
		case 16:
			msg = "you are under 18";
			break;
		case 18:
			msg = "you are eligible for vote";
			break;
		case 65:
			msg = " you are senior citzen";
			break;
		default:
			msg = "invalid age";
			break;

		}
		System.out.println(msg);
	}

}
