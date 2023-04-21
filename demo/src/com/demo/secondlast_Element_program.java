//WAP for print second largest element from array
//input=27,81,186,33,157,96,170,66

package com.demo;

public class secondlast_Element_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
