package com.basic;

public class StringComparison {
	public static void main(String[] args) {
		// first way == address compare to string literal
		String s = "Avinash";
		String s1 = "Avinash";
		String s3 = "Khadse";
		String s4 = new String("Avinash");
		//System.out.println(s == s4);
//Second way using .equal method contain comparison 
		String s5= "Avinash";
		String s6="Avinash";
		String s7="khadse";
		String s8 = new String("Avinash");
		String s9= new String("khadse");
		System.out.println(s6.equals(s8));
	}

}
