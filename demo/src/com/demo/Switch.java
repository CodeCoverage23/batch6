package com.demo;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int grade = 'C';
        switch (grade) {
        
        case 'A':
            System.out.println("A");
            break;
        case 'B':
            System.out.println("B");
            break;
        case 'C':
        	System.out.println("C");
        	break;
        case 'D':
        	System.out.println("D");
        	break;
        
        default :
        	System.out.println("not a valid mark");       
        }
    }
}

