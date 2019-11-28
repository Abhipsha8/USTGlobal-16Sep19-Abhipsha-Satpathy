package com.ustglobal.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(5);
		al.add(60);
		al.add(70);


		List<Integer> l =
				al.stream().map(i-> i+50).collect(Collectors.toList());

		for(Integer i : l) {
			System.out.println(i);
		}
	}
	


}
