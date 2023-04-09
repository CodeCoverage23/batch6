package com.Assignment4;

public class ArithmeticOperator {
	
	private int sum() {
		
		int a=10,b = 40;
		return a+b;
	}
	private int sub() {
		
		int a=25, b=15;
		return a-b;
		
	}
	private int mul() {
		
		int a= 10,b=25;
		return a*b;
		
	}
	private int div() {
		
		int a=45,b=15;
		return a/b;
	}
	
public static void main(String[] args) {
	
	ArithmeticOperator a = new ArithmeticOperator();
	int d = a.sum();
	System.out.println("Addition is : "+d);
	
	int e = a.sub();
	System.out.println("substraction is : "+e);
	
	int s = a.mul();
	System.out.println("multiplication is : "+s);
	
	int p = a.div();
	System.out.println("division is : "+p);
}
		
		

}

