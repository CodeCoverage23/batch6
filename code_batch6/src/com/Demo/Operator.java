package com.Demo;

public class operator {

	public static void main (String[]args) {
		 int a=10;
		 int b=10;
		 int c=10;
		 
		 //Arithmetic
		 System.out.println(a+b);
		 System.out.println(a-b);
		 System.out.println(a*b);
		 System.out.println(a/b);
		 System.out.println(a%b);
		 
		 //Relational
		 System.out.println(a==b);
		 System.out.println(a!=b);
		 System.out.println(a<b);
		 System.out.println(a>b);
		 System.out.println(a<=b);
		 System.out.println(a>=b);
		 
		 //unary
		 System.out.println(a++);
		 System.out.println(a--);
		 System.out.println(--a);//-1
		 System.out.println(++a);
		 
		 //ternary
		 System.out.println(a>b?a:b);
		 
		 //logical
		 System.out.println((a>=b)&&(a<=b));
		 System.out.println((a>b)||(a<b));
		 
		 // Assignment
		 System.out.println(a+=10);//a=a+10
		 System.out.println(a-=10);//a=a-10
		 System.out.println(a*=10);//a=a*10
		 System.out.println(a/=10);//a/10
		 
		 //Contamination
		 System.out.println(a++ + --a);
		 
		 
		}
		

	}

