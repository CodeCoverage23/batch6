package com.demo;

public class StaticVariableEx {
	
	String StudentName;
	int StudentAge;
	static String StudentClgName="KGIE";
	
	public StaticVariableEx(String StudentName,int StudentAge) {
		
		this.StudentName=StudentName;
		this.StudentAge=StudentAge;
	}

	@Override
	public String toString() {
		return "StaticVariableEx [StudentName=" + StudentName + ", StudentAge=" + StudentAge + ",StudentClgName=" +StudentClgName + "]";
	}


	public static void main(String[] args) {
		
		StaticVariableEx Student1 = new StaticVariableEx("Aaryan",20);
		StaticVariableEx Student2 = new StaticVariableEx("Dnyanesh",19);
		StaticVariableEx Student3 = new StaticVariableEx("Soham",22);
		StaticVariableEx Student4 = new StaticVariableEx("Mit",23);
		StaticVariableEx Student5 = new StaticVariableEx("Git",21);
		
		System.out.println(Student1);
		System.out.println(Student2);
		System.out.println(Student3);
		System.out.println(Student4);
		System.out.println(Student5);

	}

}
