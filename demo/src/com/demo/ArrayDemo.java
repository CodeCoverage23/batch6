package com.demo;

// program : java program for traversing an array

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={60,82,45,98,73,56,86,49};
//		System.out.println(array);
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0) {
			System.out.print(array[i]+",");
			}
		}
	}

}
