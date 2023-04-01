package com.demo;

import java.util.Scanner;

public class Method {
		public static void main(String[] args) {
			Method a = new Method();
		a.arithmeticOperator();
			
			
		}	
		
		public int arithmeticOperator() {
	   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Two numbers: "); 
		int  a = sc.nextInt();
       int b = sc.nextInt();
        
        System.out.println("add is :"+(a+b));
        System.out.println("sub is :"+(a-b));
        System.out.println("mul is :"+(a*b));
        System.out.println("div is :"+(a/b));
        
        return a;
        
		
			
	}

}