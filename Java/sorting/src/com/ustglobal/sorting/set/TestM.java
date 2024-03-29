package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestM {
	public static void main(String[] args) {
		
		 Comparator<Employee1> comp = (e1,e2)->{
			 Integer i = e1.id;
			 Integer j = e2.id;
			 return i.compareTo(j);
			 
		 };
		
		
		  TreeSet<Employee1> ts = new TreeSet<Employee1>(comp);
			
			Employee1  e1 = new Employee1(4, "abhi",5.6);
			Employee1  e2 = new Employee1(6, "abhaya",5.7);
			Employee1  e3 = new Employee1(7, "kari",5.5);
			Employee1  e4 = new Employee1(8, "deepa",5.3);
			
			ts.add(e1);
			ts.add(e2);
			ts.add(e3);
			ts.add(e4);
			
			System.out.println("*****************Using Iterator************");
			Iterator<Employee1> it = ts.iterator();
			while(it.hasNext()) {
				Employee1 e = it.next();
				System.out.println("Name is "+e.name);
				System.out.println("Id is "+e.id);
				System.out.println("Height is "+e.height);
				System.out.println("=======================");
			}
					
		}
	}


