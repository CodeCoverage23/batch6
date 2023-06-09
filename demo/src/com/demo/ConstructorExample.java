package com.demo;
class Parent{
	int age=10;
	
}
public class ConstructorExample extends Parent {
	int rollno;
	String name;
	public ConstructorExample() {
		super();
		System.out.println("constructor");
	}

	public ConstructorExample(int id,String firstname) {
		rollno=id;
		name=firstname;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorExample construct=new ConstructorExample(101,"pradeep");
		ConstructorExample construct1=new ConstructorExample();
            Parent parent = new Parent();
		//		System.out.println(construct.rollno+" "+construct.name);
//		System.out.println(new ConstructorExample(101,"pradeep").name);
		System.out.println(parent instanceof Parent);
		}
	
	}


