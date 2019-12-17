package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(14);
		ts.add(13);
//		ts.add(null);Null is not allowed.only allowed generic type.
//		ts.add("Deepika");
		
		System.out.println("*************Using for each*************");
		for(Object s : ts) {
			System.out.println(s);
		}
		System.out.println("*************Using iterator**************");
		Iterator<Double> it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}

	}

}
