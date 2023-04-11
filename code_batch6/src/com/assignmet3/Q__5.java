package com.assignmet3;

import java.util.Scanner;

// To calculate total of five subject marks and average of it
public class Q__5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		System.out.println("enter the marks of the subject");
		int total = m1 + m2 + m3 + m4 + m5;
		double average = total / 5;
		System.out.println("total marks " + total);
		System.out.println("avarage is  " + average);

	}

}
