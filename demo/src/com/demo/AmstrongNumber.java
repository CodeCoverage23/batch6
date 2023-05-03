package com.demo;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number For Check the Amstrong Number");
		int num = sc.nextInt();

		int original = num;
		int temp = num;
		int digit = 0;

		// For counting digit from user
		while (temp > 0) {
			temp = temp / 10; // From this we will get quotient
			digit++;
		}
//		System.out.println(digit);

		// now we get last digit number from user's value and

		int lastdigit = num;
		int sum = 0;
		while (lastdigit > 0) {
			int last = lastdigit % 10;

			sum += Math.pow(last, digit);
			lastdigit = lastdigit / 10;
		}
//		System.out.println(sum);
		// for checking amstrong number.
		if (sum == original) {
			System.out.println(sum + " : is amstrong number");
		} else {
			System.out.println(sum + " : is not amstrong number");
		}

	}

}
