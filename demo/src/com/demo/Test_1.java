//Multiple Inheristance

package com.demo;

class Birds{
	void flying() {
		System.out.println("Birds are flying");
	}
}
class Sparrow extends Birds{
void hanging (){
	System.out.println("I am hang on tree branch");
}
}
class SingingSparrow extends Sparrow{
	void WhatCanISinging() {
	System.out.println("I can sing an opera");	
	}
	}

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingingSparrow s = new SingingSparrow();
		s.flying();
		s.hanging();
		s.WhatCanISinging();

	}

}
