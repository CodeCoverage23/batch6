package com.demo;

import java.util.Scanner;

public class CalculaterProgram {
	
	public int Calculation() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of a :");
		int a = s.nextInt();
		
		System.out.println("Enter a value of b :");
		int b = s.nextInt();
		int add = a+b;
		int sub =a-b;
		int mul =a*b;
		float div =a/b;
		
		System.out.println("Addition is:" +add);
		System.out.println("Substraction is" +sub);
		System.out.println("Multilpicatin is" +mul);
		System.out.println("Division is" +div);
		
		return b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculaterProgram m = new CalculaterProgram();
		int d = m. Calculation();
	
		

	}

}
