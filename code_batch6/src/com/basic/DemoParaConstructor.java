package com.basic;

public class DemoParaConstructor {

	int rollNo;
	String name;
	String clgName;

	public DemoParaConstructor() {

	}

	public DemoParaConstructor(int rollNo, String clgName) {
		this.rollNo = rollNo;
		this.clgName = clgName;
	}

	public static void main(String[] args) {
		DemoParaConstructor d = new DemoParaConstructor(101, "JD");
		System.out.println(d);
	}

	@Override
	public String toString() {
		return "DemoParaConstructor [rollNo=" + rollNo + ", clgName=" + clgName + "]";
	}

}
