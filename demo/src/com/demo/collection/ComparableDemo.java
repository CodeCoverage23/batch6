package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import com.demo.Employee;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Employee> al = new ArrayList<>();
	
	al.add(new Employee(109, "akash", 30000.50, "l&T"));	
	al.add(new Employee(105, "dipak", 70000, "infosys"));	
	al.add(new Employee(101, "akshay", 10000, "cognizant"));	
	al.add(new Employee(106, "shweta", 50000, "mahindra"));	
	al.add(new Employee(109, "mayuri",45203, "ibm"));	
		

	
//	System.out.println(al);
	Collections.sort(al);
	for(Employee s:al) {
		
		System.out.println(s);
	}
	
		
		
	}

}
