
//Que5.WAP to calculate total five subject marks and average of it.

package com.Assignment4;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of Marathi :");
		double a=sc.nextInt();
		System.out.println("Enter the marks of Hindi :");
		double b=sc.nextInt();
		System.out.println("Enter the marks of English :");
		double c=sc.nextInt();
		System.out.println("Enter the marks of Math :");
		double d=sc.nextInt();
		System.out.println("Enter the marks of Sanskrit :");
		double e=sc.nextInt();
		System.out.println("Enter the marks of Sanskrit :");
		
		double A=a+b+c+d+e;
		System.out.println("Total Marks"+A);
		
		double B=A/5;
		System.out.println("Average of all the subject  "+B);
	}

}
