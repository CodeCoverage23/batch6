package com.demo;

public class StudentInfo {
	String StudentName; 
	int StudentRollNo; 
	String StudentClgName;
	String StudentAdd;
	
	public StudentInfo(String StudentName,int StudentRollNo,String StudentClgName,String StudentAdd) {
		super();
		 this.StudentName = StudentName; 
		 this.StudentRollNo = StudentRollNo; 
		 this.StudentClgName = StudentClgName;
		 this.StudentAdd = StudentAdd;	
	}
	
	
	@Override
	public String toString() {
		return "StudentInfo [StudentName=" + StudentName + ", StudentRollNo=" + StudentRollNo + ", StudentClgName="
				+ StudentClgName + ", StudentAdd=" + StudentAdd + "]";
	}


	public static void main (String[] arg) {
		
		StudentInfo s1= new StudentInfo("Vaishnu",111,"KGIET","Takarkheda");
		StudentInfo s2= new StudentInfo("Mrunali",112,"SPV","Yevda");
		StudentInfo s3= new StudentInfo("Mohini",113,"KGIET","Anjangaon");
		StudentInfo s4= new StudentInfo("Smita",114,"RSC","Amravati");
		StudentInfo s5= new StudentInfo("Shradha",115,"JDK","Rashegaon");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
	
	}
}