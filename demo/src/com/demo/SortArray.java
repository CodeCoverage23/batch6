package com.demo;

import java.util.Arrays;

// java program for sort an array using method and without using method
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 60, 82, 98, 45 };
		// using sort method
//		Arrays.sort(array);
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + ",");
//
//		}
//		System.out.println();
//
//		System.out.println(Arrays.toString(array));

		// without using sort method or with for loop
		int temp;
		System.out.println("array before sorting");
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}
		System.out.println("array after sorting in ascending order");
		System.out.println(Arrays.toString(array));
		System.out.println("array after sorting in descending order");
		for (int i = array.length-1; i >=0; i--) {
			System.out.print(array[i] + ",");

		}
	}
}


//1.wap for print second largest element from array
//input - 27,81,186,33,157,96,170,66
//output-170
//2.wap to print addition and avg  of five subject in array take input from console.


