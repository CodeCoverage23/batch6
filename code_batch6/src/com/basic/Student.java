package com.basic;

public class Student {
	int studentid;
	String studentname;
	String studentstream;
	int studentage;

	public Student(int studentid, String studentname, String studentstream, int studentage) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentstream = studentstream;
		this.studentage = studentage;
	}

	public static void main(String[] args) {
		Student student = new Student(101, "Avinash", "CSE", 25);
		Student student01 = new Student(101, "Vinay", "CSE", 25);
		Student student02 = new Student(101, "Sarthak", "CSE", 25);

		System.out.println(student);
		System.out.println(student01);
		System.out.println(student02);

	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentstream=" + studentstream
				+ ", studentage=" + studentage + "]";
	}

}
