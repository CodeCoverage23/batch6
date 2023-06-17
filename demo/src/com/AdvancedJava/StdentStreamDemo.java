package com.AdvancedJava;

public class StdentStreamDemo {
int rollno;
String studentName;
int age;
int mark;
public StdentStreamDemo(int rollno, String studentName, int age, int mark) {
	super();
	this.rollno = rollno;
	this.studentName = studentName;
	this.age = age;
	this.mark = mark;
}
@Override
public String toString() {
	return "StdentSreamDemo [rollno=" + rollno + ", studentName=" + studentName + ", age=" + age + ", mark=" + mark
			+ "]";
}



}
