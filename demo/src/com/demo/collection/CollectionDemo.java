package com.demo.collection;

import java.util.ArrayList;

import com.demo.Student;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al =new ArrayList<>();
		al.add(new Student(101,"pradeep","extc",27 ));
		al.add(new Student(102,"akush","it",25 ));
		al.add(new Student(103,"anushka","cs",26 ));
		al.add(new Student(104,"dipak","extc",30 ));
		al.add(new Student(105,"shweta","mech",25 ));
		al.add(new Student(106,"joy","civil",29 ));
		for(Student s:al) {
			System.out.println(s);
		
		
	}

}}
