package com.assignment5;
import java.util.Scanner;

public class SquareOfNum {
	public static void main(String[]args) {
		int num,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		 
		a= num*num;
		System.out.println("The square of num is " +a);
	}
}
