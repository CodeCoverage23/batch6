package com.demo;
 import java.util.*;
public class Fibonacci {
	          
	public static void main(String[] args) {
		int n1=0,n2=1,n3,i;
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(i=1;i<number;++i) {
			
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}
