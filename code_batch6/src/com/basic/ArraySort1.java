package com.basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort1 {

	public static void main(String args[]) {
		int temp, length;
		int array[] = { 27, 81, 186, 33, 157, 96, 170, 66 };
		length = array.length;

		for (int i = 0; i <array.length; i++) {
			for (int j = i + 1; j < length; j++) {

				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("The second largest number is:: " + array[  6]);
	}
}