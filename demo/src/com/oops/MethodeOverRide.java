package com.oops;

class Parent {
	void print() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	@Override
	void print() {
		System.out.println("Child");
	}
}

public class MethodeOverRide {

	public static void main(String[] args) {

		Child c = new Child();
		c.print();
		Parent p = new Parent();
		p.print();
	}
}
