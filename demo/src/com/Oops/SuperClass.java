package com.Oops;

class Parent{
	public void marry() {
		System.out.println("Shantabai");
	}
}

class Child extends Parent{
	@Override
	
	public void marry() {
		System.out.println("Katrina");
	}
}

public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c = new Child();
c.marry();

//System.out.println();
	}

}
