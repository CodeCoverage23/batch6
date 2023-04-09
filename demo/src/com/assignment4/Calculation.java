
package com.assignment4;

public class Calculation {
	public static int Add() {
		int a = 10;
		int b = 20;
		return a+b;
		
	}
	public static double Sum() {
		float a=20;
		float b=10;
		return a-b;
		
	}
	public static int Multi() {
		int a = 44;
		int b = 30;
		return a*b;
	}
	public static double Div() {
		float a = 5;
		float b = 10;
		return a/b;
	}
	
	public static void main(String[]args) {
		Calculation s = new Calculation();
		int d=s.Add();
		System.out.println(d);
		double f = s.Sum();
		System.out.println(f);
		int M = s.Multi();
		System.out.println(M);
		double b = s.Div();
		System.out.println(b);
		
	}

}
