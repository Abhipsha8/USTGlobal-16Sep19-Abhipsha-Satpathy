package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet();
		ls.add(12.3);
		ls.add(45.7);
		ls.add(88.0);
		ls.add(85.4);
		ls.add(83.2);
		
		System.out.println("*************Using for each*************");
		for(Object s : ls) {
			System.out.println(s);
		}
		System.out.println("*************Using iterator**************");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}

	}

}
