package com.basic;

public class DemoConstructor {

	int number;
	String name;

	public DemoConstructor(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public DemoConstructor() {
		System.out.println("This is default constructor");
	}

	public static void main(String[] args) {

		DemoConstructor d = new DemoConstructor(101, "Java");
		DemoConstructor d1 = new DemoConstructor();

		System.out.println(d.number);
		System.out.println(d.name);
		System.out.println();

	}

}
