package com.basicAssignment4;
import java.util.Scanner;
public class CalculatedAverage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks for five subjects:");
		int Chemistry = sc.nextInt();
		int Mathematics = sc.nextInt();
		int English = sc.nextInt();
		int Marathi = sc.nextInt();
		int Biology = sc.nextInt();
		int total = Chemistry + Mathematics + English + Marathi + Biology;
		float average = total / 5;
	
		
		System.out.println("Total marks = " + total);
		System.out.println("Average marks = " + average);

	}
}


