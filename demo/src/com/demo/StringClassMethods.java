package com.demo;

public class StringClassMethods {

	String s = "Hello  "; // String literal
	String s1 = "HELLO";

	public static void main(String[] args) {
		StringClassMethods m = new StringClassMethods();
		System.out.println(m.s); // Hello

		String s2 = "Mansi Sahu"; // String literal
		String s3 = " Java ";
		String s4 = new String("Hello World"); // String by new key word
		String s5 = new String("mansi sahu");
		String s6 = new String("Mansi Sahu");
		String s7 = "";
		double s8 = 65474.258d;

		System.out.println(m.s.charAt(0)); // CharAt where index start from 0

		System.out.println(s2.length()); // for check the length

		System.out.println(m.s1.substring(2)); // this substring for where to beginIndex
		System.out.println(s2.substring(2, 8)); // this substring is for begin to the end but not getting end char.

		System.out.println(s2.contains(s5)); // ye check krta h same containt hai ki nahi //false
		System.out.println(s2.contains(s6)); // ye check krta h same containt hai ki nahi //true

		System.out.println(s2.equals(s6)); // true bcz containt and case same hai.
		System.out.println(s2.equalsIgnoreCase(s5)); // true bcz contains same but different case

		System.out.println("Empty " + s7.isEmpty()); // true

		System.out.println(m.s.concat(s3)); // addition of string

		System.out.println(s2.replace("a", "@")); // it is replace a string
		System.out.println(s2.replace("Mansi", "Manuu"));

		System.out.println(s4.indexOf("W"));

		System.out.println(m.s1.toLowerCase()); // small hello
		System.out.println(s5.toUpperCase()); // MANSISAHU

		System.out.println(m.s.trim() + "program"); // java ke bad ki space remove kr dega

		String valueOf = String.valueOf(s8); // ye any primitive data type ko string type me convert krta h
		System.out.println(valueOf);
	}
}
