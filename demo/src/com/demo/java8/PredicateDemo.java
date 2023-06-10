package com.demo.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Employee>l=new ArrayList<Employee>();
	l.add(new Employee(101,"pratiksha",12));
	l.add(new Employee(102,"ankita",15));
	l.add(new Employee(105,"sameer",35));
	l.add(new Employee(109,"dev",50));
	l.add(new Employee(103,"esha",27));
	Predicate<Employee> p1= e->e.salary>30;
	Predicate<Employee> p2= e->e.salary%2==0;
	
	for(Employee e1:l) {
	if(p1.and(p2).test(e1)) {
		System.out.println("ID="+e1.id+" NAME="+e1.name+" SALARY="+e1.salary);
	}
	}
		
		
	}

}
