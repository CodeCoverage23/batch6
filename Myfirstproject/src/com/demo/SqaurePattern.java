package com.demo;

import java.util.Scanner;

public class SqaurePattern {

	public static void main(String[] args) {
		int scan;
		Scanner sq = new Scanner(System.in);
		
		System.out.print(" Enter a nunber : ");
		scan = sq.nextInt();	
			
		for(int i = 1; i <= scan; i++)
		{
			for(int j = 1; j <= scan; j++)
			{
				System.out.print(" *"); 
			}
			System.out.println(" "); 
		}

}}