package com.exception;

public class TryCatch {
	public static void main(String[] args) {
		int data;
		try {
			int a = 20/0;
			
			System.out.println("gshgirug"); //ye print nahi hoga 
		} catch (ArithmeticException e) {
			// TODO: handle exception   
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("We can't devided by zero");
		}
		System.out.println("rest of the code");
		
		System.out.println(20/(0+2));
	}
}
