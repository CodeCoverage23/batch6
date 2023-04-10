package com.assingment4;

public class Methods {

	private double addition(double a, double b) {
		return a + b;
	}

	private double substraction(double c, double d) {
		return c - d;
	}

	private double multiplication(double o, double p) {
		return o * p;
	}

	private double division(double x, double y) {
		return x / y;
	}

	public static void main(String[] args) {
		Methods m = new Methods();
		System.out.println("Addition " + m.addition(15, 25));
		System.out.println("substraction " + m.substraction(150, 325));
		System.out.println("multiplication " +m.multiplication(12.5, 10));
		System.out.println("division " +m.division(10,3));
	}
}
