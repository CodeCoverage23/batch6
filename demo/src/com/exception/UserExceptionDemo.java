package com.exception;

//for Shadi.com age limit

class YoungException extends RuntimeException{
	YoungException(String message){
		super(message);
	}
}
class OldException extends RuntimeException{
	OldException(String message){
		super(message);
	}
}

public class UserExceptionDemo {
	public static void main(String[] args) {
		int age=26;
		if (age<18) {
			throw new YoungException("You are not able to login this website because you are under 18");
		}else if (age >= 60) {
			throw new OldException("You are not able to login this website because you are under 18");
		}else {
			System.out.println("Welcome to the Shadi.Com");
		}
	}
}
