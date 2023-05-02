package com.oops;
class Account{
	private long acc_no;
	private String name;
	private String EmailId;
	private double amount;
	public long getAcc_no(){
		return acc_no;
		
	}
	public void setAcc_no(int acc_no) {
		
		this.acc_no=acc_no;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String Emailid) {
		EmailId=Emailid;
		
		
	}
	public double getamount() {
		return amount;
		
	} 
	public void setamount(double amount) {
		this .amount=amount;
		
	}
	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", name=" + name + ", EmailId=" + EmailId + ", amount=" + amount + "]";
	}
}


public class Encapsulation {


	public static void main(String[] args) {
		Account a=new Account();
		a.setAcc_no(05552);
		a.setname("manthan");
        a.setEmailId("manthanaage119@gmail.com");
        a.setamount(50000);
        System.out.println(a);
	}

}
