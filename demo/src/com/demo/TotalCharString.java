package com.demo;

public class TotalCharString {

	public static void main(String[] args) {
		String name = "Code Coverage";
		int total = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) != ' ')
				total++;
		}
		System.out.println("Total number of charactor in string : " +total);
	}

}
