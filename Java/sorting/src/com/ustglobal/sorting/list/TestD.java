package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.add(12);
		s.push(13);
		s.push(14);
		
		System.out.println("Using get()---------");
		for(int i = 0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		int j = s.size();
		System.out.println("Using pop()---------");
		for(int i = 0;i<j;i++) {
			System.out.println(s.pop());
		}
		
	}

}
