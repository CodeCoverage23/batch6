package com.Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList al=new ArrayList();
        al.add("Avinash");
        al.add(1254);
        al.add(15.04);
        al.add("khadse");
        al.add(1,"Vinay");
        al.add(22);
        al.add(0.02);
        al.remove(2);
        System.out.println(al);
        //System.out.println(al.get(4));
        System.out.println(al.size());
	}

}
