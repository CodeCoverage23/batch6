package com.oops;

class Wheels {
	void run() {
		System.out.println("i am a wheels of the car");
	}

}

class Car extends Wheels {
	void display() {
		super.run();
		System.out.println("i am a car");
	}

}

class Seat extends Car {
	void display() {
		super.display();
		System.out.println("i am a Seat");
		
	}

}

public class SuperKeyword {
	public static void main(String[] args) {
		Seat s = new Seat();
		s.display();
	}
}
