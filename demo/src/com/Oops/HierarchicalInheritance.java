package com.Oops;

class Vehical{
	void whoIAM() {
		System.out.println("I am Vehical.");
	}
}
class Bike extends Vehical{
	void typeOfVehical() {
		System.out.println(" It is two wheeler");
	}
}

class Van extends Vehical{
	void typeOfVehical() {
		System.out.println(" It is four wheeler");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Van v = new Van();
    v.whoIAM();
    v.typeOfVehical();
    
    Bike b = new Bike();
    b.typeOfVehical();
    b.whoIAM();
     
	}

}
