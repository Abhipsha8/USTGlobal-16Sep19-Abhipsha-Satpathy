package com.ustglobal.car;


public class TestA {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		c.start();
		c.stop();
		System.out.println("==========================");
		c.m.play();//Has-a relation
		System.out.println(c.m.sname);

	}

}
