package com.java8;

@FunctionalInterface
interface Inter3 {

	int abstractMethod(String s);

}

public class LEDemo3 {

	public static void main(String[] args) {

		Inter3 i = a -> a.length();
		int l = i.abstractMethod("Code Coverage");
		System.out.println(l);// 12

	}
}
