package com.ustglobal.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



public class TestE {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(70);
		al.add(60);
		al.add(40);
		al.add(35);
		al.add(90);
		al.add(80);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
	}

}
