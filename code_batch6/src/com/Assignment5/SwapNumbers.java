package com.Assignment5;

import java.util.Scanner;

public class SwapNumbers {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.println("Before swapping: number1 = " + num1 + ", number2 = " + num2);

	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        System.out.println("After swapping: number1 = " + num1 + ", number2 = " + num2);
	    }


}