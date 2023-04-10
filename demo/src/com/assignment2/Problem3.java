package com.assignment2;

public class Problem3 {
	private int localVarible() {
		int x=23;//local varible
		System.out.println(x);
		return x;
	}

	public static void main(String[] args) {
		Problem3 p = new Problem3();
		p.localVarible();
		
	}
}
