package Java8;

import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		Stream<Object> emptystream = Stream.empty();
		String names[]= {"Akshay", "Ajay", "Vijay", "Rakesh"};
		
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e->   
		{
			System.out.println(e);
		});
		
		Stream<Object> streamBuilder = Stream.builder().build();				

	}

}
