package com.demo;

import java.util.StringJoiner;

// Concatination 2 methods se hoti hai. 
// ek + se and dusra by Concat()
//by string builder method
//  String Joiner method
public class StringConcatenation {
	public static void main(String[] args) {
		String s = "Hello" + " Java"; //type1
		System.out.println(s);
		
		String s1 = 20 + 20 + "Javaa" + 20 + 40 ; //type2
		System.out.println(s1);
		
		String s2 ="welcome to" ;
		String s3 = " the program"; // by concat method
		String s4 = s2.concat(s3);
		System.out.println(s4);
		
		// - by string builder method
		
		StringBuilder b1 = new StringBuilder("Mansi");
		StringBuilder b2 = new StringBuilder(" sahu");
		StringBuilder b = b1.append(b2);
		System.out.println(b);
		
		/// String Joiner method
		StringJoiner j = new StringJoiner(", ");   //StringeJoiner object  
        j.add("Hello");    //String 1   
        j.add("World");    //String 2  
        System.out.println(j);
		
		
	}
}
