package com.demo;
public class RevString {
	public static void main(String[]args) {
		
		
		String name = "Gauri";
		System.out.println("String before reverse operation: "+name);
		int length = name.length();
		String rev = "";
		for(int i = length-1; i>=0;i--)
		{
			rev = rev+ name.charAt(i);
		}
		System.out.println("String after reverse: " +rev);
	}

}
