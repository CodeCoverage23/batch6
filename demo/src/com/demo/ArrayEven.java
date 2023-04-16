package com.demo;

public class ArrayEven {
	private static void  even() {
		int b = 0;
		int  a[]= {15,20,25,30,35,40};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			System.out.println("the even no. is: "+a[i]);}
		}
		
	}
	public static void main(String[] args) {
		
		even();
	}

}
