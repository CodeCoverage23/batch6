package com.demo;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[]ars) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=num;i++) {
		int	c=a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
			
		}
	}

}
