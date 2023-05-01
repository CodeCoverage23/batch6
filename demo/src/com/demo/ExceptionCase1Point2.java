package com.demo;

//case 1: if parent class method not declare any exception then the child class  method can declare 
//only unchecked exception.
//2.if we declared unchecked exception in child class method then our program will run.
class ParentClass {
	
	void show()  {
		
		System.out.println("parent methhod");
	}
	
}
class ChildClass extends ParentClass{
	void show() throws ArithmeticException
	{
		
		
		System.out.println("child method");
	}
	
	
	
	
}





	


public class ExceptionCase1Point2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ParentClass p=new ChildClass();
		p.show();
		
		
		
	}
}
