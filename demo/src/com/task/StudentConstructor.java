package com.task;

public class StudentConstructor {
	
	String name;
	int rollNo;
	String stream;
	static String college;
	static String address;
	public StudentConstructor(String name, int rollNo, String stream, String college, String address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.stream = stream;
		this.college = college;
		this.address = address;
	}
	
	public static void main(String[] args) {
		
		StudentConstructor sc=new StudentConstructor("Yash", 101, "it", "TMV","Pune" );
		System.out.println(sc);
		StudentConstructor sc1=new StudentConstructor("Aman", 102, "HRM", "RTMNU","Nagpur" );
		System.out.println(sc1);
	}

	@Override
	public String toString() {
		return "StudentConstructor [name=" + name + ", rollNo=" + rollNo + ", stream=" + stream + ", college=" + college
				+ ", address=" + address + "]";
	}
	
}
