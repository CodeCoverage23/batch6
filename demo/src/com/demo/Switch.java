package com.demo;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String  str = "Owls";
   
   switch (str) {
   case  "Parrots":
	   System.out.println("Parrots is fly");
	   break;
   case "Owls":
	   System.out.println("sit on tree");
	   break;
   case "lovebirds":
	   System.out.println("both are cute");
	   break;
   case "sparrow":
	   System.out.println("this is white");
	   break;
	   default:
		   System.out.println("no birds");
   }
	}

}
