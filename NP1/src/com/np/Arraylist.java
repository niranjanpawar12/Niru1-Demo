package com.np;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		List l= new ArrayList();
		l.add(1);
		l.add("niranjan");
		l.add(null);
		Iterator l1=l.iterator();
		while(l1.hasNext()) {
		System.out.println(l1.next());
		}
		
		// TODO Auto-generated method stub

	}

}
