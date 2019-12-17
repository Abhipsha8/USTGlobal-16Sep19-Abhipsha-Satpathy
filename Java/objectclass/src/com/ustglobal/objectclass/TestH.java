package com.ustglobal.objectclass;

public class TestH {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person(01, "abhi");
		System.out.println("p1 id "+p1.id);
		System.out.println("p1 name "+p1.name);
		
		
		Object o = p1.clone();
		Person p2 = (Person) o;
		System.out.println("p2 id "+p2.id);
		System.out.println("p2 name "+p2.name);
		
		p2.id = 02;
		p2.name="ajaya";
		System.out.println("After cloning==============");
		System.out.println("p1 id "+p1.id);
		System.out.println("p1 name "+p1.name);
		System.out.println("p2 id "+p2.id);
		System.out.println("p2 name "+p2.name);
	}

}
