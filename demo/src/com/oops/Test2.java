package com.oops;
//Multiple Inheritance
class vehical{
	void bike() {
		System.out.println("Avenger");
		
		
	}
}
class Car extends vehical{
	void Tata() {
		System.out.println("New car Tata Neu");
	}
}
class Person extends vehical{
	
		void IndigoPlane() {
			System.out.println("Ready to fly");
		}
	}
	



public class Test2 {

	public static void main(String[] args) {
		Person p=new Person();
		p.bike();
		p.IndigoPlane();
		
		Car c=new Car();
		c.Tata();
	}

}
