package com.demo.java8;

import java.util.stream.Stream;

public class FibbonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("using core java : ");
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " " + n2);
		for (int i = 0; i < 10; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

		System.out.println();
		System.out.println("using java 8 :");
		int arr[]=new int[] {0,1};
		Stream.iterate(arr,f-> new int[]{f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(System.out::println);
		
		
		
		
		
	}

}
