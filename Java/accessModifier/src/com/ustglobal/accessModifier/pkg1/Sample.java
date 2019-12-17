package com.ustglobal.accessModifier.pkg1;

import com.ustglobal.accessModifier.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {


		Demo d = new Demo();
		//private
		/*
		 * System.out.println(d.a); d.add();
		 */
		/*
		 * default System.out.println(sa.b); sa.sub();
		 */
		Sample sa = new Sample();
		//protected
		System.out.println(sa.c);
		sa.mul();
		//public 
		System.out.println(sa.name);
		sa.div();
	}

}
