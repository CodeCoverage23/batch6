package com.encapsulation;

public class EncapsulationDemo {
	private int num;
	private String name;
	
	void print() {
		System.out.println(num + " " + name);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		EncapsulationDemo e = new EncapsulationDemo();
		e.name="Manu";
//		e.num=4;
//		e.setNum(4);
		e.print();
	}
	
}
