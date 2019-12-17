package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestS {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(4,"viki",45.8));
		al.add(new Student(5,"riki",46.8));
		al.add(new Student(6,"gulu",47.8));
		al.add(new Student(7,"riya",48.8));
		al.add(new Student(8,"raju",29.8));

		Helper h = new Helper();
		h.displayAllStudent(al);
		h.displayFailedStudents(al);
		h.displayPassedStudents(al);
	}

}
