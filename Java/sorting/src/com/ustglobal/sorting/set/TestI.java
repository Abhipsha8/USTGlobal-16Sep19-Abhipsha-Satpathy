package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		
		//SortByName sb1 = new SortByName();
       // SortByPincode sb2 = new SortByPincode();
		SortByMICR sb3 = new SortByMICR();
		TreeSet<Bank> ts = new TreeSet<Bank>(sb3);
		
		Bank b1 = new Bank("HDFC",6779900,6799);
		Bank b2 = new Bank("SBI",6789900,67990);
		Bank b3 = new Bank("KANARA",6789922,67900);
		Bank b4 = new Bank("ssddf",56778,67878);
		
		
		
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("************Using iterator***********");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("=============================");
		}
		
		
	}

}
