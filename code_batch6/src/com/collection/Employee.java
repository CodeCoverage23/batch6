package com.collection;

public class Employee implements Comparable<Employee> {

	private String name;
	private int salary;
	private String comName;

	public Employee(String name, int salary, String comName) {
		super();
		this.name = name;
		this.salary = salary;
		this.comName = comName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	@Override
	public int compareTo(Employee emp) {

//		if (this.salary > emp.salary) {
//			return -1;
//		} else if (this.salary < emp.salary) {
//			return 1;
//		} else {
//			return 0;
//		}
		return this.salary - emp.salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", comName=" + comName + "]";
	}

}
