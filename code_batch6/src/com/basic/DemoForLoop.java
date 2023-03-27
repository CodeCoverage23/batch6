package com.basic;

public class DemoForLoop {

	public static void main(String[] args) {
		int num;
		for (int i= 1; i <= 10; i++) {
			for(int j = 2; j <= 10; j++) {
			num = j*i;
			System.out.print(num+" ");
			}
			System.out.println();
	}
		
	}

}