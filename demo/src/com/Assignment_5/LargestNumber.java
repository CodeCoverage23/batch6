//WAP to find out maximum number among three number(Using if else ladder)
package com.Assignment_5;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n1 >= n2 & n1 >= n3) {
			System.out.println(n1 + " is the Largest Number");
		} else if (n2 >= n1 & n2 >= n3) {
			System.out.println(n2 + " is the Largest Number");
		} else {
			System.out.println(n3 + " is the Largest Number");
		}
	}

}
