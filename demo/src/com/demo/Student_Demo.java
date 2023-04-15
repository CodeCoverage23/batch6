package com.demo;
//for multiple entries we use to string method
public class Student_Demo {
	String StudentName;
	int StudentClass ;
	int StudentAge;
	int StudentId;
	
	
	public Student_Demo(String Name, int Class, int Age, int Id) {
		
		StudentName = Name;
		StudentClass = Class;
		StudentAge = Age;
		StudentId = Id;
	}

	@Override
	public String toString() {
		return "Student_Demo [StudentName=" + StudentName + ", StudentClass=" + StudentClass + ", StudentAge="
				+ StudentAge + ", StudentId=" + StudentId + "]";
	}


	public static void main(String[] args) {
		Student_Demo s1 =new Student_Demo("mansi",15, 24,101);
		Student_Demo s2 =new Student_Demo("saloni",16, 25,102);
		Student_Demo s3 =new Student_Demo("kiran",17, 28,103);
		Student_Demo s4 =new Student_Demo("sakshi",18, 29,104);
		Student_Demo s5 =new Student_Demo("khushi",19, 24,105);
		Student_Demo s6 =new Student_Demo("riya",20, 29,106);
		Student_Demo s7 =new Student_Demo("sonal",15, 24,107);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
	}
}
