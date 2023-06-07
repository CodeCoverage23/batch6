package com.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
        int x,a=0,b=1,c;
		System.out.println("Enter a Number: ");
		Scanner ak = new Scanner(System.in);
		x = ak.nextInt();

		for(int i=1;i<=x;i++) {

			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

	}


