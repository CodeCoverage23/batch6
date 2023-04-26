package com.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			String s = null;
			s.length();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("******");

	}
}
