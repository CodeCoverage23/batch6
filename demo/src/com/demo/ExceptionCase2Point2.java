package com.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

//case 1: if parent class method declare any exception then the child class  method can declare 
//same,child class exception or nothing .
//1.if we declared exception in parent class method then we have to declared child exception in child class  
class ParentClass {

	void show() throws Exception {

		System.out.println("parent methhod");
	}

}

class ChildClass extends ParentClass {
	void show() throws IOException {

		System.out.println("child method");
	}

}

public class ExceptionCase2Point2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ParentClass p = new ChildClass();
		p.show();

	}
}
