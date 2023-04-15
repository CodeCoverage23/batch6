package com.demo;
// this is immutable . isme koi change nahi kr skte main string ke sath but concat ke through usme add kr skte hai 
public class StringImmutableDemo {

	public static void main(String[] args) {
		String s = "Mansi";
		s= s.concat(" Sahu");
		System.out.println(s);
		
		String s1="Hello";
		System.out.println(s1.concat("Program"));
	}
}
