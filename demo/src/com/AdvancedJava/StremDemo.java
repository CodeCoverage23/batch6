package com.AdvancedJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StdentStreamDemo> a = new ArrayList<>();
		a.add(new StdentStreamDemo(101, "shweta", 20, 55));
		a.add(new StdentStreamDemo(105, "AArush", 25, 99));
		a.add(new StdentStreamDemo(102, "gaurav", 24, 75));
		a.add(new StdentStreamDemo(104, "rahul", 28, 50));
		a.add(new StdentStreamDemo(103, "sakshi", 27, 67));
		a.add(new StdentStreamDemo(103, "sakshi", 27, 67));

		System.out.println(a);
//FILTER METHOD INTERNALLY USE PREDICATE INTERFACE
		a.stream().filter(i -> i.mark >= 60).forEach(t -> System.out.println(
				"rollno: " + t.rollno + " age: " + t.age + " studentName: " + t.studentName + "  mark: " + t.mark));
		System.out.println("**************************************************");
		a.stream().filter(j -> j.age >= 25).forEach(p -> System.out.println(
				"rollno: " + p.rollno + " age: " + p.age + " studentName: " + p.studentName + "  mark: " + p.mark));
//COLLECT METHOD
		List<StdentStreamDemo> collect = a.stream().filter(e -> e.mark <= 60).collect(Collectors.toList());
//MAP METHOD INTERNALLY USE FUCTION INTERFACE

		List<Integer> collect1 = collect.stream().map(b -> b.mark + 5).collect(Collectors.toList());
		System.out.println(collect1);
		long count=a.stream().count();
		System.out.println(count);
	}
}
