package com.assignment3;

public class Student1 {
	
	String studentName;

	public Student1(String studentName) {
		super();
		this.studentName = studentName;
	}
	
	public static void main(String[]args) {
		Student1 s=new Student1("Gauri");
		System.out.println(s);
				
	}

	@Override
	public String toString() {
		return "Student1 [studentName=" + studentName + "]";
	}

}
