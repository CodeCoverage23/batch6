package com.Assignment4;

import java.util.Scanner;

public class TotalOfFiveSubject {

	public static void main(String[] args) {
		 int  eng,math,phy,sci,bio;
		 double totalmarks , average;
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter a five subject marks: ");
		 
		 eng = sc.nextInt();
		 math = sc.nextInt();
		 phy = sc.nextInt();
		 sci = sc.nextInt();
		 bio = sc.nextInt();
		 
		 totalmarks = eng+math+phy+sci+bio;
		 average = totalmarks/5;
		 
		 System.out.println("total marks is : "+totalmarks);
		 System.out.println("average is : "+average);
		 
		 
		}

}
