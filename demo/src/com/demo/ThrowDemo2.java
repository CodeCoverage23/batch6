package com.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowDemo2 {
	
	
	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub


	FileReader fileReader;
	try {
		fileReader = new FileReader("c:\\Users\\pradeep.text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		throw new FileNotFoundException("existing file not available");     
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
	System.out.println("file is replaced");
	}
	catch (ArithmeticException ar) {
		System.out.println("arith metic exception handle");
	}
      catch (Exception ex   ) {
     System.out.println("file not found");		
	}
	
	System.out.println("normal flow");
	
}}
