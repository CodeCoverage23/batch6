package com.demo.java8;

@FunctionalInterface
interface Vehicle{
	public void vehicleColor();
}



public class DemoMethodreff {

	public static void main(String[] args) {
		// method reffernece using obj===>
       System.out.println("method reffernece using obj");
		Bike obj = new Bike();
		Vehicle v=obj::bikeName;
		v.vehicleColor();
		System.out.println();
		//method refference using static==>
	        System.out.println("method refference using static");
			Vehicle v1=Bike::color;
			v1.vehicleColor();
			System.out.println();
			
		
		
	}

}
