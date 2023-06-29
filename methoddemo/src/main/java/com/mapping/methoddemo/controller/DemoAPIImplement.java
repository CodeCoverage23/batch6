package com.mapping.methoddemo.controller;

import java.util.ArrayList;
import java.util.List;

public class DemoAPIImplement {
	List<Contry> clist = new ArrayList<>();

	public void saveContries(Contry c) {
		clist.add(c);
	}

	public List<Contry> getAllContry() {
		return clist;
	}

	public Contry getByName(String contryName) {
		for (Contry c :clist) {
			if (c.getcontryName().equals(contryName))
			return c;
		}
		return null;
	}
}
