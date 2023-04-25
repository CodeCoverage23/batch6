package com.Oops;

abstract class Shape1{
	abstract void draw();
	void display() {
		System.out.println("shape class");
	}
}

class Circle1 extends Shape1{

	@Override
	void draw() {
		System.out.println("Drawing Circle");
		
	}
	void displayCircle() {
		System.out.println("circle");
	}
}


class Rectangle extends Shape1{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing rectangle");
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle1 c = new Circle1();
c.display();
c.displayCircle();
c.draw();

Rectangle r = new Rectangle();
r.display();
r.draw();
	}

}
