package com.Oops;

abstract class vehical3{
	String bikecolor="yellow";
	
	public vehical3() {
		System.out.println("vehical ");
	}
	abstract void run();
	public void displayspeed() {
		System.out.println("Maximum");
	}
}

class yahma extends vehical3 {

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("bike is running");
	}
	void display() {
		System.out.println(super.bikecolor);
	}
}
class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
yahma y = new yahma();
y.run();
y.display();
y.displayspeed();

	}

}





