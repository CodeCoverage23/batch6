//WAP to count the character of string.
package com.String;

import java.util.Scanner;

public class CountCharOfString {
	public static void main(String[] args) {
		String String = "Codecoverage";
		int count = 0;
		for (int i = 0; i < String.length(); i++) {
			if (String.charAt(i) != ' ')
				count++;
		}

		System.out.println("Total number of characters in a string: " + count);
	}

}
