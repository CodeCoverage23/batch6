package com.demo;

public class ParameterisedConstructor {
	int id;
	String name;
	String branch;
	String collageName;
	ParameterisedConstructor(int id,String name,String branch,String collageName){
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.collageName=collageName;
	}
	public static void main(String[] args) {
		ParameterisedConstructor p= new ParameterisedConstructor(01,"Arpita","cse","Kgiet");
		
		
	   System.out.println("student id is: "+(p.id));
	   System.out.println("student name is : "+p.name);
	   System.out.println("student branch is : "+p.branch);
	   System.out.println("student collage name is : "+p.collageName);
	}
	

}
