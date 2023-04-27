package com.demo;
class  Account{
	private long  acc_no;
	private String name;
	private String EmailId;
	private double amount;
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






public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a=new Account();
		a.setAcc_no(456841292);
		a.setName("akshay");
		a.setEmailId("akshay2@gmail.com");
		a.setAmount(50000.00);
		System.out.println(a);
	}

}
