package com.assingment3;

public class StudentName {
	String Name;
	
	public StudentName(String Name) {
		super();
		this.Name = Name;
	}
	
	@Override
	public String toString() {
		return "StudentName [Name=" + Name + "]";
	}

	public static void main(String[] args) {
		StudentName s = new StudentName("Vaishnavi");
		System.out.println(s);
	}
}
