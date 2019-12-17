package com.ustglobal.lambdaexpression;

public class TestGreet {
	public static void main(String[] args) {

		GreetInterface mes = (message)->"message";
		String product = mes.greet("hello");
		System.out.println(product);
	}

}



