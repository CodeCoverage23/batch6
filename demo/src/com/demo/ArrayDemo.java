package com.demo;

// it is a java program for traversing an array
public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int array[] = new int[] { 85, 29, 62, 59, 100, 18, 92, 13 ,6};

		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				System.out.println(array[i]);
			}
			
		}
	}
}
