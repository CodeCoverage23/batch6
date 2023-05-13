package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingBySalary {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<>();

		al.add(new Employee("Vishal", 20000, "XYZ"));
		al.add(new Employee("Kishor", 25000, "XYZ"));
		al.add(new Employee("Sachin", 10000, "XYZ"));
		al.add(new Employee("Vijay", 220000, "XYZ"));

		System.out.println(al.hashCode());

		Collections.sort(al, new SortOnName().reversed());

		al.forEach(System.out::println);

		for(Employee e : al) {
			System.out.println(e.getComName());
		}
		
		Iterator<Employee> i = al.iterator();
		while(i.hasNext()) {
			Employee next = i.next();
			System.out.println(next);
		}

	}

}
