package com.demo.java8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Employee>l=new ArrayList<Employee>();
	l.add(new Employee(101,"pratiksha",12000));
	l.add(new Employee(102,"ankita",15000));
	l.add(new Employee(105,"sameer",35000));
	l.add(new Employee(109,"dev",50000));
	l.add(new Employee(103,"esha",27000));
	Predicate<Employee> p1= e->e.salary>30000;
//	Predicate<Employee> p2= e->e.salary%2==0;

	Function<Employee,Integer> f=s->s.salary+5000;
	//predicate function chaining =>
//	for(Employee e1:l) {
//		if(p1.and(p2).test(e1)) {
//	if(p1.or(p2).test(e1)) {
//	if(p1.nigate().test(e1)) {
	for(Employee e1:l) {
	if(p1.test(e1)) {
		System.out.println("ID="+e1.id+" NAME="+e1.name+" SALARY="+f.apply(e1));
	}
	}
		
		
	}

}
