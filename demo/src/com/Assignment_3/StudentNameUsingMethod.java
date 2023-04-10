package com.Assignment_3;

public class StudentNameUsingMethod {
	String studentName;

	public StudentNameUsingMethod(String Name) {
		super();
		this.studentName = Name;
	}
		
	
public static void main(String[] args) {
	StudentNameUsingMethod s= new StudentNameUsingMethod("kiran" );
	System.out.println(s);
}


@Override
public String toString() {
	return "StudentNameUsingMethod [Name: " + studentName + "]";
}
	

}
