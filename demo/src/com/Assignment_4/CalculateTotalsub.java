//WAP to calculate total of five subject marks and average of it.

package com.Assignment_4;

import java.util.Scanner;

public class CalculateTotalsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total marks for five subject:");
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		int subject4 = sc.nextInt();
		int subject5 = sc.nextInt();
		
		int total = subject1 + subject2 + subject3 + subject4 + subject5;
		double average = total/5;
		System.out.println("Total marks =" + total);
        System.out.println("Average marks =" + average); 
	}

}
