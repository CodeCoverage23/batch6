package com.oops;

class Sport {
	public void diplay() {
		System.out.println("sport");
	}
}

class Cricket extends Sport {
	public void display() {
		System.out.println("Cricket");
	}
}

class Foodball extends Sport {
	public void display() {
		System.out.println("foodball");
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// upcasting
	Sport Cricket = new Cricket();// assign the parent class
		Cricket.diplay();
		Sport Foodball  = new Foodball();
		Foodball.diplay();
//printing objects 
//Sport sport = new Sport();
//sport.diplay();
	}

}
