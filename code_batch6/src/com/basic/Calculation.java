package com.basic;

public class Calculation {
	
	private double add () {
		double a = 30;
		double b = 10;
		return a+b;
	}
		private double sub () {
		double a = 30;
		double b = 10;
		return a-b;
	}
	private double Mul () {
		double a = 30;
		double b = 10;
		return a*b;
	}
	private double Div () {
		double a = 30;
		double b = 10;
		return a/b;
	}

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		double z=cal.add();
		System.out.println("Addition :" +z);
		double y=cal.sub();
		System.out.println("Subtraction :" +y);
		double x=cal.Mul();
		System.out.println("Product :" +x);
		double w=cal.Div();
		System.out.println("Division :" +w);
				
		

	}

}
