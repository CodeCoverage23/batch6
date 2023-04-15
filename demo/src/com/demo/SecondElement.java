package com.demo;

import java.util.Arrays;

public class SecondElement {

	public static void main(String[] args) {
		int a[]= {27,81,186,33,157,96,170,66};
		int c;
		int length = a.length;
		for(int i = 0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.println("decending order :");
		System.out.println(Arrays.toString(a));
		for(int i = a.length-1; i>=0; i--) {	
		}
		System.out.print("Second Large Element : " + a[length-2]);	
	
	}
}
