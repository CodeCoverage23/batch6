//WAPto print 2nd largest element from array 
//input=27,81,186,33,157,96,170,66,.......output will be 170

package com.demo;

import java.util.Arrays;

public class HwSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {27,81,186,33,157,96,170,66};

int b=a.length;

Arrays.sort(a);
System.out.println("sorting array is: "+Arrays.toString(a));

System.out.println("The seconfd largst number is : "+a[b-2]);


	}

}
