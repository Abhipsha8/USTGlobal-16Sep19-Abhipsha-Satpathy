package com.ustglobal.beanobject;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Scanner Class");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		System.out.println("Enter gender");
		String gender = sc.next();
		System.out.println("Gender is "+gender);
		System.out.println("Enter fullname");
		String fullName = sc.next();
		System.out.println("FullName is "+fullName);
		System.out.println("Are you male");
		boolean s = sc.nextBoolean();
		System.out.println(s);
	}
}
