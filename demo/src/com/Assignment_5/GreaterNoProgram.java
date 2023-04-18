//WAP to check whether the no is greater than 100

package com.Assignment_5;

import java.util.Scanner;

public class GreaterNoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
