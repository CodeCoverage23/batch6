//write a program to check number is positive or negative

package com.assignment5;
import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[]args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num= sc.nextInt();
		
		if (num>0)
		{
			System.out.println("The number is Positive");
		}
		else if (num<0)
		{
			System.out.println("The number is Negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}

}
