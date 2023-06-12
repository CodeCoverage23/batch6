package com.demo.java8;

import java.util.function.Function;
// function interface function chaining
public class DemoFuction  {

	public static void main(String[] args) {
		Function<Integer, Integer> f1=n->n*n;
		Function<Integer, Integer> f2=n->n*2;
		System.out.println(f1.andThen(f2).apply(5));
	System.out.println(f1.compose(f2).apply(5));
	}    

	

}
