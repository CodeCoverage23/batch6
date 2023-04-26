package com.oops;

public class Strat implements Inter, Inter2 {

	@Override
	public void run() {
		System.out.println("Car is runnig");
	}

	@Override
	public void charge() {
		System.out.println("Car is charged");

	}

	public static void main(String[] args) {
		Strat s = new Strat();
		s.run();
		s.charge();
	}

}
