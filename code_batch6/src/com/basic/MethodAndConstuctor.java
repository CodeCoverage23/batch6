package com.basic;

public class MethodAndConstuctor {
	int count;

	public MethodAndConstuctor(int count) {
		this.count = count;
	}

	public void demoMethod() {
		System.out.println("demo method called...");
		System.out.println(count);
	}

	public static void main(String[] args) {
		MethodAndConstuctor m = new MethodAndConstuctor(10000);
		m.demoMethod();
	}
}
