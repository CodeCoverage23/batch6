
package com.demo;

public class DemoTable {

	static int b;

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int t = j * i;
				System.out.print(t + " ");
			}
			System.out.println(" ");
		}

	}

}
