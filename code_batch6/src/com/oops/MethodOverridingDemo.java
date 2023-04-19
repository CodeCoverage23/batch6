package com.oops;

class SuperClass {

	public void marry() {
		System.out.println("Shantabai");
	}
}

class SubClass extends SuperClass {

	@Override
	public void marry() {
		System.out.println("Karina");
	}

}

public class MethodOverridingDemo {

	public static void main(String[] args) {

		SubClass s = new SubClass();
		s.marry();

	}

}
