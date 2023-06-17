package com.demo.java8;

interface Cons {

	public Bike Display();

}

public class DemoContructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons c = Bike::new;
		c.Display();

	}
}
