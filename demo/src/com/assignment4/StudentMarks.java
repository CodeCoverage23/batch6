package com.assignment4;

public class StudentMarks {

	public static void main(String[] args) {
		int DF = 65;
		int PE = 78;
		int OOAD = 80;
		int MMC = 93;
		int VR = 86;
		
		
		int Total = DF+PE+OOAD+MMC+VR;
		int Avg = (Total/5);
		
		System.out.println("total Marks :" + Total);
		System.out.println("Avg :" + Avg);

	}

}
