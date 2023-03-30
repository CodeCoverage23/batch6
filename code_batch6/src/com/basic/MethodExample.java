package com.basic;

public class MethodExample {
	public int FactorialNumber() {
		int fact=1;
		int number=6;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
	return fact;
	}
	
		
	public static void main(String[] args) {
           MethodExample ak=new MethodExample();
			int result =ak.FactorialNumber();
			System.out.println("facrorial=" +result);
		}
		// TODO Auto-generated method stub

	}


