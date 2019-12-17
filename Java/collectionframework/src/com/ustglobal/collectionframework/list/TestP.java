package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestP {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("abhipsha");
		al.add("abhya");
		al.add("anushree");
		al.add("anurag");

		System.out.println("Before sort---->"+al);
		Collections.sort(al);
		System.out.println("After sort------>"+al);


	}

}
