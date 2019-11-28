package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("Main strated");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(20000);
			System.out.println("Without your cash");
		} catch (InvalidAmountException e) {
		
			System.err.println(e.getMessage());
		}
		System.out.println("Main ended");
	}

}
