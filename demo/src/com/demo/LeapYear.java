package com.demo;

import java.time.LocalDate;

public class LeapYear {
public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	System.out.println(now.isLeapYear());
	LocalDate of = LocalDate.of(2016, 12, 26);
	System.out.println(of.isLeapYear());
}
}
