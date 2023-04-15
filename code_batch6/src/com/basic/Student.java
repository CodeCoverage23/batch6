package com.basic;

public class Student{
	
//public static void main(String[] args) {
//		Student s=new Student(101, "pooja", "pune", "science", "MJ");
//		System.out.println(s);
//} 
		
	int roll;
	String name;
	String add;
	String stream;
	String clgName;

	public Student(int roll, String name, String add, String stream, String clgName) {
		
		this.roll = roll;
		this.name = name;
		this.add = add;
		this.stream = stream;
		this.clgName = clgName;
	} 

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + ", stream=" + stream + ", clgName=" + clgName
				+ "]";
	}
	public static void main(String[] args) {
		Student s = new Student(01,"pooja","pune","science","mj");
		System.out.println(s);
		
	}
}

















