package com.basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n, a;
		System.out.println("Enter the number");
		Scanner ak = new Scanner(System.in);
		n = ak.nextInt();
		while (n > 0) {

			a = n % 10;
			System.out.print(a);
			n = n / 10;
		}

	}
}
