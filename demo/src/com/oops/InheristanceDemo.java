package com.oops;

class Apple{
	public void fruit()
	{System.out.println("eateble");}
}

class Parrot extends Apple {
	void Bird()
	{System.out.println("Flying");}
}

class Mansi extends Parrot{
	void girl()
	{System.out.println("walking");}
}

public class InheristanceDemo {
	public static void main(String[] args) {
		Mansi m = new Mansi();
		m.girl();
		m.Bird();
		m.fruit();
	}
}
