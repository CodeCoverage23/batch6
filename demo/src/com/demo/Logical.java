package com.demo;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=15;
		int c=20;
		
		//System.out.println(a++<b || b++>c);//logical and  false + true=false
		//System.out.println(b);
		
		System.out.println(a>b & b>c);//bitwise
		
		System.out.println(a>b? a:b);//ternary operator

	}

}
