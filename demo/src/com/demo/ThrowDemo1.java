package com.demo;

public class ThrowDemo1 {

	public static void validate(int n){
		if(n<18) {
			
			throw new  ArithmeticException("person is not eligible to vote");
			
			
		}
		else {
			System.out.println("person is eligible to vote");
		}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);
		
		//handle with try catch:
//		try 
//      { validate(13);
//      }
//      catch(ArithmeticException e) {
//    	  System.out.println("arithmatic exception handled");
//    	  
//      }
		System.out.println("normal flow ");
		
		
	}

}
