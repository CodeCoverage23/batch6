package com.task;

public class IfElseLadderTask {
	public static void main(String[] args) {

		for (int a = 1; a <= 100; a++) {

			if (a % 5 == 0) {
				System.out.println(a + " Yash");
			}
			else if(a%7==0) {
				System.out.println(a+ " Nugurwar");
			}
			else if(a%(5*7)==0) {
				System.out.println(a+" Yash Nugurwar");
			}
			else {
				System.out.println(a);
			}

		}

	}

}
