package com.basic;

import java.math.BigDecimal;

public class DemoToString {

	int id;
	double amount;
	String accName;
	
	

	public DemoToString(int id, double amount, String accName) {
		super();
		this.id = id;
		this.amount = amount;
		this.accName = accName;
	}
	
	@Override
	public String toString() {
		return "DemoToString [amount=" + amount + ", accName=" + accName + "]";
	}

	public static void main(String[] args) {
		
		BigDecimal b = new BigDecimal("45845.62");
		
		
		DemoToString d1 = new DemoToString(101, 45878.45d, "John");
		DemoToString d2 = new DemoToString(101, 45555.45d, "John");
		
		System.out.println(b.toString());
		
		System.out.println(d1);
		System.out.println(d2);
	}
}
