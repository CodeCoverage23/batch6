package com.basic;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		System.out.println("Enter Marks of 5 Subject :");
		long subject1 = a.nextLong();
		long subject2 = a.nextLong();
		long subject3 = a.nextLong();
		long subject4 = a.nextLong();
		long subject5 = a.nextLong();
	long total  = subject1 + subject2 + subject3 + subject4 + subject5 ;
	double average = total / 5;
	System.out.println( " TOTAL= " +total);
	System.out.println("AVERAGE= "+average);
		
	}
}
