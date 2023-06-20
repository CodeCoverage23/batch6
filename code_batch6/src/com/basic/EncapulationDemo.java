package com.basic;

public class EncapulationDemo {
	private long  acc_no;
	private String name;
	private String EmailId;
	private double amount;
	private String mobileno;
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", name=" + name + ", EmailId=" + EmailId + ", amount=" + amount + "]";
	}

	
	
	
	
	
	
}
       
