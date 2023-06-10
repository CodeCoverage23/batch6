package com.java8;

import java.util.UUID;
import java.util.function.*;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<String> p = str -> str.length() > 10;
		boolean test = p.test("Coverage");
		System.out.println(test);
		System.out.println("*************************************************");

		Function<Integer, String> f = t -> t * 2 + " The value has been multi by 2";
		String apply = f.apply(100);
		System.out.println(apply);
		System.out.println("*************************************************");

		Consumer<String> c = s -> System.out.println(s);
		c.accept("Java");
		c.accept("Code");
		c.accept(apply);
		System.out.println("*************************************************");
		Supplier<String> s = () -> UUID.randomUUID().toString();
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
