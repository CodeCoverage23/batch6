package com.AdvancedJava;

import java.util.ArrayList;
import java.util.stream.Collectors;
public class SortingStrem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<StdentStreamDemo> l = new ArrayList<>();
		l.add(new StdentStreamDemo(201,"Raghav",25,35));
		l.add(new StdentStreamDemo(205,"pushker",27,79));
		l.add(new StdentStreamDemo(202,"ankita",29,85));
		l.add(new StdentStreamDemo(209,"nikita",24,45));
		l.add(new StdentStreamDemo(203,"babita",22,63));
		System.out.println(l);
		
		//Natural sorting order 
		
		System.out.println();
		
		l.stream().sorted((s1,s2)->(s1.rollno>s2.rollno?1:s1.rollno<s2.rollno?-1:0)).forEach(System.out::println);
//Descending  order
		
		System.out.println();
		
		l.stream().sorted((s1,s2)->(s1.rollno<s2.rollno?1:s1.rollno>s2.rollno?-1:0)).forEach(System.out::println);
	}

}
