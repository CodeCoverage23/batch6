package com.demo;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		int n,sum=0,r;//reminder
		int temp;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println("it is palindrome");
			
		}else {
			System.out.println("it is not palindrome");
		}
		
		}
		
		
	}
	
