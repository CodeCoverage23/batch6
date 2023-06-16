package com.AdvancedJava;
import java.util.function.Predicate;


public class Predicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		predicate<Integer> p=j->j%2==0;
		System.out.println(p.test(25));
	}

}
