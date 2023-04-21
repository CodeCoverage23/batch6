package com.demo;

public class Student_Static_demo {
	int StudentId;
	 String StudentName;
	 int StudentClass;
	 int StudentAge;
	 static String CollegeName = "MGHS";
	
	
	public  Student_Static_demo(int Id, String Name, int Class, int Age) {
		
		StudentId = Id;
		StudentName = Name;
		StudentClass = Class;
		StudentAge = Age;
		
	}
	
	public static void method() {
		System.out.println("hi");
	}
	
	 @Override
	public String toString() {
		return "Student_Static_demo [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentClass="
				+ StudentClass + ", StudentAge=" + StudentAge + ", CollegeName=" + CollegeName + "]";
	}

	public static void main(String[] args) {
		Student_Static_demo s = new Student_Static_demo(101,"mansi",10,15);
		System.out.println(s);
		
		Student_Static_demo.method();
//		Student_Static_demo.Student_Static_demo(StudentAge, CollegeName, StudentAge, StudentAge, CollegeName);
	}
	
}
