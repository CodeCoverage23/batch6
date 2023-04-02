package com.demo;
 public class MethodExample2{
	 
	 public int Factorial(){
		 int fact=1;
		 int num=6;
		 
		 for( int i=1;i<=num;i++) {
			 fact=fact*i;
			 
		 }return fact;
	 }
 
 public static void main(String[] args) {
	 MethodExample2 Obj=new MethodExample2();//instance method
	 int f=Obj.Factorial();
	 System.out.println(f);
 }
	 
 }