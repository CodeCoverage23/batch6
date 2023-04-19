package com.homework;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using for loop
		String name = "Bhavika";
		System.out.println("String before reverse operation :" +name);
		int length = name.length();
		String rev ="";
		for(int i=length-1; i>=0; i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println("String after reverse :" +rev);
		

	}

}
