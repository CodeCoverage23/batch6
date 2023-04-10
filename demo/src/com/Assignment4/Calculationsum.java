package com.Assignment4;

public class Calculationsum {
	public int Add() {
		int a=10,b=20;
		 
		int c=a+b;
		return c;
	}
	public int Subs() {
		int a=15,b=12;
		 int c1=a-b;
		 return c1;
	}
     public int mult() {
    	int  a=21,b=32;
    	 int c2=a*b;
    	 return c2;
     }
     public int Div() {
    	 int a=75,b=15;
    	 int c3=a/b;
    	 return c3;
    	 
     }
	public static void main(String[] args) {
		
           Calculationsum a=new Calculationsum();
               int c=a.Add();
               int c1=a.Subs();
               int c2=a.mult();
               int c3=a.Div();
               
               System.out.println("Addition of:"+c);
               System.out.println("Substraction of:"+c1);
               System.out.println("Multiplication of:"+c2);
               System.out.println("Division of :"+c3);
	}

}
