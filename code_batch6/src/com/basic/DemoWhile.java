package com.basic;

public class DemoWhile {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 10) {
			int b = 5 * a;
			a++;
			if (b == 25) {
				continue;
			}
			System.out.println(b);
		}

	}

}
