package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch2 {
public static void main(String[] args) {

	try {
		System.out.println("code");
		FileReader f  = new FileReader("c:\\User\\abc.txt");
		int a =10/0;
	} catch (Exception e) {
		// TODO: handle exception
		try {
			int b = 10/0;
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e2);
		} 
		System.out.println(e);
		
	}
	System.out.println("rest of the code");
	
}
}
