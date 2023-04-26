package com.oops;

abstract class Student5 {

	abstract void exam();

	public void practical() {
		System.out.println("Completed");
	}
}

public class AbsractionDemo extends Student5 {

	@Override
	public void exam() {
		System.out.println("Passed");

	}

	public static void main(String[] args) {
		new AbsractionDemo().exam();
	}
	
	void practical1() {
		System.out.println("Completed");
	}

}
