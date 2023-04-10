package com.Assignment4;

public class AllProblem {
	
	
	public int additon(int a,int b) {
		
		int c=a+b;
		return c;
		}

public int substraction(int a,int b) {
	
	int d=a-b;
	return d;
	}
public int multiplication(int a,int b) {
	
	int e=a*b;
	return e;
	}
public int division(int a,int b) {
	
	int f=a/b;
	return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AllProblem A=new AllProblem();
	
		System.out.println("Addition: "+A.additon(5,5));
		System.out.println("substraction: "+A.substraction(10,5));
		System.out.println("multiplication: "+A.multiplication(10,5));
		System.out.println("division: "+A.division(10,5));
		

	}

}
