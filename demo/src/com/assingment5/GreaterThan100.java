package com.assingment5;

//6. Write the program to check whether the no is greater than 100.
import java.util.Scanner;

public class GreaterThan100 {
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();

		if (n < 100) {
			System.out.println("The Number is less than 100");
		} else if (n==100){
			System.out.println("The Number is equal to 100");
		}else {
			System.out.println("The Number is greater than 100");
		}
	}
}
