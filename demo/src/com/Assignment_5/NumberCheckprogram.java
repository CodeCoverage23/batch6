//wap to check whether the number is even or odd

package com.Assignment_5;

import java.util.Scanner;

public class NumberCheckprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();

		if(num%2==0) {
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}

}
