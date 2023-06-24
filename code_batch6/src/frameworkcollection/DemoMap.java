package frameworkcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {

		Map<String, String> m = new HashMap<String, String>();
		m.put("10", "Amol");
		m.put("20", "Jivan");
		m.put("30", "Pratham");
		m.put("40", "Amol");

		System.out.println(m.hashCode());

		for (Entry<String, String> map : m.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}

		/*
		 * ArrayList<Integer> a = new ArrayList<>(); a.add(11); a.add(15); a.add(17);
		 * a.add(19); a.add(16); a.add(11); for (Integer i : a) { System.out.println(i);
		 * }
		 */

		if (m.containsKey("40")) {
			System.out.println("Key is present : " + m.get("40"));
		} else {
			System.out.println("Key is not present");
		}

	}

}


