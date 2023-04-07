package com.demo;

public class LocalInstanceVariable {

	int age = 22;
	public static void main(String[] args) {
		String name = "manvi";
		
		LocalInstanceVariable locint = new LocalInstanceVariable();
		
		System.out.println(locint.age);
		
		System.out.println(name);
	}

}
