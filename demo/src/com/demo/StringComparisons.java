package com.demo;
//By Using equals() Method
//By Using == Operator
//By compareTo() Method
public class StringComparisons {

	public static void main(String[] args) {
		
		String s = "Mansi"; //isko  string constant pool (scp) me space milti hai
		String s1 = "Mansi";
		String s2 = new String ("Mansi"); // isko scp + heap area dono me location milti hai.
		String s3 = "Sahu";
		String s4 = "MANSI";
							//By Using equals() Method
		
		System.out.println(s.equals(s1));  // true
		System.out.println(s.equals(s2));  // true
		System.out.println(s.equals(s3));  // false bcz memory same hai but content nahi
		
		System.out.println(s.equals(s4));  // false bcz case is different but memory 
		System.out.println(s.equalsIgnoreCase(s4)); //true bcz ignore case
		
							//By Using == Operator
		
		System.out.println(s==s1); //  true bcz same instance
		System.out.println(s==s2); // false bcz s2 is non pool 
		System.out.println(s==s4); //fAlse
		System.out.println(s==s3);  // false

	}
}
