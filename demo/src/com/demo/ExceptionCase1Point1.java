package com.demo;
//case 1: if parent class method not declare any exception then the child class  method can declare 
//only unchecked exception.
//1.if we declared checked exception in child class method then error will occur if we want to to overcome 
//this problem then we have to declared same in parent class method
class ParentClass {
	
	void show()  {
		
		System.out.println("parent methhod");
	}
	
}
class ChildClass extends ParentClass{
	void show() throws Exception
	{
		
		
		System.out.println("child method");
	}
	
	
	
	
}



public class ExceptionCase1Point1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ParentClass p=new ChildClass();
		p.show();
		
		
		
	}

}
