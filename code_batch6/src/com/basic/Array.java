package com.basic;

public class Array {
 public static void main(String[] args) {
	

	int temp, size;
	int array[]= {27 ,81 ,186 , 33,157,96, 170 ,66};
	size=array.length;
	 size = array.length;

     for(int i = 0; i<size; i++ ){
        for(int j = i+1; j<size; j++){

           if(array[i]>array[j]){
              temp = array[i];
              array[i] = array[j];
              array[j] = temp;
           }
        }
     }
     System.out.println(" second largest number is:: "+array[size-2]);
  }


 }

