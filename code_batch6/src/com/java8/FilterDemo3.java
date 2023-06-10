package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ram", "Shyam", null, "Pavan", "Kishor", null);
		
		
		List<String> list2 = list.stream().filter(e -> e != null).collect(Collectors.toList());
		
		list2.stream().map(e->e.length()).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println(list2);

	}

}
