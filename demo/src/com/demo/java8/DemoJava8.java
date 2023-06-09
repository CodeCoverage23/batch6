package com.demo.java8;
@FunctionalInterface
interface SquareEx1{	
	// abstract method
	public void squareIt(int n);
	//static method
	static void add(int a, int b) {
	System.out.println("addition of two number is "+(a+b));	
	}
	// default method
	default void sub(int a,int b) {
		System.out.println("substraction of two number is "+(a-b));
	}
}
public class DemoJava8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SquareEx1 s1 =n->System.out.println("square of a "+n+" is "+n*n);
    			s1.squareIt(30);
    			SquareEx1.add(20,30);
    			s1.sub(60, 25);
    		}
	}
	  

