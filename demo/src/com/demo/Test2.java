package com.demo;
// hierarchical Inherritance
class Vehicle{
	void whoAmI() {
		System.out.println("i am a vehicle");
	}
	
}
class Bike extends Vehicle{
	
	void typeOfVehicle() {
		System.out.println("it is two wheeler");
	}
}
class Van extends Vehicle{
	void typeOfVehicle() {
		System.out.println("it is a four wheeler");
	}
	
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Van v=new Van();
		v.typeOfVehicle();
		v.whoAmI();
	
		Bike b=new Bike();
		b.typeOfVehicle();
		b.whoAmI();
		
		
	}

}
