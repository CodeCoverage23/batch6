package com.mapping.methoddemo.controller;

public class Contry {
	private int id;
	private String contryName;
	private String capital;

	public Contry(int id, String contryName, String capital) {
		super();
		this.id = id;
		this.contryName = contryName;
		this.capital = capital;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcontryName() {
		return contryName;
	}

	public void setcontryName(String contryName) {
		this.contryName = contryName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Contry [id=" + id + ", contryName=" + contryName + ", capital=" + capital + "]";
	}

}
