package Java8;
import java.util.*;

public class DistinctEx {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(20);
		list1.add(50);
		list1.add(20);
		list1.add(50);
		list1.add(90);	
		
		list1.stream().distinct().forEach(System.out::println);
		
	}

}

