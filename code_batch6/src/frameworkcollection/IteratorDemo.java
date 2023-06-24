package frameworkcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();

		a.add("Bhaiya");
		a.add("Harsh");
		a.add("Ashutosh");
		a.add("Avinash");
		a.add("Sarthak");
		a.add("Sunny");
		a.add("Siddhant");

		System.out.println(a);

		Iterator<String> iterator = a.iterator();
		while (iterator.hasNext()) {
			String data = iterator.next();
			String upperCaseData = data.toUpperCase();
			System.out.println(upperCaseData);
		}

	}

}