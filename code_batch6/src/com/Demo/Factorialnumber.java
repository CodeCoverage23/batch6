package com.Demo;


public class Factorialnumber {
	
	public int Factorialnumber() {
		int fact=1;
		int number=10;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[]args) {
	Factorialnumber ts=new Factorialnumber();
	int result=ts.Factorialnumber();
	System.out.println("Factorial number is="+ result);
	}
	
}
