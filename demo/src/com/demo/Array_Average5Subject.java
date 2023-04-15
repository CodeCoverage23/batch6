package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Average5Subject {
		public static void main(String[] args) {
			double A[] = new double[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a five numbers :");
			
			double sum = 0;
			double average = 0;
			double percentage;
			for(int i = 0 ; i<A.length ; i++) {
				A[i]=sc.nextDouble();
			}
			System.out.println(Arrays.toString(A));
				
			for(int i =0;i<A.length;i++)
				sum = sum +A[i];
			System.out.println("The total marks of five subject : "+sum);
			
			average = sum/5;
			System.out.println("The average of five subject : " + average);
			
//			percentage = (sum*100)/500;
//			System.out.println("Your percentage is : " + percentage+"%");
		}
}
