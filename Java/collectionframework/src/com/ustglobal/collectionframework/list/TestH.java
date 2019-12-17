package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		v1.add(12);
		v1.add(12.90);
		v1.add("more");
		v1.add(true);
		v1.add(null);
		System.out.println("===========Using for Loop================");
		for(int i = 0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}		
		System.out.println("===========Using Iterator================");
		Iterator it = v1.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println("================Using list iterator============");
		ListIterator lt = v1.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		System.out.println("==================List Iterator backward===============");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
		
	}

}
