package com.demo;

public class ConstructorStudent {

	int studentId;
	String studentname;
	String stream;
	int studentAge;
	 ConstructorStudent(int Id, String name, String field, int Age){
		 this.studentAge = Age;
		 this.studentId = Id;
		 this.studentname = name;
		 this.stream = field;
		 
	 }
	 public static void main(String[]args) {
		 ConstructorStudent s1 = new ConstructorStudent(345, "Ram", "CSE", 21);
		 
		 ConstructorStudent s3 = new ConstructorStudent(347, "Shree", "CE", 21);
		 System.out.println(s1.studentId);
		 System.out.println(s1.studentname);
		 System.out.println(s1.stream);
		 System.out.println(s1.studentAge);
		 
		 System.out.println(s3.studentId);
		 System.out.println(s3.studentname);
		 System.out.println(s3.stream);
		 System.out.println(s3.studentAge);
		 
		 	 
	 }
	
	  
}
