package com.demo;

public class StaticMethod {

	 static int run(int x) {
		
		
		return(x*x*x) ;
		
	}
	
	public static void main(String[] args) {
		int c =run(5);
		System.out.println(c);
	}
}
