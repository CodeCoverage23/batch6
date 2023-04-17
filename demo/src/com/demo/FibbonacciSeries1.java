package com.demo;
//wap to print fibbonacci series using method
public class FibbonacciSeries1 {
	static int n1=0,n2=1;
public static void fibser(int count) {
	 if(count!=0) {  
	int n3=n1+n2;
	System.out.print(" "+n3);
	n1=n2;
	n2=n3;
	fibser(count-1);
	
}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int count=10;
		System.out.print(n1+" "+n2);
		fibser(count-2);
		
		
		
	}

}
