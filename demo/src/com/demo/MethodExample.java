package com.demo;

public class MethodExample {
	
	public int FactorialNumber() {
		int fact=1;
		int number=3;
		for(int i=1; i<=number; i++) {
			fact= fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		MethodExample obj = new MethodExample();
		int result = obj.FactorialNumber();
		System.out.println(result);

	}

}
