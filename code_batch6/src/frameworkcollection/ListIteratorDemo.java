package frameworkcollection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<String> l = new LinkedList<>();

		l.add("ABC");
		l.add("DEF");
		l.add("GHI");
		l.add("JKL");
		l.add("MNO");
		l.add("PQR");

		System.out.println(l);

//		List<String> collect = l.stream().filter(entry -> !entry.equalsIgnoreCase("GHI")).collect(Collectors.toList());
//		System.out.println(collect);

		ListIterator<String> listIterator = l.listIterator();
		String next = null;
		while (listIterator.hasNext()) {
			next = listIterator.next();

			if (next.equalsIgnoreCase("GHI")) {
				listIterator.remove();
			}
		}
		System.out.println(next.toLowerCase());

	}

}