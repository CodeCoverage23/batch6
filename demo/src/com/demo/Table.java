package com.demo;

public class Table {
	static int s;

	public static void main(String[] args) {
		int s = 10;
		int c = 1;
		for (int i = 1; i <= s; i++) {
			for (int j = 1; j <= s; j++) {
//				s = i + j;
				System.out.print(c + " ");
				c++;
			}

			System.out.println();
		}
	}
}
