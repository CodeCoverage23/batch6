package com.demo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l=new LinkedList();
		l.add(10);
		l.add(869);
		l.add("pradeep");
		l.add(15.9);
		l.add(458.558);
		l.add("Ankush");
		l.add(869);
	System.out.println(l);	
	l.addFirst(789);
	l.addLast("pratiksha");
	System.out.println(l);
	System.out.println(l.getFirst());
	System.out.println(l.getLast());
System.out.println(l.contains(869));
System.out.println(l.indexOf("pradeep"));	
l.offer(478);
System.out.println(l);
System.out.println(l.peek());
System.out.println(l.poll());
System.out.println(l);
	}

}
