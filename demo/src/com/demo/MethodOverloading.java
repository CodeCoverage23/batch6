package com.demo;
class Calculator{

	public double add(int a,float b) {
		double c=a+b;
		return c;
		
	}
	
	public double add( float a,int b){
		
		
		return a+b;
	}
	
	
	
	
}





public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator();
		double add = calculator.add(20, 20.3f);
		double add2 = calculator.add(20.1f,20);
		System.out.println(" two parameter addition "+add);
		System.out.println(" three parameter addition "+add2);

	}

}
