package com.oops;

public class InheritanceDemo extends Student  {
public void studentdata() {
	System.out.println("Single Student ");
	
}
public static void main(String[] args) {
	InheritanceDemo ak= new InheritanceDemo();
	
	ak.exam();
	ak.study();
	ak.studentdata();
	System.out.println("Roll no " + ak.rollno);
	System.out.println("Name " + ak.name);
}
}
