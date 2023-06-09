package com.demo;
class Calculator{

	public double add(int a,int b) {
		double c=a+b;
		return c;
		
	}
	
	public double add( int a,double b){
		
		
		return a+b;
	}
	
	
	
	
}





public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator();
		double add = calculator.add(10, 25.6f);
		double add2 = calculator.add(10,20.5f);
		System.out.println(" two parameter addition "+add);
		System.out.println(" three parameter addition "+add2);

	}

}
