package com.AdvancedJava;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l = new ArrayList<>();
l.add(new Employee(101,"shweta",12));
l.add(new Employee(105,"ankit",25));
l.add(new Employee(103,"ashwin",30));
l.add(new Employee(107,"moli",45));
l.add(new Employee(109,"mathew",40));

Predicate<Employee> p1=e->e.salary>30;
Predicate<Employee> p2=e->e.salary%2==0;
//and method
for(Employee e1:l) {
	if(p1.and(p2).test(e1)) {
		System.out.println("id:"+e1.id +"Name:"+e1.name  +" Slary:"+e1.salary);
	}
}
System.out.println("######################################################");
//or method
for(Employee e1:l) {
	if(p1.or(p2).test(e1)) {
		System.out.println("id:"+e1.id +"Name:"+e1.name  +" Slary:"+e1.salary);
	}
}
System.out.println("######################################################");

//negate method//opposite answer 
for(Employee e1:l) {
	if(p2.negate().test(e1)) {
		System.out.println("id:"+e1.id +"Name:"+e1.name  +" Slary:"+e1.salary);
	}
}


	}

}
