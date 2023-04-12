package com.Assignment5;

import java.util.Scanner;

public class ThreeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("number is the maximum number " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Number is the maximum number" + num2);

		} else {
			System.out.println("Number is maximum number " + num3);
		}

	}

}
