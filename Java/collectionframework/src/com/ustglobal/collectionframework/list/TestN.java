package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestN {
	public static void main(String[] args) {
		ArrayList <Double> a1 = new ArrayList<Double>();
		a1.add(34.5);
		a1.add(34.8);
		a1.add(54.9);
		a1.add(70.8);
		a1.add(34.5);

		System.out.println(a1);
		a1.add(2,54.6);
		System.out.println("After add in 2nd index"+a1);
		a1.remove(0);
		System.out.println("After removing 0th index"+a1);
		a1.remove(null);
		System.out.println("After removing null"+a1);
		Double val = a1.get(4);
		System.out.println("Object at 4th index"+a1);
		a1.set(2, 77.8);
		System.out.println("After replacing 2nd index"+a1);
		a1.clear();
		System.out.println("After clear method"+a1);
		a1.contains(54.6);

		List<Double>al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(13.3);
		al1.add(14.3);

		al1.addAll(al1);
		System.out.println("After add all"+al1);

		boolean contain = a1.containsAll(al1);
		System.out.println("Contains all of al1"+contain);

		System.out.println("Before removal");
		boolean res = a1.removeAll(al1);
		System.out.println("Removed all of al1"+res);
		System.out.println("After removal of al1"+a1);












	}

}
