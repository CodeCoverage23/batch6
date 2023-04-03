package com.task;

public class PrimeNumber {

	public PrimeNumber() {
		String primeNumbers = "";

		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println(primeNumbers);
	}

	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
	}
}
