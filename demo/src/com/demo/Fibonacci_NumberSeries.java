package com.demo;

public class Fibonacci_NumberSeries {
	static int n1=0,n2=1;
	public static void fibo(int count) {
		if(count!=0) { 
		int n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		fibo(count-1);
		
	}}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   int count=10;
			System.out.print(n1+" "+n2);
			fibo(count-2);
		
			
			
		}
}
