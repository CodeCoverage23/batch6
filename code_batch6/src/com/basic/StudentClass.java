package com.basic;

public class StudentClass {

	int stdId;
	String stdName;
	String stream;

	public StudentClass(int stdId, String stdName, String stream) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stream = stream;
	}

	public static void main(String[] args) {

		StudentClass student =  new StudentClass(101, "sakshi", "cse");
		StudentClass student01 =  new StudentClass(102, "tanvi", "cse");
		StudentClass student02 =  new StudentClass(102, "Abc", "cse");
		System.out.println("student");
		System.out.println("student01");
        System.out.println("student02");
	}

	@Override
	public String toString() {
		return "StudentClass [stdId=" + stdId + ", stdName=" + stdName + ", stream=" + stream + "]";
	}


	}


