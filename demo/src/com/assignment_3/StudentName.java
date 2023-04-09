
//1. Design the separate method as String getStudentName (String name) 
//   which return student name and print it.

package com.assignment_3;

public class StudentName {
	String name;

	public StudentName(String name) {
		super();
		name = name;
	    this.name=name;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentName m = new StudentName("Mayuri");
		System.out.println(m);
	}

	@Override
	    public String toString() {
		return "StudentName [name = " + name + "]";
	}
}


