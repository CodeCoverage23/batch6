package com.demo;

public class Student {
	  String StudentName;
	  int StudentId;
	  int studentAge;
	  String studentStream;

	public Student(String studentName, int studentId, int studentAge, String studentStream) {
		super();
		StudentName = studentName;
		StudentId = studentId;
		this.studentAge = studentAge;
		this.studentStream = studentStream;
	}
	  
	 public static void main (String[] args) {
		 Student s1 = new Student("Ram",702,20,"CSE");
		 Student s2 = new Student("Pratap",553,25,"extc");
		 Student s3= new Student("sakshi",101,23,"CSE");
		 Student s4 = new Student("Priti",602,20,"Civil");
		 Student s5 = new Student("Rohini",456,26,"extc");
		 
	}
	 
	 } 
	


