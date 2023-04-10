package com.assignment;

public class Problem {
	private int  sum() {
		int  a=10;
		 int b=30;
		 return a+b ;
	}	 
	private int  sub() {
		int  a=10;
		 int b=30;
		 return a-b ;
	}	 	
	private int  mul() {
		int  a=10;
		 int b=30;
		 return a*b ;
	}	 	
	private int  div() {
		int  a=10;
		 int b=30;
		 return a/b ;
	}
	public static void main(String[] args) {
		Problem p = new Problem();
		int d=p.sum();
		System.out.println("addition is: "+d);
		int e=p.sub();
		System.out.println("substraction is: "+e);
		int f=p.mul();
		System.out.println("multiplication is: "+f);
		int g=p.div();
		System.out.println("division is: "+g);
	}
	
	
	
	
}		
	
	
		
		
	
		
	
		
			
			
		
			
		
	
	


