package com.java;

import java.util.Scanner;

public class If_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter student id :");
		int id = sc.nextInt();

		// System.out.println("enter the name");
		// string name =sc.next();

		System.out.println("marks");
		int marks = sc.nextInt();

		if (marks >= 90 && marks < 95) {
			System.out.println("excellent");
		}

		else if (marks >= 85 && marks < 90) {

			System.out.println("best");
		} else if (marks >= 80 && marks < 85) {
			System.out.println("better");
		}

		else if (marks >= 75 && marks > 80) {
			System.out.println("good");
		} else if (marks >= 70 && marks < 75) {
			System.out.println("Avarage");
		} else if (marks >= 40 && marks < 70) {
			System.out.println("topper");
		} else {
			System.out.println("God gifted");
		}

	}

}