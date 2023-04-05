package com.basic;

public class DemoStaticMethod2 {

	static int cube(int x) {
		int a = x * x * x;
		return a;
	}

	public static void main(String args[]) {
		int result = DemoStaticMethod2.cube(5);
		System.out.println(result);
	}

}
