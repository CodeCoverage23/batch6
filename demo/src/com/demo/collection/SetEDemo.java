package com.demo.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SetEDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Integer[] arr= {10,20,57,30,50,90,70};
       List<Integer> asList = Arrays.asList(arr);
       Set<Integer> set1= new HashSet<>();
       set1.addAll(asList);
       System.out.println(set1);
       Set<Integer> set2=new HashSet<>();
       set2.add(68);
       set2.add(70);
       set2.add(49);
       set2.add(90);
       set2.add(25);
       set2.add(54);
       System.out.println(set2);
Set<Integer> union=new HashSet<>(set1);
union.addAll(set2);
System.out.println(union);

		
//		set2.retainAll(set1);
//		System.out.println(set2);
//		set2.removeAll(set1);
//		System.out.println(set1);
//		for(Integer itr : set2) {
//			System.out.println(itr);
//		}
Set<Integer> intersection=new HashSet<>(set1);
intersection.retainAll(set2);
System.out.println(intersection);


Set<Integer> difference=new HashSet<>(set1);
difference.removeAll(set2);
System.out.println(difference);

		
		
	}

}
