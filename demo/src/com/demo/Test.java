package com.demo;

//simple Inherritance
class Birds {
	int legs = 2;

	void fly() {
		System.out.println("i am flying");
	}
}

class Parrot extends Birds {
	int feather = 2;

	void whatColorAmI() {
		System.out.println("my color is green");
	}

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot p = new Parrot();
       System.out.println(p.legs);
       System.out.println(p.feather);
       p.fly();
       p.whatColorAmI();
	}

}
