package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo {
	public static void main(String args)
	{
		List<String> list1 = List.of("ram", "sham", "sAKHARAM", null, "Ajay");
		list1.stream().filter(e-> e !=null).collect(Collectors.toList())
		.forEach(e-> System.out.println(e));
	}
	

}
