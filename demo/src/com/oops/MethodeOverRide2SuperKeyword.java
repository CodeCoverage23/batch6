package com.oops;

//super keyword is use to call the immediate parent class.

class Tree {
	void display() {
		System.out.println("Tree");
	}
}

class Apple1 extends Tree {
	String s = "string";
	int a = 100;

	void display() {
		System.out.println("Apple");
	}
}

class Leaf extends Apple1 {
	void display() {
		System.out.println("Leaf");
		super.display();
		System.out.println(super.a);
		System.out.println(super.s);

	}
}

public class MethodeOverRide2SuperKeyword {
	public static void main(String[] args) {
		Leaf l = new Leaf();
		l.display();
	}
}
