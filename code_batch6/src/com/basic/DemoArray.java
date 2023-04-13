package com.basic;

public class DemoArray {

	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;
	int e = 50;
	int f = 10;
	int g = 10;
	int h = 10;
	int i = 10;
	int j = 10;

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		//By old for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println("By Old for loop : " + a[i]);
		}

		// By For each loop
		for (int b : a) {
			System.out.println("By New for loop : " + b);
		}

	}

}
