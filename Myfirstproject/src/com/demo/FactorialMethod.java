package com.demo;

public class FactorialMethod {
	
	public long factorialNumber(long fact,int number) {
		for(int i=1;i<=number;i++) {
			
			fact=fact*i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		
		FactorialMethod obj= new FactorialMethod();	
		
		long result = obj.factorialNumber(1,4);
		long factorialNumber=obj.factorialNumber(1,6);
		
		System.out.println("Factorial= "+result);
		System.out.println("Factorial= "+factorialNumber);
		
		int min=Math.min(89, 100);
		
		System.out.println("min = "+min);
	}

}
