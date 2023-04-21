//WAP to reverse a string using for loop
package com.String;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ReverseStringUsingLoop {
	public static void main(String[] args) {
		String name = "Kiran";
		System.out.println("Sting berfor reverse: " + name);
		int length = name.length();
		String rev = " ";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		System.out.println("string after reverse: " + rev);
	}

}