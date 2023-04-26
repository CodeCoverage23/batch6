package com.exception;

public class FinallyDemo {

	public static void main(String[] args) {

		try {
			int d = 100 / 0;
			System.out.println(d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("I will Execute in any condition");
		}
		System.out.println("Rest of the code");
	}

}
