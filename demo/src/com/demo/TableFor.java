package com.demo;

public class TableFor {

	public static void main(String[] args) {
		int n=100;
		for (int i=1 ; i<=10 ; i++ ) {
			for (int j=1 ; j<=10 ; j++ ) {
			n=i*j;
			if (n%5==0 )
			{ 
				System.out.println(" Mohan  ");
			}
			else if (n%7==0 ) {
				System.out.println(" Bhise ");
				
			} else if (n==35 )
			{
				System.out.println(" Mohan ");
				
			}
			System.out.print(" "+n);
			 
			}
			System.out.println();
		}
			
	}
}
