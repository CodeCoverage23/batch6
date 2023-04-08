package com.demo;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,add,sub,multi,div;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Two Number: ");
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Enter The value of ch: ");
		
		int ch=sc.nextInt();
		if (ch==1) {
             add=a+b;
			System.out.println(add);
		}
		else if(ch==2) {
	         sub=a-b;
	         System.out.println(sub);
		}
	         else if(ch==3) {
		         multi=a*b;
		         System.out.println(multi);
	         }
	         else if(ch==4) {
		         div=a/b;
		         System.out.println(div);
	         }
	         else
	         {
	        	 System.out.println("invalid function");
	         }

	}

}
