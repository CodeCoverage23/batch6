package com.java;

public class MethodCreate {

	// without return type

	public void factorialNumber() {
		/*
		 * public=Access modifier , it present everywhere void= it is keyword,they does
		 * not return anything 
		 * factorialNumber=method name ()= parameters
		 * {}=blocks=method of body
		 */
		long fact = 1;
		int number = 5;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		/*
		 * create object for calling factorialNumber
		 *  method in main method
		 */
		MethodCreate object = new MethodCreate();
		object.factorialNumber();
	}

}
