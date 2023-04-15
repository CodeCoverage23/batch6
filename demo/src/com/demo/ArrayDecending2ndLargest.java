package com.demo;

import java.util.Arrays;



public class ArrayDecending2ndLargest {
	public static void main(String[] args) {

		int num[] = new int[] {55,95,85,25,45,35,75};
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			
//			System.out.print(num[i]+ ",");
			
			}
		System.out.println();
		System.out.println(Arrays.toString(num));
		System.out.println("Second Largest number is : "+num[1]);
		System.out.println("Second Smallest number is : "+num[num.length - 2]);
		
	}
}
