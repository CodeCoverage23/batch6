package com.demo;

import java.util.Arrays;

public class ArraySorted {
	public static void main(String[] args) {
		int array[] = new int[] { 85, 29, 62, 59, 100, 18, 92, 13, 6 };
		// using by sort method
//		Arrays.sort(array);
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]); // for ascending order
//		}
//
//		System.out.println(Arrays.toString(array)); // ye ek array ka format dene ke liye to string use kiya h
		// -----------------------------------------------------------------------------------------------------------
		System.out.println("Before sorting"+Arrays.toString(array)); 
		// without using sort method ... using for loop
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) { //ascending ke liye greaterthan
				if (array[i] > array[j]) { //decending ke liye lessthan sign krna pdega
					// condition true rhi to hi vo swaping krega otherwise nahi
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.print("After sorting ");
		for(int i = 0; i < array.length; i++) { //this is for ascending order
			System.out.print( array[i] + ",");
		}
		
	}
}
