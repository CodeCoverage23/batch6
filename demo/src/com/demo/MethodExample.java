package com.demo;

public class MethodExample {

	 public long factorialNumber(){
		 long fact = 1;
		 int number = 5;
		 for (int i=1;i<=number;i++) {
			 fact=fact*i;
		 }
		 return fact;
	}
       public static void main(String[] args) {
    	   MethodExample obj = new MethodExample();
    	   long result = obj.factorialNumber();
    	   System.out.println("factorial="+result);
       }
    }
