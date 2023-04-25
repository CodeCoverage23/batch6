package com.demo;
abstract class Vehicle2{
	String bikecolor="yellow";
public Vehicle2() {
	System.out.println("vehicle");
	
}

abstract void run();
public void displaySpeed() {
	System.out.println("maximum");
}}
class Yamaha extends Vehicle2{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("bike is running");
	}
	
	void display() {
		System.out.println(super.bikecolor);
		
		
	}
	
}



public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Yamaha y=new Yamaha();
		y.display();
		y.displaySpeed();
		y.run();
		
		
	}

}
