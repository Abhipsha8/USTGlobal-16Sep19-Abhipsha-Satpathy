package com.ustglobal.exception.first;

public class TestF {
	public static void main(String[] args) {
		System.out.println("main started");
		int[] a = {10,20,30};
		int b = 10;
		String s = "hello";

		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}
		catch(NullPointerException npe) {
			System.out.println("Donot play with null");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index is not present");
		}
		catch(ArithmeticException ai) {
			System.out.println("number is divided by zero");
		}
		System.out.println("main ended");

	}



}
