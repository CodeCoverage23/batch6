package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> l = new ArrayList<>();
l.add(50);
l.add(10);
l.add(40);
l.add(30);
l.add(20);
//l.stream().distinct().forEach(System.out::println);
//System.out.println();
List<Integer> collect = l.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
System.out.println(collect);
System.out.println();
Integer integer = l.stream().min((i1,i2)->((i1<i2)?-1:(i1>i2)?1:0)).get();
System.out.println(integer);
System.out.println();
Integer integer1 = l.stream().max((i1,i2)->((i1<i2)?-1:(i1>i2)?1:0)).get();
System.out.println(integer1);
System.out.println();
Integer integer2 = l.stream().reduce((a,b)->(a<b)?a:b).get();
System.out.println("aggregate of collection : "+integer2);
	}

}
