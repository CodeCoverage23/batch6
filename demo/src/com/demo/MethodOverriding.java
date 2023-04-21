package com.demo;
class Animal{
	void display() {
		System.out.println("animal");
	}
}
class Dog extends Animal{
	@Override
	void display() {
		System.out.println("dog");
	}
}
class Cat extends Dog{
	@Override
	void display() {
		System.out.println("cat");
	}
	
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Dog d = new Dog();
 d.display();
//	Animal animal = new Animal();
//	animal.display();
//Cat cat = new Cat();
//cat.display();
		
	}

}
