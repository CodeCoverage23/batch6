package com.basic;

import javax.swing.JOptionPane;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "Java";

		s1.concat(" Java");

		System.out.println(s1);

		String s2 = "Code Coverage";

		String substring = s2.substring(3, 6);

		System.out.println(substring);

	}

}
