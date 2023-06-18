package com.AdvancedJava;

import java.util.ArrayList;

import java.util.stream.Collectors;

public class DistinctDemo {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	a.add(10);
	a.add(90);
	a.add(20);
	a.add(80);
	a.add(50);
	a.add(70);
	
	a.stream().distinct().forEach(System.out::println);
	System.out.println();
	long b=a.stream().count();
	
	System.out.println(b);
	
	a.stream().sorted().forEach(System.out::println);

}
}
