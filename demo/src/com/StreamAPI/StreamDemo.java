package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> name = new ArrayList<String>();
      name.add("Gargi");
      name.add("Preshita");
      name.add("Sweety");
      name.add("Hitakshi");
      name.add("yug");
      System.out.println(name);
  List<String>l3   = name.stream().filter(s->s.equalsIgnoreCase("Gargi")).collect(Collectors.toList());
  System.out.println(l3);
	}

}
