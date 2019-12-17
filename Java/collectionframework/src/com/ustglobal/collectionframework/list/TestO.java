package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestO {
	public static void main(String[] args) {


		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		//		l.add(null);
		//		we should pass only generic type


		System.out.println("Before sorting" +l);
		Collections.sort(l);
		System.out.println("After sort"+l);

		Collections.reverse(l);
		System.out.println("After reverse "+l);

		Collections.shuffle(l);
		System.out.println("After shuffle"+l);

	}

}
