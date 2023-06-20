package com.basic;

public class Fibonacci {

		static int n1=0,n2=1;
		public static void fibser(int count) {
			if(count!=0) {
				
				int  n3=n1+n2;
				System.out.println(" "+n3);
				n1=n2;
				n2=n3;
				fibser(count-1);
				
			}

			
			}

		
	public static void main(String[] args) {
		
		int count =10;
	
		
		System.out.println(n1+ " "+n2);
	
	
	
		
	}
	
	
}
