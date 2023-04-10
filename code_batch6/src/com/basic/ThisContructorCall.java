package com.basic;

public class ThisContructorCall {

	int number;
	String name;

	String s = "I get called after para constructor";

	String l = "";

	ThisContructorCall() {
//		this(101, "Java");
		System.out.println("I get called after para constructor");
	}

	public ThisContructorCall(int number, String name) {
		this.number = number;
		this.name = name;

		System.out.println(this.name + "    " + this.number);
	}

	public static void main(String[] args) {

		ThisContructorCall t = new ThisContructorCall();

	}

}
