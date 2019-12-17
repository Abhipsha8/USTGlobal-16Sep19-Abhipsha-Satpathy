package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(60,"black"));
		al.add(new Marker(70,"red"));
		al.add(new Marker(80,"nevy blue"));
		
		System.out.println("Before sorting------>");
		display(al);
		SortByPrice sb = new SortByPrice();
		Collections.sort(al,sb);
	}
	static void display(ArrayList<Marker>a) {
		Iterator it = al.iterator();
	}

}
