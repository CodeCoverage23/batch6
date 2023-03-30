package com.demo;

public class MethodExample {
     public long factorialNumber(long fact,int number) {
    	 
    	 for(int i=1;i<=number;i++) {
    	fact=fact*i; 
    	 }
    	 return fact;
     }
     
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		MethodExample obj = new MethodExample();
		  long result = obj.factorialNumber(1, 5);
		  long factorialNumber = obj.factorialNumber(1, 10);
		System.out.println("factorial="+result);
		System.out.println("factorial="+factorialNumber);
		int max = Math.max(89, 100);
		System.out.println("max "+max);
		
	}

}

// WAP to calculate add,sub,mul,div operation using method.input shoud
//user defined(console input)perform all the operation for same input.
//return the result into main method and print the result in the main method only.
