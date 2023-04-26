package com.oops;

import java.util.ArrayList;
import java.util.Collection;

class EDemo {
	private int number;
	private String name;

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
}

public class EncapsulationDemo {
	
	

	public static void main(String[] args) {

		EDemo e = new EDemo();

		System.out.println(e.getName());
		System.out.println(e.getNumber());
	}

}
