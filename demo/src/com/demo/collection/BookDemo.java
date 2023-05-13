package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Book> list = new ArrayList<>();
		list.add(new Book(1026, "comp.science", 800,"mchalley"));
		list.add(new Book(1010, "let us c", 950,"absucl"));
		list.add(new Book(2056, "elct. & devices", 658,"kennedy"));
		list.add(new Book(2001, "mathematic", 1050,"sukumae"));
		list.add(new Book(2346, "lts a c++", 560,"danile willy"));

		Collections.sort(list,new nameComparator());
		for(Book b:list) {
			System.out.println(b);
		}
		System.out.println();
		Collections.sort(list,new IdComparator());
		for(Book b1:list) {
			System.out.println(b1);
		}
	}

}
