package com.demo;

//case 1: if parent class method declare any exception then the child class  method can declare 
//same,child class exception or nothing .
//1.if we declared exception in parent class method then we can declared nothing in child class  
class ParentClass {

	void show() throws Exception {

		System.out.println("parent methhod");
	}

}

class ChildClass extends ParentClass {
	void show()  {

		System.out.println("child method");
	}

}

public class ExceptionCase2Point3 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ParentClass p = new ChildClass();
		p.show();

	}
}
