package com.task;

public class FactoralMethod {

	public void factNumber() {
		long fact = 1;
		long num = 4;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factoral Number =" + fact);
	}

	public long factorlNumber(long num) {

		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

	public static void main(String[] args) {

		FactoralMethod f = new FactoralMethod();
		f.factNumber();
		System.out.println("Fact Number= " + f.factorlNumber(5));

	}
}
