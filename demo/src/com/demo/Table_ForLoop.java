package com.demo;

public class Table_ForLoop {
	public static void main(String[] args) {
		int k;
		for (int i = 2; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				k = i * j;
				System.out.print(k + ", ");
			}
			System.out.println();
			
		}
	}
}
