package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<>();
   list.add(new Student(101,"akshay",27,45));
   list.add(new Student(105,"nimrit",29,80));
   list.add(new Student(103,"ankit",25,67));
   list.add(new Student(109,"sushil",28,35));
   list.add(new Student(102,"kavya",23,39));
   System.out.println(list);
 list.stream().filter(a->a.marks>=40).forEach(t->System.out.println("ROLLNO : "+t.rollno+" NAME : "+t.studentname+"MARKS :"+t.marks));
List<Student> collect = list.stream().filter(e->e.marks<=40).collect(Collectors.toList());
List<Integer> collect2 = collect.stream().map(b->b.marks+5).collect(Collectors.toList());
System.out.println(collect2);
 long count = list.stream().count();
       System.out.println(count);
	}

}
