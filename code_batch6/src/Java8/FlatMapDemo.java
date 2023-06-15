package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	
	public static void main(String args[])
	{
		List<Integer> list1 = List.of(1,2,3,4,5,6,7);
		List<Integer> list2 = List.of(1,2,3,4,5,7);
		List<Integer> list3= List.of(1,2,3,4,5,6,7);
		
		List<List<Integer>> listq = Arrays.asList(list1, list2, list3);
		
		List<Integer> list4= listq.stream().flatMap(flat -> 
		flat.stream()).collect(Collectors.toList());
		System.out.println(list4);
	}

}
