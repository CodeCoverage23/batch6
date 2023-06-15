package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	
	public static void main(String args[])
	{
		List<String> list = List.of("Akshay", "Ajay,", "Vijay", "Ravi");
		
		list.stream().map(str-> str.toUpperCase()).collect(Collectors.toList())
		.forEach(str->System.out.println(str));
		
	}

}
