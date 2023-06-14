package com.demo.java8;

public class Student {
        int rollno;
        String studentname;
        int studentage;
        int marks;
		public Student(int rollno, String studentname, int studentage, int marks) {
			super();
			this.rollno = rollno;
			this.studentname = studentname;
			this.studentage = studentage;
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", studentname=" + studentname + ", studentage=" + studentage
					+ ", marks=" + marks + "]";
		}
	
	
	
	
}
