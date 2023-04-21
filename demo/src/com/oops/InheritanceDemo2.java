package com.oops;

class Hm {
	void grandFather() {
		System.out.println("Dadaji");
	}
}

class Mukesh extends Hm {
	void father() {
		System.out.println("Papaji");
	}
}

class Mansvi extends Mukesh {
	void daughter() {
		System.out.println("It's Me :)");
	}
}

public class InheritanceDemo2 {
	public static void main(String[] args) {

		Mansvi m = new Mansvi();
		m.grandFather();
		m.father();
		m.daughter();
	}
}
