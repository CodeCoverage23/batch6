package com.oops;

	//multilevel Inherritance
	class Birds1{
		void flying() {
			
			System.out.println("birds are flying");
		}
		
		
	}

	class Sparrow extends Birds1{
		void hanging(){
			System.out.println(" i am hang on tree branch");
		}
	}
	class SingingSparrow extends Sparrow{
		
		void WhatCanISinging() {
			
			System.out.println("i can sing an opera");
			
		}
	}

	public class Test1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SingingSparrow s=new SingingSparrow();
			s.flying();
			s.hanging();
			s.WhatCanISinging();
			Sparrow sp=new Sparrow();
			sp.flying();
			sp.hanging();
		
			
			
		}

	


	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


