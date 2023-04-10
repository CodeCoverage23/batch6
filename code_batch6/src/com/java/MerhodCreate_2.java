package com.java;

public class MerhodCreate_2 {
   
	//with return type
	public int factorial() {
		
		int fact = 1;
		int number=5;
		for( int i=1;i<=number;i++) {
			fact=fact*i;
		}
           return fact;
		
	}
public static void main(String[] args) {
     //create object for printing the return value
	//in main method
	MerhodCreate_2 sc = new MerhodCreate_2 ();
	int result = sc.factorial(); {
		System.out.println( "facto.number=  "+ result);
	}
}}
