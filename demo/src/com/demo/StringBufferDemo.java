package com.demo;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("world");
		System.out.println(sb);
		sb.append(165456463.0005484);  // any data typr ke sth merge kr skta hai
		System.out.println("By any data type "+sb);
		 
		//-> by insert method
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.insert(2, "inserted");
		System.out.println(sb1);
		
		//-> By replace method
		StringBuffer sb2 = new StringBuffer("javaa");
		sb2.replace(2, 3 , "Program"); //replace me kaha se kaha tk replace krna h word yee rhta h
		System.out.println(sb2);
		
		// agar yhi normal string me krte hai to 
	String s = new String ("hello");
	s.concat("java");
	System.out.println(s); // hello print hoga bcz 
	//java ko store krne ke liye third variable hona jo dono ko store krke output de sake
	s=s.concat("java");
	System.out.println(s);  // hello java using object
	
	
	
	}
}
