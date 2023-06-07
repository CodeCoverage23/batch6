package com.oops;

class Vehicle21 {
	int Speedlimit = 90;

	void run() {
		System.out.println("vehicle is running");
	}

}

class Bike3 extends Vehicle21 {
	void run() {
		System.out.println("bike is running");
	}

	void display() {
		run();
		super.run();
		System.out.println("bike speedlimit is " + super.Speedlimit);

	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike3 bike = new Bike3();
		bike.display();

	}

}
