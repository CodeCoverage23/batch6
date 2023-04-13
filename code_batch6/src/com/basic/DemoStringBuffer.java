package com.basic;

public class DemoStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");

		sb.append(123125);

		System.out.println("SB Object : " + sb);

		String s1 = new String("Java");

		s1.concat(" Code");	

		System.out.println("String Object : " + s1);

	}

}
