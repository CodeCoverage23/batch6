package com.demo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		System.out.println("enter the subject code");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		String subject = "";
		switch(nextInt) {
		
		case 27:
			subject="physics";
			break;
		case 43:
			subject="chemistry";
			break;
		case 55:
			subject="math";
			break;
		case 74:
			subject="biology";
			break;
		default:
			subject="not found";
			break;
		}
		
		System.out.println(subject);

	}

}
