package com.csv.carcsv;
//2 nd step data me jitni entry di h vo banalo
public class Car {
	private int year;
	private String make;
	private String module;
	private String price;
	
	//step 3 constructor generate krege
	public Car(int year, String make, String module, String price) {
		super();
		this.year = year;
		this.make = make;
		this.module = module;
		this.price = price;
	}
	//step 4 getter and setter generate krege
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	//step 5 lege to string taki data k form mil ske
	
	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", module=" + module + ", price=" + price + "]";
	}
	
	
	
	
}
