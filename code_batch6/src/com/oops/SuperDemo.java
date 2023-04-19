package com.oops;

class SuperClass1 {

	int a;

	public SuperClass1() {
		System.out.println("Super class Contructor");
	}

	public void print() {
		System.out.println("Method from Super class");
		System.out.println("A : " + a);
	}
}

class SubClass1 extends SuperClass1 {
	public SubClass1() {
		super();
		System.out.println("Constructor From Sub Class");
	}

	@Override
	public void print() {
		super.a = 10;
		super.print();
		System.out.println("Method from sub class");
	}

}

public class SuperDemo {
	public static void main(String[] args) {
		SubClass1 s = new SubClass1();
		s.print();
	}

}
