package com.assingment3;

public class Student {
	public String getStudentName(String studentname) {
		return studentname;
	}

	public static void main(String[] args) {
		Student s = new Student();
//		String p =s.getStudentName();
		System.out.println(s.getStudentName("Mansi"));
	}
}
