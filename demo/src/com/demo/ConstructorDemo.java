package com.demo;

public class ConstructorDemo {

	int clss;
	String Name;
	int Rollno;
	String stream;
	String CollegeName;
	String Address;

	public ConstructorDemo(int clss, String name, int rollno, String stream, String collegeName, String address) {
		super();
		this.clss = clss;
		this.Name = name;
		this.Rollno = rollno;
		this.stream = stream;
		this.CollegeName = collegeName;
		this.Address = address;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo c = new ConstructorDemo(10, "Mansi",12,"science","VBMV","AMT");

		System.out.println(c.clss);
		System.out.println(c.Name);
		System.out.println(c.Rollno);
		System.out.println(c.stream);
		System.out.println(c.CollegeName);
		System.out.println(c.Address);
	}  

}
