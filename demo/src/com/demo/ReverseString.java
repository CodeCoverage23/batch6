package com.demo;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Mansi";
		System.out.println("Original Name : " + name);
		int length = name.length();
		String reverse ="";
		 // by for loop
		for(int i= name.length() -1;i>=0;i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Reverse name : " +reverse);
	
	 
	// by without for loop
	// by stringBuffer
	
	StringBuffer sb = new StringBuffer("Hello"); System.out.println(sb);
	
	StringBuffer reverse1 = sb.reverse();
	System.out.println(reverse1);
	
	}
}
