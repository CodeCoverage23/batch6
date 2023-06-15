package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(101, "akshay", 27, 45));
		list.add(new Student(105, "nimrit", 29, 80));
		list.add(new Student(103, "ankit", 25, 67));
		list.add(new Student(109, "sushil", 28, 35));
		list.add(new Student(102, "kavya", 23, 39));
		list.add(new Student(103, "shubham", 24, 40));

		System.out.println(list);
		System.out.println();
		// filter method in stream
		System.out.println("stream api filter method output : ");
		list.stream().filter(a -> a.marks >= 40).forEach(
				t -> System.out.println("ROLLNO : " + t.rollno + " NAME : " + t.studentname + " MARKS :" + t.marks));
		List<Student> collect = list.stream().filter(e -> e.marks <= 40).collect(Collectors.toList());
		System.out.println();
		// map method in stream
		System.out.println("stream api map method output : ");
		List<Integer> collect2 = collect.stream().map(b -> b.marks + 5).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println();
		// count method in stream
		System.out.println("stream api count method output : ");
		long count = list.stream().count();
		System.out.println(count);
		System.out.println();
		// sorted method in stream
		// sorting using natural sorting order
		System.out.println("stream api sorted method using ascending output : ");
		list.stream().sorted((s1, s2) -> (s1.rollno < s2.rollno) ? -1 : (s1.rollno > s2.rollno) ? 1 : 0)
				.forEach(System.out::println);
		System.out.println();
		// sorting in descending order
		System.out.println("stream api sorted method using descending output : ");

		list.stream().sorted((s1, s2) -> (s1.rollno < s2.rollno) ? 1 : (s1.rollno > s2.rollno) ? -1 : 0)
				.forEach(System.out::println);
	}

}
