package com.ustglobal.beanobject;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("Abhipsha");
		s.setRollNo(123);

		Database db = new Database();
		db.reveive(s);

	}

}
