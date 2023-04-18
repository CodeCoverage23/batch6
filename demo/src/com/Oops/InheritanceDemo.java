package com.Oops;

public class InheritanceDemo extends Student {


		public void studentData() {
			System.out.println("Single Student");
		}

		public static void main(String[] args) {

			InheritanceDemo d = new InheritanceDemo();

			d.exam();
			d.study();
			d.studentData();

			System.out.println(d.rollNo);
			System.out.println(d.name);

	

	}

}
