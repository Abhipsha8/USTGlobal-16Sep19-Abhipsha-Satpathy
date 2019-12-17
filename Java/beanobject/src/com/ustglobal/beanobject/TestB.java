package com.ustglobal.beanobject;

public class TestB {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setEid(12);
		e1.setName("Abhipsha");
		e1.setSalary(800000);
		e1.setDid(101);
		e1.setDesignation("Senior S/w Engineer");
		
		Db db = new Db();
		db.rec(e1);

	}

}
