package com.basicAssignments;

public class Student {
		String Studentname;

		public Student(String studentname) {
			super();
			Studentname = studentname;
		}

		public static void main(String[] args) {
			Student ak = new Student("Kartik");
			System.out.println(ak);

		}

		@Override
		public String toString() {
			return "Student [Studentname=" + Studentname + "]";
		}

	}