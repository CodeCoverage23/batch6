package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> list = List.of("Ram", "Shyam", "Pavan", "Kishor");

		List<String> list2 = list.stream().filter(s -> s.length() > 3 && s.length() < 6).collect(Collectors.toList());
		System.out.println(list2);

		list.stream().filter(s -> s.length() > 3 && s.length() < 6).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));

	}

}
