package com.basic;

public class Student {
     
	      int RollNo;
	     String StudentName ;
	      int StudentAge;
	    static  String CollegeName="KGIET";
	    public Student(int RollNo,String StudentName,int StudentAge) {
	    	
	    	this.RollNo=RollNo;
	    	this.StudentName=StudentName;
	    	this. StudentAge= StudentAge;
	    	
	    	
	    }
	
		@Override
		public String toString() {
			return "Student [RollNo=" + RollNo + ", StudentName=" + StudentName + ", StudentAge=" + StudentAge + "]";
		}

		


		public static void main(String[]args) {
	    	 
	    	Student student01 = new Student(701,"Sarthak",21);
	    	Student student02 = new Student(702,"Purvaj",21);
	    	Student student03= new Student(703,"Avinash",21);
	    	Student student04 = new Student(704,"Vinay",21);
	    	 System.out.println(student01);
	    	 System.out.println(student02);
	    	 System.out.println(student03);
	    	 System.out.println(student04);
	    	 
	    	 
	     }
	     
	 
		}  

