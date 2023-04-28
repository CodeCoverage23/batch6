package com.oops;

interface Hotel {
	void diplay();

}

interface Room {
	void diplay();
}

class Recliner implements Hotel, Room {

	@Override
	public void diplay() {
		// TODO Auto-generated method stub
		System.out.println("My Hotel");
	}

}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Room c = new Chair();//upcasting
		Hotel c = new Recliner();
		c.diplay();

	}

}
