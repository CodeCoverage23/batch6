package com.basic;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
	int array[]={60,82,45,98,73,56,86,49};
	for(int i=0;i<array.length;i++) {
		Arrays.sort(array);
		//if(array[i]%2==0);
		System.out.print(array[i]+",");
	}
//System.out.println(Arrays.toString(array));
	}

}
