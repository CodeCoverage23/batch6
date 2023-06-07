package com.oops;

//simple inheritance 
class Birds {
	int leg = 2;

	void fly() {
		System.out.println("i am flying ");
	}

}

class Parrot extends Birds {
	int feather = 2;

	void WhatcolorIAm() {
		System.out.println("the color is green");
	}
}

public class Test {

	public static void main(String[] args) {
		Parrot p = new Parrot();
		System.out.println(p.feather);
		System.out.println(p.leg);
		p.fly();
		p.WhatcolorIAm();

	}

}
