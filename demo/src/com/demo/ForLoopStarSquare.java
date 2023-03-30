package com.demo;

import java.util.Scanner;

public class ForLoopStarSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i,j,m;
         m = 6;
         System.out.println(" The Square Length " +m);
         System.out.println("The Square Pattern : ");
         for(i = 1; i <= m; i++){
	     for(j = 1; j <= m; j++){
	     System.out.print(" *  ");
	     }
	     System.out.println("\n");
	     }
		
	}

}
