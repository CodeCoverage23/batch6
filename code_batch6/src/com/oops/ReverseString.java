package com.oops;

//java program for reverse a string
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// with for loop
		String name = "Avinash";
		System.out.println("string before reverse operation : " + name);
		int length = name.length();
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}

		System.out.println("string after reverse : " + rev);

		// without for loop
		StringBuffer sb = new StringBuffer("khadse");
		System.out.println("string before reverse operation : " + sb);
		StringBuffer reverse = sb.reverse();
		System.out.println("string after reverse : " + reverse);

	}

}
