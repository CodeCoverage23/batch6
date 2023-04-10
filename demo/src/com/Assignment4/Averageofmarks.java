package com.Assignment4;
import java.util.*;

public class Averageofmarks {

	public static void main(String[] args) {
		int eng,physics,chemistry,maths,biology;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five subject marks ");
          eng=sc.nextInt();
          
          physics=sc.nextInt();
          
          chemistry=sc.nextInt();
          
          maths=sc.nextInt();
          
          biology=sc.nextInt();
          
          float totalmarks=eng+physics+chemistry+maths+biology;
          float  average=totalmarks/5;
          
          System.out.println("total marks is:"+totalmarks);
          System.out.println("Average of marks:"+average);
	}

}
