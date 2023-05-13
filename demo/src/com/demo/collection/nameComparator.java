package com.demo.collection;

import java.util.Comparator;

public class nameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o2.book_name.compareTo(o1.book_name) ;
	}

}
