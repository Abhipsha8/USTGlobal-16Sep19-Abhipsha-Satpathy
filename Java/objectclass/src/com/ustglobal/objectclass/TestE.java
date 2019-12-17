package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c1 = new Car(10000000, "audi", "Black");
		System.out.println(c1);
		int i = c1.hashCode();
		System.out.println(i);
		
		Car c2 = new Car(20000000, "Benz", "Red");
		System.out.println(c2);
		int j = c2.hashCode();
		System.out.println(j);
		
		Car c3 = new Car(30000000, "BMW", "White");
		System.out.println(c3);
		int k = c3.hashCode();
		System.out.println(k);
	}

}
