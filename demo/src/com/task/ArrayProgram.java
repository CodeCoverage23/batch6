package com.task;
import java.util.Arrays;

public class ArrayProgram {
	public static void main(String[] args) {
		int a[]= {20,45,55,15,78,100};
		//using sort method
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			
		}
		System.out.println( "array in ascending order: ");
		System.out.println(Arrays.toString(a));
		
		System.out.println("array in descending order: ");
		
	   for(int i1=a.length-1;i1>0;i1--) {
		   System.out.println(a[i1]+" ,");
		   
	    }
	   
	  
	   //without using sort method
	   int temp;
	   for(int i=0;i<a.length;i++) {
		   for(int j=i+1;j<a.length;j++) {
			   if(a[i] > a[j]) {
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				   
			   }
			   
		   }
		   
	   }
	   System.out.println("ascending order: ");
	   System.out.println(Arrays.toString(a));
	}
	
}
			
			
	
	
	
	

