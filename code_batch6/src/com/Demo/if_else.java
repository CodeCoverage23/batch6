package com.Demo;
import java.util.Scanner;

public class ScannerNextInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter marks:");
		int marks=scan.nextInt();
		
		if(marks>=85 && marks<=100) {
			System.out.println("the studdents are topper");
		}
		else if(marks>=75 && marks<80) {
			System.out.println("the students are in distinction");
		}
		else if(marks>=60 && marks<75) {
			System.out.println("the student are in 1st class");
		}
		else if(marks>=35 && marks<60) {
			System.out.println("the students are passed");
		}
	 else if(marks<35) {
		System.out.println("students are fail");
	}

}
}
