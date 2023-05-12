package com.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoItrerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> List = new ArrayList<>();
		List.add(56);
		List.add(89);
		List.add(78);
		List.add(96);
		List.add(10);
		//Using Iterator
		Iterator<Integer> itr = List.iterator();
		System.out.println("after using Iterator : ");
		while (itr.hasNext()) {
			Integer next = itr.next();
			System.out.print(next + " ");
			List.add(50);
		}      // using advance for loop:
//		for(Integer value:List) {
//			if(value.equals(89)) {
//			List.remove(value);}
//			System.out.println(value);
//		}
		
		//TAsk: using simple for loop
		
		//do your code here
		
		
	}

}
