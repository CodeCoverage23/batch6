package com.demo;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		
		int i;
		for (i=1; i<=100; i++) {
			if (i % (5*7)==0) {
				System.out.println(i + "Vaishnavi Pawar");
			}
			else if (i % 7==0) {
				System.out.println(i + "Pawar");
			}
			else if (i % 5==0) {
				System.out.println(i + "Vaishnavi");
			}
			else {
				System.out.println(i);
			}
		}
		
	
	}

}