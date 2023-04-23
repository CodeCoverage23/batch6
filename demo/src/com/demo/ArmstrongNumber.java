package com.demo;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check armstrong number");
		int num = sc.nextInt();
		int digit = 0;
		int temp = num;
		//digit count operation
		while(temp>0) {
			temp = temp/10;
			digit++;
		}
		int lastdigit = num;
		int sum = 0;
		//armstrong no calculate
		while (lastdigit>0) {
			int lastno = lastdigit%10;
			sum += Math.pow(lastno, digit);
			lastdigit = lastdigit/10;
		}
		if(sum==num) {
			System.out.println("- is armstrong number");
		}
		else
			System.out.println("- is not armstrong number");
	}

}
