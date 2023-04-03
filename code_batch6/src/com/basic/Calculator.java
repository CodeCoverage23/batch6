package com.basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("First Number");
		int a = sc.nextInt();
		System.out.println("Second Number");
		int b = sc.nextInt();
		Calculator(a,b);

	}

	public static void Calculator(int a, int b) {


		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;

		System.out.println("The Sum of  2 No. :" + sum);
		System.out.println("Sub of 2 No." + sub);
		System.out.println("MUltiplicaton Of 2No." + mul);
		System.out.println("Divsion Of 2 No," + div);
	  }

	}

