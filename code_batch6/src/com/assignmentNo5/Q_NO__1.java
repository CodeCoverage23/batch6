package com.assignmentNo5;

import java.util.Scanner;

//check the number is +ve or-ve
public class Q_NO__1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int num = sc.nextInt();
		if (num >0) {
			System.out.println(" number is positive");
		} else {
			System.out.println("number is negative ");
		}
	}

}
