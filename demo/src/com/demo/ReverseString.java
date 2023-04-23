package com.demo;

public class ReverseString {

	public static void main(String[] args) {
		//using for loop
		String name = "vaishnupawar";
		int length = name.length();
		String reverse = "";
		for(int i=length-1; i>=0; i--) {
			reverse = reverse+name.charAt(i);
		}
		System.out.println("Reverse String Is : " + reverse);
		
		//without for loop
		StringBuffer sb = new StringBuffer("vaishnupawar");
		StringBuffer rev = sb.rev();
		System.out.println("Reverse String Is : " + reverse);
	}

}
