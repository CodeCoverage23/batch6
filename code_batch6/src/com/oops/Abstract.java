package com.oops;

abstract class Shape {
	abstract void draw();

	void disply() {
		System.out.println("Shape class");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println(" draw circle");
		// TODO Auto-generated method stub

	}

	void displayCircle() {
		System.out.println(" circle");
	}

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing Rectangle");
		// TODO Auto-generated method stub

	}

	void display() {
		System.out.println("Rectangle class");
	}
}

public class Abstract {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.displayCircle();
		c.disply();
		c.draw();
		Rectangle r = new Rectangle();
		r.display();
		r.draw();
		r.disply();
	}

}
