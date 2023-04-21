package com.homework;

import java.util.Scanner;

public class CountCharOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String String = "Codecoverage";
		int count = 0;
		for (int i = 0; i < String.length(); i++) {
			if (String.charAt(i) != ' ')
				count++;
		}
		{
		System.out.println("Total number of characters in a string: " + count);
	}
	}

}
