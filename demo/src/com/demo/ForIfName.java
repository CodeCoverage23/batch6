package com.demo;


public class ForIfName {
	static int s;

	public static void main(String[] args) {
		int s = 100;
		for (int i = 1; i <= 91; i++) {
			for (int j = 0; j <= 9; j++) {
				s = i + j;
				System.out.print(s + " ");
			}

			System.out.println();
		}
	}
}