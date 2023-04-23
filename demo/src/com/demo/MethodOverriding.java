package com.demo;

class Fruit {
	void sweet() {
		System.out.println("Fruit");
	}
}
class Watermelon extends Fruit {
	void sweet() {
		System.out.println("Watermelon is a Fruit");
	}
}
class apple {
	void sweet() {
		System.out.println("Apple is a Fruit");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Watermelon w = new Watermelon();
		w.sweet();
		Fruit f = new Fruit();
		f.sweet();
		apple a = new apple();
		a.sweet();
	}
}
