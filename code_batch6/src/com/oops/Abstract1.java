package com.oops;

abstract class Vehical {
	String Bikecolor = "Yellow";

	public Vehical() {
		System.out.println("Vehical");
	}

	abstract void run();

	public void displaySpeed() {
		System.out.println("maximum");
	}
}

class Yamaha extends Vehical {

	@Override
	void run() {
		System.out.println("bike is running");
		// TODO Auto-generated method stub

	}

	void display() {
		System.out.println(super.Bikecolor);
	}
}

public class Abstract1 {
	public static void main(String[] args) {
		Yamaha y = new Yamaha();
		y.displaySpeed();
		y.run();
		y.display();
	}

}
