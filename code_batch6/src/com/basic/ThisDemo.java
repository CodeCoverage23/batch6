package com.basic;

public class ThisDemo {

	// This is current class
	// Variable, Methods, Constructor

	int a = 10;

	public ThisDemo(int a) {
		this.a = a;
	}

	public ThisDemo() {
		this(10);
	}

	public void display() {

		
		System.out.println(this.a);
	}

	public void display1() {
		this.display();
	}

	public static void main(String[] args) {

		ThisDemo t = new ThisDemo(12);
		t.display();
		

	}

	public ThisDemo getInstance() {

		return this;
	}

}