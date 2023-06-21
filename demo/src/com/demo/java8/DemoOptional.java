package com.demo.java8;

import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) throws Exception {
//	ArrayList<String> a1=new ArrayList<>();
//	a1.add("pradeep");
//	
//	ArrayList a2=new ArrayList();
//	a1.add("alls");
	
//	ArrayList a3=new ArrayList();
//	a3.add(a1);
//	a3.add(a2);
	
		String name =null;
		String name2 = "akshay";
//		if (name != null ) {
//			int length = name.length();
//			
//			System.out.println("lenght of name : " + length);
//
//		} else {
//			System.out.println("please enter a valid name");
//		}
//

Optional<String> optional = Optional.ofNullable(name);
System.out.println(optional);

	
// optional.orElseThrow(()->new Exception("enter valid string"));

//		Optional<String> ofNullable = Optional.ofNullable(name2);
////		System.out.println(optional);

//	optional.ifPresent(s -> System.out.println(name.length()));
//	System.out.println(optional.orElse("enter valid name"));
		
//		if(optional.equals(ofNullable)){               //s1.equals(s2)?true:false
//			System.out.println("matched");
//			
//		}
//		else {
//			System.out.println("not matched");
//		}
//	if(	optional.isPresent()) {
//		
//		System.out.println(name);
//	}else
//	{
//		
//		System.out.println("please enter a valid name");
//	}

// String arrayList = optional.filter(s->s.length()>5).orElse("please enter valid string");
//		System.out.println(arrayList);
//
//		Integer integer = optional.map(s->s.length()+5).get();
//		System.out.println(integer);
//		optional.orElseThrow("please enter valid string");
////System.out.println(optional.orElseGet(()->"enter a valid name"));	
//
//	
	}
}
