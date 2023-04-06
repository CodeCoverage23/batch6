package com.java;

public class For_NamePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a = 1; a <= 100; a++)
			if (a % (5 * 7) == 0) {
				System.out.println(a + "  GANESH PAWAR");
			} else if (a % 5 == 0) {
				System.out.println(a + "  GANESH");
			} else if (a % 7 == 0) {
				System.out.println(a + "  PAWAR");
			} else if (a % (5 * 7) == 0) {
				System.out.println(a + "  GANESH PAWAR");
			} else {
				System.out.println(a + "  *");
			}
	}

}
