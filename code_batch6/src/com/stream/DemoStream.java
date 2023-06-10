package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

	public static void main(String[] args) {

		List<Integer> l = List.of(12, 41, 14, 52, 74, 85, 96, 32, 5);
		System.out.println(l);

//		List<Integer> t = List.of();
//
//		for (Integer i : l) {
//			if (i % 2 == 0) {
//				t.add(i);
//			}
//			System.out.println(t);
//		}

		l.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

	}

}
