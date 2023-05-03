package com.demo;

public class BubbleSort {
public static void sort(int array[]) {
   int Temp;
   for(int i=0;i<array.length;i++) {
	   for(int j=1;j<array.length-i;j++) {
		   if (array[j-1]>array[j]) {
			   Temp=array[j-1];
			   array[j-1]=array[j];
			   array[j]=Temp;
			   		   
		   } 
		   
	   }
	   
	   
	   
   }
	
	
	
	
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {90,20,60,120,50,70,100};
		System.out.println("array before sorting");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
			
			
		}
		
		System.out.println();
		sort(array);
		System.out.println("array after sorting");
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
		}
	}

}
