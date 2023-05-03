package com.palindrome;

import java.util.Scanner;

public class PalindromeString {
	public void palindrome() {
		System.out.println("enter a String to check the palindrome or not : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int length = name.length();
		String original = name;
		String reverse = "";

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}

		if (original.equalsIgnoreCase(reverse)) {
			System.out.println(original + " : is the palindrome String");
		} else {
			System.out.println(original + " : is not a palindrome String");
		}
	}

	public static void main(String[] args) {
		PalindromeString p = new PalindromeString();
		p.palindrome();
	}

}
