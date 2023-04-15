package com.demo;

import java.util.Scanner;
/*fibonacci series means upper two value's sum =  third value . it always start from 0& 1.
ex: 0,1=1 : then second no. 1,1=2 :  1,2=3 */

public class Fibonacci_Number_Series {
	public static void main(String[] args) {
		 // this example is for no. of terms how much we want.
		
		int a=0;
		int b=1;
		int c=0;
		int count=10;
		
		System.out.println(a);  //i should be start from 2 bcz 0 &1 already we print here
		System.out.println(b);
		for(int i=2;i<count;i++) { 
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
					
		}
		
		
//----------------------------------------------------------------------------------
		
		//this example is for print value to the user value 
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a value :");
		int n = sc.nextInt();
		
		int x=0;			//
		int y=1;
		int z=0;
		
		while(z<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
			
		}
			
	}
}
