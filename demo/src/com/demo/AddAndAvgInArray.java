package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class AddAndAvgInArray {

	public static void main(String[] args) {
		int numbers = 5; 
		int total=0;
		int avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject Marks :");
		int a[] = new int[5];
		
		for(int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		 for(int i=0; i<a.length; i++) {
			total=total+a[i];
		}
		System.out.println("total of Marks : " + total);
		 avg = total/5;
		System.out.println("Average of Marks : " + avg);	
	}
}
		
	
	