package com.poojahande.Assignment;

public class sorting {
	
	public static void main(String args[])
	{
		int array[] = {27,81,186,157,96,170,66};		
		
		int temp,i,j;
		
		for(i=0; i<array.length; i++) {
			
			for (j=i+1;j<array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		System.out.println("Ascending order : \n");
		for(i=array.length-1; i>=0; i--) {
			System.out.print(array[i] + " ");
		}
		
//		System.out.println("Second Largest number in Ascending order : \n");
//		array[i]=array.length -1 ;
//		System.out.println(array[i] + ",");
		System.out.println("\n\n************************************\n");
		
		System.out.println("Descending order : \n");
	for(i=0; i<array.length; i++) {
			
			for (j=i+1;j<array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
			System.out.print(array[i] + " ");
		}

	}

}
