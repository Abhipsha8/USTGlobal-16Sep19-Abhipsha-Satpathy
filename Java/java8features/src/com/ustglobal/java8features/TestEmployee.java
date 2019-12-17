package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestEmployee {
	public static void main(String[] args) {

		Predicate<Employee> p = e ->{
			if(e.salary >= 35) {
				return true;
			}else {
				return false;
			}
		};


		Employee e1 = new Employee(10, "anup", 50000);
		boolean res = p.test(e1);
		System.out.println(res);

	}
}


