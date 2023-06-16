package com.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
public static void main(String[] args) {
	List<Integer> asList1 = Arrays.asList(10,20,30,90);
	List<Integer> asList2 = Arrays.asList(60,40,70,50);
	List<Integer> asList3 = Arrays.asList(60,40,70,50);

	
	
	ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
	list.add(asList1);
	list.add(asList2);
	list.add(asList3);

	
	List<Integer> collect = list.stream().flatMap(l->l.stream().map(a->a+10)).collect(Collectors.toList());
	System.out.println(collect);
}
}
