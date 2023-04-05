package com.basic;

public class StudentContructor {

	int rollNo;
	String name;
	static String clgName = "COEP";
	String add;
	String branch;

	public StudentContructor(int rollNo, String name, String add, String branch) {
		this.rollNo = rollNo;
		this.name = name;
		this.add = add;
		this.branch = branch;
	}

	public static void main(String[] args) {
		StudentContructor s1 = new StudentContructor(101, "Pavan", "Pune", "CSE");
		StudentContructor s2 = new StudentContructor(102, "Raman", "AMT", "ME");
		StudentContructor s3 = new StudentContructor(103, "Rajat", "Akola", "CE");
		StudentContructor s4 = new StudentContructor(104, "Viraj", "NGP", "CSE");
		StudentContructor s5 = new StudentContructor(105, "Sam", "Pune", "CSE");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

	@Override
	public String toString() {
		return "StudentContructor [rollNo=" + rollNo + ", name=" + name + ", clgName=" + clgName + ", add=" + add
				+ ", branch=" + branch + "]";
	}

}
