package com.ustglobal.demo;

public class Sup {
	public Number test() {
		return new Integer(10);
	}
	
}
class Sub extends Sup{
	
	@Override
	public Integer test() {
		return new Integer(10);
	}
		
	}
