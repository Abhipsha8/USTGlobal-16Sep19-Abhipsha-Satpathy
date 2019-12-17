package com.ustglobal.sorting.set;


import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
public static void main(String[] args) {
		
		
		TreeSet<Employee> hs = new TreeSet<Employee>();
		Employee e1 = new Employee(12,"sweety",5600);
		Employee e2 = new Employee(13,"titu",5700);
		Employee e3 = new Employee(14,"missy",5800);
		Employee e4 = new Employee(15,"kitu",5900);
//		Employee e5 = new Employee(15,"kitu",5900);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
//		hs.add(e5);
		
		
		System.out.println("************Using iterator***********");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.eid);
			System.out.println("Name is "+e.ename);
			System.out.println("Salary is "+e.salary);
			System.out.println("=============================");
		}
		
	}


}
