package com.basic;

public class DemoReturnType {

	public static void main(String[] args) {
		System.out.println(Math.min(78, 87));

		DemoReturnType d = new DemoReturnType();

		int sum = d.sum(45, 44);

		System.out.println(sum);

		Animal instance = d.getInstance();
		System.out.println(instance);
	}

	public long calculation() {

		return 15456225;
	}

	public Animal getInstance() {

		return new Animal();

	}

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

}
