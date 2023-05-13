package com.exception;

class YoungException extends RuntimeException {

	YoungException(String message) {
		super(message);
	}
}

class OldException extends RuntimeException {

	public OldException(String message) {
		super(message);
	}

}

public class UserDefineException {

	public static void main(String[] args) {
		int age = 12;
		if (age < 18) {
			throw new YoungException("You are young please wait for some time");
		} else if (age > 60) {
			throw new OldException("No chance to get married");
		} else {
			System.out.println("Welcome to application");
		}
	}

}
