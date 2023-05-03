package com.demo;

import java.util.Scanner;

// java program to check given string is palindrome or not
public class PalindromeString {
	public static void palindrome() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a string to check palindrome or not : ");
		String next = scanner.next();
		String originalstring=next;
		int length=next.length();
		String rev="";
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+next.charAt(i);
			
		}
		if(originalstring.equalsIgnoreCase(rev)) {
			
			System.out.println(originalstring+" : given string is palindrome.");
		}
		else
			System.out.println(originalstring+" : given string is not palindrome.");
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          palindrome();
	}

}
