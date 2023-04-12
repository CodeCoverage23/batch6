package com.assignment5;
import java.util.Scanner;
public class GreaterNum {
	public static void main(String[]args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		if(num>100)
		{
			System.out.println("Number is greater than 100");
		}
		else
		{
			System.out.println("Number is less than 100");
		}
	}

}
