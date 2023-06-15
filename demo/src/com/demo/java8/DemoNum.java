package com.demo.java8;

import java.util.ArrayList;

public class DemoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> l = new ArrayList<>();
l.add(10);
l.add(10);
l.add(20);
l.add(30);
l.add(20);
l.stream().distinct().forEach(System.out::println);
System.out.println();
l.stream().sorted().forEach(System.out::println);


	}

}
