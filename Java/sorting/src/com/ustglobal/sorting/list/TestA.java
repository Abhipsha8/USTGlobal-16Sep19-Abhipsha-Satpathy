package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(12,"dimple",34.9);
		Student s2 = new Student(13,"Abhi",35.9);
		Student s3 = new Student(14,"abhip",64.9);
		Student s4 = new Student(15,"Kari",37.9);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("After sorting------");
		displayStudentDetails(al);
	    
		
		
	}
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("ID is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Pecentage is "+s.percentage);
			System.out.println("--------------------");
		}
	}

}
