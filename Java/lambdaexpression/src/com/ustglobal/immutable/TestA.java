package com.ustglobal.immutable;

public class TestA {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[0]="roopa";
		names[1]="roopaaa";
		names[2]="roopaaaaaa";

		Object[] obj = new Object[10];
		obj[0]=10;
		obj[0]="kiran";
		obj[0]=true;

		obj[0]=null;
		for(int i =0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}

}
