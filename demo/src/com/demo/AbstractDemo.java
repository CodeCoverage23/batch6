package com.demo;
abstract class Shape{
	abstract void draw();
	void display() {
		System.out.println("shape class");
	}
}
class Circle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing circle");
	}
	void displaycircle() {
		System.out.println("circle");
		
	}
	
}
class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
	}

	
	
}







public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle();
		c.display();
		c.displaycircle();
		c.draw();
		Rectangle r=new Rectangle();
		r.draw();
		r.display();
		
		
	}

}
