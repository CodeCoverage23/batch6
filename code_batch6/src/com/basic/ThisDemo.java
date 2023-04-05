package com.basic;

public class ThisDemo {

	// This is current class
	// Variable, Methods, Constructor

	int a = 10;

	public void display() {

		System.out.println(this.a);
	}
	
	public void display1() {
		
		this.display();
	}

	public static void main(String[] args) {
		
		ThisDemo t = new ThisDemo();
		t.display();
		
	}

}