package com.oops;

public class FinalKeyword {

	final float pi = 3.14f;

	private void method() {
		
//		pi = 839.3f;  //compile time error occured due to final keyword
	}

	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		f.method();

	}
}
