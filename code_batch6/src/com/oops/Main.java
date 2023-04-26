package com.oops;

class Sport {
	public void display() {
		System.out.println("Sport");
	}
}

class Cricket extends Sport {
	public void display() {
		System.out.println("Cricket");
	}
}

class Football extends Sport {
	public void display() {
		System.out.println("Football");
	}
}

/**
 * 
 * Upcasting and Downcasting
 *
 */
public class Main {

	public static void main(String[] args) {
		// Upcasting
		Sport cricket = new Cricket();
		cricket.display();

		Sport f = new Football();
		f.display();

		// Downcasting
		// Cricket sport = (Cricket) new Sport();
		// java.lang.ClassCastException

		Cricket sport = (Cricket) cricket;
		sport.display();

	}

}
