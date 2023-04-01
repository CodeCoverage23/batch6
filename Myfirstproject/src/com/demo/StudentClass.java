package com.demo;

public class StudentClass {

	int stdId;
	String stdName;
	String stdBranch;
	int age;
	String clg;

	
	public StudentClass(int stdId, String stdName, String stdBranch, int age, String clg) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdBranch = stdBranch;
		this.age = age;
		this.clg = clg;
	}

	public static void main(String[] args) {

		StudentClass student1 = new StudentClass(101, "sakshi", "cse",24,"kgiet");
		StudentClass student2 = new StudentClass(102, "tanvi", "cse",23,"kgiet");
		StudentClass student3 = new StudentClass(103, "Arpita", "cse",22,"kgiet");
		StudentClass student4= new StudentClass(104, "sam", "mech",25,"kgiet");
		StudentClass student5 = new StudentClass(105, "manvi", "extc",24,"kgiet");
		
		
		System.out.println( "student is:  "+student1);
		System.out.println("student is:  "+student2);
		System.out.println("student is:  "+student3);
		System.out.println("student is:  "+student4);
		System.out.println("student is:  "+student5);
	}

	@Override
	public String toString() {
		return "StudentClass [stdId=" + stdId + ", stdName=" + stdName + ", stdBranch=" + stdBranch + ", age=" + age
				+ ", clg=" + clg + "]";
	}

	

}
