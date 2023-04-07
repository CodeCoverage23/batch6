 package com.demo;

 public class DemoReturnType {

	public int demo(int x , int y) {
		int z = x+y;
		return z;
		
	}
	
	public static void main(String[] args) {
		
		DemoReturnType d = new DemoReturnType();
		
		int add= d.demo(20, 40);
		System.out.println(add);
	}
}
