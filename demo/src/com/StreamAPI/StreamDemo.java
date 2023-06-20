package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> book = new ArrayList<Integer>();
      book.add(3);
      book.add(6);
      book.add(9);
      book.add(88);
      book.add(21);
      book.add(14);
      System.out.println(book);
  List<Integer>l3   = book.stream().filter(i->i<15).collect(Collectors.toList());
  System.out.println(l3);
	}

}
