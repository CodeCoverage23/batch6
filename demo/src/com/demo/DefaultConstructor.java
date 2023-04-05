package com.demo;

public class DefaultConstructor {
	int num;
	String name;
	public DefaultConstructor(int num  ,String name) {
		this.num=num;
		this.name=name;
		
	}
 public static void main(String[]args) {
	 DefaultConstructor def = new DefaultConstructor(56  ,"Arpita");
	 System.out.println(def.num);
	 System.out.println(def.name);
 }

}
