package com.java;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		switch (age) {

		case 16:
			System.out.println("under 18");
			break;
		case 18:
			System.out.println("Eligible for vote");
			break;
		case 65:
			System.out.println("senior citizen");
			break;
		default:
			System.out.println("Invalid age");

		}

	}

}
