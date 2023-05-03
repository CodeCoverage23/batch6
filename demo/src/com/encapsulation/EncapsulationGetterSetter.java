package com.encapsulation;
class Encap{
	private int number;
	private String name;
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class EncapsulationGetterSetter extends EncapsulationDemo  {
   public static void main(String[] args) {
	   Encap en = new Encap();
	   //isme apne ko EncapsulationDemo ki methods nahi milegi bcz vo private hai
	   //agr vo file me getter setter rahe to hi read or write kr sakte hai
	
	en.setName("rose");
	System.out.println(en.getName());
	
	en.setNumber(25);
	System.out.println(en.getNumber());
	// ye vala getter method ki help se  EncapsulationDemo se mangvaya.
	EncapsulationGetterSetter e = new EncapsulationGetterSetter();
	e.setNum(10);
	System.out.println(e.getNum());
	
	
}
}
