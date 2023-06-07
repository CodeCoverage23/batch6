package com.oops;

class Animal {
	void diplay() {
		System.out.println("animal");
	}

}

class Dog extends Animal {
	@Override
	void diplay() {
		System.out.println(" dog");
	}
}

class Cat extends Animal {
	@Override
	void diplay() {
		System.out.println("cat");
	}
}

public class MethodOverreding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.diplay();
		// System.out.println(d.diplay());
		Cat c = new Cat();
		c.diplay();
		Animal animal = new Animal();
		animal.diplay();
	}

}
