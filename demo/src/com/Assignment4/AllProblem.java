package com.Assignment4;

public class AllProblem {
	
	int a=30;
	int b=15;
	
	public int additon() {
		
		int c=a+b;
		return c;
		}

public int substraction() {
	
	int d=a-b;
	return d;
	}
public int multiplication() {
	
	int e=a*b;
	return e;
	}
public int division() {
	
	int f=a/b;
	return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AllProblem A=new AllProblem();
	
		System.out.println("Addition: "+A.additon());
		System.out.println("substraction: "+A.substraction());
		System.out.println("multiplication: "+A.multiplication());
		System.out.println("division: "+A.division());
		

	}

}
