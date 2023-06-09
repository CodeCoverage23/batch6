package com.demo;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	String companyname;

	public Employee(int id, String name, double salary, String companyname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.companyname = companyname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", companyname=" + companyname + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub

		// LOGIC 1: internal logic of comparable:->
		// if(this.id==emp.id) // 20==20 ==={20,20}
//	return 0;
//	else if (this.id>emp.id) /// 30>20 {20,30} 20>30 {20,30}
//		return 1;
//	else 
//	return -1:  // 30<20 {20,30} 20<30 {20,30}
		// LOGIC 2: direct use of copmpare to method:->
	//	return emp.id - this.id;
	
	//LOGIC 3 : //
		return this.name.compareTo(emp.name);
	
	}
	/*as you can see there is an error showing duplicate method. previously we were discussed about overriding -> same method with same signeture ,
	look at here we cannot overide more than one method because of same name and same signature
	therefore we can sort only single element in copmparable
	*/
//	@Override
//	public int compareTo(Employee emp) {
//		return 0 ;
//	}
}
