package com.assignment5;

import java.util.*;

public class Max_number {
	
	public static void main(String[] args) {
		
		int a ,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		a= sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c) {
		System.out.println("greter number is a");
	    }
		else if(b>a&&b>c) {
			System.out.println("greter number is b");
		}
		else if(c>a&&c>b)
		{
			System.out.println("greter number is c");
		}
}
}