package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
	LinkedList<Pen> l = new LinkedList<Pen>();
	Pen p1 = new Pen(25000,  "Cello");
	Pen p2 = new Pen(35000,  "max");
	Pen p3 = new Pen(45000,  "eloo");
	Pen p4 = new Pen(55000,  "uxin");
	
	l.add(p1);
	
	

static void displayPenDetails(LinkedList<Pen> l) {
	Iterator<Pen> it = l.iterator();
	while(it.hasNext()) {
		Pen lp = it.next();
		System.out.println("Brand is "+lp.price);
		System.out.println("Price is "+lp.brand);
		
	}
	
}


}
