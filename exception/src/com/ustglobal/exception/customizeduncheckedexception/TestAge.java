package com.ustglobal.exception.customizeduncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Validator v = new Validator();
		try {
		v.verify(12);
		}
		catch(InvalidAgeException ie) {
			System.out.println("Exception occured");
		}
		v.verify(12);
		System.out.println("Main ended");
	}

}
