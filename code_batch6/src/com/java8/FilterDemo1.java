package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10, 21, 30, 41, 50, 61, 70, 80, 21, 100);

//		List<Integer> list = new ArrayList<>();
//
//		for (Integer i : asList) {
//			if (!(i % 2 == 0)) {
//				list.add(i);
//			}
//		}
//		System.out.println(list);

		Set<Integer> set = asList.stream().filter(e -> !(e % 2 == 0)).collect(Collectors.toSet());
		System.out.println(set);

		asList.stream().filter(e -> !(e % 2 == 0)).collect(Collectors.toSet()).forEach(e -> System.out.println(e));

		asList.stream().filter(e -> !(e % 2 == 0)).collect(Collectors.toSet()).forEach(System.out::println);

	}

}
