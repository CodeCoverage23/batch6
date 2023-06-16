package com.AdvancedJava;
 import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerDemo  //implements Consumer<Integer >//
{
//	public void accept(Integer i) {
//		System.out.println(i);
//	}
	public static void main(String [] args) {
		List<Integer> value= Arrays.asList(20,30,40,50);
		Consumer<Integer> c= i->System.out.println(i);
		//value.forEach(c);
		//value.forEach(i->System.out.println(i));
	}

	

}
