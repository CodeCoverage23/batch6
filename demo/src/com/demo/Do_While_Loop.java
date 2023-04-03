package com.demo;

public class Do_While_Loop {

	public static void main(String[] args) {
		int a = 1;
		do {
			int b =  3* a;
			if(b==33)
				break;
			System.out.println(b);
			a++;
		} while (a <= 12);

	}
}
