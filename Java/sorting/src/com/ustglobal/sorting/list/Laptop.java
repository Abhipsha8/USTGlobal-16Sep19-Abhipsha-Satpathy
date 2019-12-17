package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
//	@Override
//	public int compareTo(Laptop l) {
//		if(this.price>l.price) {
//			return 1;
//		}else if(this.price<l.price) {
//			return -1;
//		}else {
//		
//		return 0;
//		}
//	}
//	
//	@Override
//	public int compareTo(Laptop l) {
////		int i = this.id;  We should not do like this.
////		int j = s.id;
//		
//		Integer i = this.id;
//		Integer j = s.id;
//		
//		return i.compareTo(j);
//		
//		
//	}
	@Override
	public int compareTo(Laptop l) {

		
		String p = this.name;
		String q = this.name;
		
		return p.compareTo(q);
		
		
	}
	
}
