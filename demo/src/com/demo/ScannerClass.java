package com.demo;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the marks: ");
		int marks=sc.nextInt();
		if(marks<100 && marks>=90){
			
			System.out.println("Grade A+");
		}
		else if(marks>81 &&  marks>=70) {
			
			System.out.println("Grade A");
		}
      else if(marks>71 &&  marks>=60) {
			
			System.out.println("Grade B+");
		}
		
      else if(marks>61 &&  marks>=55) {
			
			System.out.println("Grade B");
		}
		
      else if(marks>54 &&  marks>=45) {
			
			System.out.println("Grade c");
		}
		
      else  {
			
			System.out.println("Fail");
		}
		
	}
	

}
