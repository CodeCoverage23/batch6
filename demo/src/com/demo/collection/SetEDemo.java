package com.demo.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Integer[] arr= {10,20,20,30,50,50,70};
       List<Integer> asList = Arrays.asList(arr);
       System.out.println(asList);
       Set<Integer> set1= new HashSet<>();
       set1.addAll(asList);
       System.out.println(set1);
       Set<Integer> set2=new HashSet<>();
       set2.add(68);
       set2.add(23);
       set2.add(49);
		set2.addAll(set1);
		System.out.println(set2);
//		set2.retainAll(set1);
//		System.out.println(set2);
//		set2.removeAll(set1);
//		System.out.println(set1);
		for(Integer itr : set2) {
			System.out.println(itr);
		}
       
		
		
	}

}
