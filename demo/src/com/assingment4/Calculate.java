package com.assingment4;
// Write the Java Program to calculate total of five subject marks and average of it.
public class Calculate {
	
	
	
	public static void main(String[] args) {
		double maths = 50;
		double physics = 60;
		double chemistry = 77;
		double english = 80;
		double hindi = 99;
		
		double average = (maths + physics + chemistry + english + hindi  )/5;
		
		System.out.println("The average of five subject is : " + average);
	}
}
