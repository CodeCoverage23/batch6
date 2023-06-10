package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {

		List<String> list = List.of("Ram", "Shyam", "Pavan", "Kishor");

//		List<String> l = new ArrayList<String>();
//
//		for (String s : list) {
//			l.add(s.toUpperCase());
//		}
//		System.out.println(l);

		list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList())
				.forEach(str -> System.out.println(str));

	}

}
