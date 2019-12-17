package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestStudent {
	public static void main(String[] args) {


		Predicate<Student> p = s ->{
			if(s.percentage >= 35) {
				return true;
			}else {
				return false;
			}
		};

		Student s1 = new Student(10, "anup", 50.8);
		boolean res = p.test(s1);
		System.out.println(res);
	}

}
