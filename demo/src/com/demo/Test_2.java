//Hierarchical Inheristance

package com.demo;

class Vehicle{
	void WhoAmI() {
		System.out.println("I am a vehicle");
	}
}
class Bike extends Vehicle{
	void TypeOfVehicle() {
		System.out.println("It is a two wheeler");
	}
}
class Van extends Vehicle{
	void TypeOfVehicle() {
		System.out.println("It is a four wheeler");
	}
}

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bike b = new Bike();
      b.TypeOfVehicle();
      b.WhoAmI();
      
      Van v = new Van();
      v.TypeOfVehicle();
      v.WhoAmI();
	}

}
