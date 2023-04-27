package com.demo;

class Students {
	private String name;

//	// read only access
//	public String get() {
//		return name;

//		
//	}
	//Write only access
	public void setName(String name) {
		this.name = name;

	}

}

public class ReadAndWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students students = new Students();
		students.setName("pradeep");

	}

}
