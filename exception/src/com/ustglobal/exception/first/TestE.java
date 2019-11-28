package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("main started");
		int[] a = {10,20,30};
		int b = 10;
		
		try {
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index is not present");
		}
		
		
		try {
			System.out.println(b/0);
		}
		catch(ArithmeticException ai) {
			System.out.println("number is divided by zero");
		}
		System.out.println("main ended");
		
	}

	

}
