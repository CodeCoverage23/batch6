package com.demo;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("pradeep");
		al.add("gargi");
		al.add("mohan");
		al.add("shweta");
		al.add("harshal");
		al.add("akash");
		System.out.println(al);
for(int i=0;i<al.size();i++) {
	
	System.out.println(al.get(i));
	
}
System.out.println();
for(String s:al) {
	System.out.println(s);
}

	}

}
