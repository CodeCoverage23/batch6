package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		
		List<Integer> list1= List.of(2, 45, 67, 89, 16, 44, 78);
		
		List<Integer> list2= new ArrayList<>();
		list2.add(12);
		list2.add(20);
		list2.add(23);
		list2.add(22);
		
		List<Integer> list3 = Arrays.asList(23, 456, 34, 35);
		
//		List<Integer> listEven = new ArrayList<>();
//		for (Integer i : list1)
//		{
//			if(i % 2==0)
//			{
//				listEven.add(i);
//			}
//		}
//	 System.out.println(listEven);
	 
	 //using stream
//	Stream<Integer> stream1 =  list1.stream();	
//	List<Integer> newList= stream1.filter(i-> i%2==0).collect(Collectors.toList());
//	System.out.println(newList);
		List<Integer> newList = list1.stream().filter(i -> i%2==20 ).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> newList1 =list1.stream().filter(i-> i>50).collect(Collectors.toList());
		System.out.println(newList1);
		
		List<Integer> newList3 = list2.stream().filter(i -> i>=20).collect(Collectors.toList());
		System.out.println(newList3);
		
		List<Integer> newList4 = list3.stream().filter(i-> i>30).collect(Collectors.toList());
		System.out.println(newList4);
		
		}
}
