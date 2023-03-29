package com.demo;

public class NumberPrinting {
	static int i = 1;

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);

			if (i % 5 == 0) {
				System.out.println("Kiran");

			} else if (i % 7 == 0) {
				System.out.println("Lokhande");

			} else if (i == 35) {
				System.out.println("Kiran Vasantrao Lokhande");

			}
		}

	}
}
