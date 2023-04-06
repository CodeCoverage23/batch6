package com.demo;

public class StaticMethod {
 public static int m1(int a) {
	 
	 a+=10;
	 return a;
	 
 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StaticMethod method = new StaticMethod();
		int b = StaticMethod.m1(46);
		System.out.println(b);
	}

}
