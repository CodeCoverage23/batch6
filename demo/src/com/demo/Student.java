package com.demo;

public class Student {
	int studentId;
	 String studentname;
	String Stream;
	 int studentAge;
	static String collegename="DRGITR";
	
	public Student( int Id , String name,String field, int Age){
		this.studentAge = Age;
		 this.studentId=Id;
		 this.studentname=name;
		 this.Stream=field;
	 }
	
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", Stream=" + Stream
				+ ", studentAge=" + studentAge + " ,CollegeName=" + collegename +" ]";
	}



//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Student student1 = new Student(101,"pradeep","extc",27);
//		Student student2 = new Student(102,"kundan","it",26);
//		Student student3 = new Student(103,"shweta","comp.sc",25);
//		Student student4 = new Student(104,"akshay","extc",27);
//		Student student5 = new Student(101,"avinash","extc",26);
//		Student student6 = new Student(101,"suraj","extc",27);
//		Student student7 = new Student(101,"rushikesh","extc",27);
////		String string = student1.toString();
//		System.out.println(student1);
//		System.out.println(student2);

	}

	

