package com.basic;

public class StringDemo1 {

	String s = "Java";//
	String s1 = "Java";//
	String s2 = "program";//

	public static void main(String[] args) {

		double b = 4544.12d;

		StringDemo1 s = new StringDemo1();
		System.out.println(s.s);

		String s3 = new String("JAVA");
		String s5 = new String("Java");
		String s4 = "Code Coverage";
		System.out.println(s3.length());

		System.out.println(s4.charAt(0));
		System.out.println(s4.substring(4, 9));
		System.out.println(s4.contains("w"));

		System.out.println("Equals check : " + s3.equals(s5));
		System.out.println("Equals check : " + s3.equalsIgnoreCase(s5));

		System.out.println(s5.concat(s4));
		System.out.println(s5.replace('a', '@'));

		System.out.println(s4.toUpperCase());
		System.out.println(s3.toLowerCase());

		System.out.println("S5 object" + " " + s5.indexOf('v'));
		String valueOf = String.valueOf(b);
		System.out.println(valueOf);

	}

}
