package com.oops;
/**
 */
public class MethodOverloadingDemo {

	// by number of parameters
	public void play(String teamA, String teamB) {
		System.out.println("Two teams can play cricket : " + teamA + " " + teamB);
	}

	public void play(String player) {
		System.out.println("Play weight leafting : " + player);
	}

	// by data types of parameters
	public int add(int a, int b) {
		return a + b;
	}

	public double add(int a, double b) {
		return a + b;
	}

	// by order of parameters
	public void multiplication(long a, double b) {
		System.out.println(a * b);
	}

	public void multiplication(double b, long a) {
		System.out.println(a * b);
	}
	public void div(double b, long a) {
		System.out.println(a * b);
	}
	
	//by return type of method 
	/*
	 * public double multi(long a, double b) { System.out.println(a * b);
	 * 
	 * return a*b; } public void multi(long a, double b) { System.out.println(a *
	 * b); }
	 */

	public static void main(String[] args) {

		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.play("IndiaA", "IndiaB");
		m.play("John");

		System.out.println(m.add(12, 120));
		System.out.println(m.add(10, 10.11d));

		m.multiplication(12, 12.5f);
		m.multiplication(4.5f, 24);
		
		m.div(4, 4);
	}

}
