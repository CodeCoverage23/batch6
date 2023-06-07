package com.oops;

class Account {
	private long accno;
	private String name;
	private String emailid;
	private double amount;

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", emailid=" + emailid + ", amount=" + amount + "]";
	}

}

public class Encapsulation {
	public static void main(String[] args) {
		Account a = new Account();
		a.setAccno(31389609);
		a.setAmount(500000);
		a.setEmailid("Avi@gmail.com");
		a.setName("Avinash");
		System.out.println(a);
	}

}
