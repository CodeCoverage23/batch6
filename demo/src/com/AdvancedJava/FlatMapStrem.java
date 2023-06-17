package com.AdvancedJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStrem  {
	public static void main(String[] args) {
		List<Integer> aslist=Arrays.asList(10,20,30,40);
		List<Integer> aslist1=Arrays.asList(50,60,70,80);
		List<Integer> aslist2=Arrays.asList(80,20,50,40);
		List<Integer> aslist3=Arrays.asList(10,90,99,44);
		ArrayList<List<Integer>> l = new ArrayList<>();
		l.add(aslist);
		l.add(aslist1);
		l.add(aslist2);
		l.add(aslist3);
		
		List<Integer>collect= l.stream().flatMap(i->i.stream().map(a->a+10)).collect(Collectors.toList());
System.out.println(collect);
	  
	}
	

}
