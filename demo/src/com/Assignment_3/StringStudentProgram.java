//Design the separate method as string getstudent Name (string name)which return student name &print it.

package com.Assignment_3;

public class StringStudentProgram {
	String Studentname;
	
	public StringStudentProgram(String Studentname) {
		super();
		Studentname = Studentname;
	this.Studentname=Studentname;
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStudentProgram B = new StringStudentProgram("Bhavika");
		System.out.println(B);

	}


	@Override
	public String toString() {
		return "StringStudentProgram [Studentname=" + Studentname + "]";
	}

}
