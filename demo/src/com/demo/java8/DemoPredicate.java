package com.demo.java8;

import java.util.function.Predicate;

public class DemoPredicate  {

	public static void main(String[] args) {
// TODO Auto-generated method stub
 Predicate<Integer> p1=t->t%2==0;
 System.out.println(p1.test(20));
 }
}
