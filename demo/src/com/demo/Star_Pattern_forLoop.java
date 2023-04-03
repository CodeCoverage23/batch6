package com.demo;

public class Star_Pattern_forLoop {

	public static void main(String[] args) {
		
			//left side right angle triangle
		for (int i = 1; i <= 5; i++) {

			for (int k = i; k > i - 1; k--) {
				System.out.print(" ");
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	
		// Right side right angle triangle

		for (int i = 1; i <= 5; i++) {

			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


