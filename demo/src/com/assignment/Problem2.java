package com.assignment;

import java.util.Scanner;

public class Problem2 {
	
	private void marks() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks of five subject: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		int total=a+b+c+d+e;
		double average=total/5;
		System.out.println("The total marks of subject is : "+total);
		System.out.println("The average marks of sub is: "+average);
		
	}
	public static void main(String[] args) {
		Problem2 p =new Problem2();
		p.marks();
		
	}

}
