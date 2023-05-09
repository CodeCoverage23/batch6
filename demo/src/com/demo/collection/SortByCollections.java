package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortByCollections {
public static void main(String[] args) {
	ArrayList<Integer> set2=new ArrayList<>();
    set2.add(68);
    set2.add(70);
    set2.add(49);
//   set2.add("pradeep");
    set2.add(25);
    set2.add(54);
    System.out.println(set2);
	Collections.sort(set2);
	System.out.println(set2);
	
	TreeSet t=new TreeSet(set2);
	System.out.println(t);
	
	
}
	
	
}
