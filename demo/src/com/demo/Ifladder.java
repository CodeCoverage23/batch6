package com.demo;

import java.util.Scanner;

public class Ifladder {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter age");
		int age =scanner.nextInt();
		
		if(age>=1 && age<=15) {
			System.out.println("child age");
		}
		else if (age>15 && age<=30){
			System.out.println("young age");
		}
		else if (age>30 && age<=40) {
			System.out.println("adult age");
		}
		else if (age>40 && age<=60) {
			System.out.println("middle age");
		}
		else if (age>60 && age<=80) {
			System.out.println("old age");
		}
		

	}

}
