package com.abstraction;

public class InterfaceForwrdMethods implements InterfaceKeyword ,InterfaceKeyword2 {

	@Override
	public void print() {
		System.out.println(" Hi , i am from InterfaceKeyword interface - i am a forwarded method"); // interface by default public hone ke vjh se idhr use kar skte hai
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am from Interface");
	}
	//we can implement 2 interface classes in one class
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am from 2 nd interface class");
	}
	
	public static void main(String[] args) {
		new InterfaceForwrdMethods().print();
		new InterfaceForwrdMethods().display();
		new InterfaceForwrdMethods().show();
	}

	

}
