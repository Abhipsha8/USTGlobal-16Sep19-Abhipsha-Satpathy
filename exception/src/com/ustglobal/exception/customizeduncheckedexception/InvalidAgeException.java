package com.ustglobal.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	String message = "Invalid age below 18 yrs nott allowed";
	
	public InvalidAgeException() {
	}
	
	
	public InvalidAgeException(String message) {
		this.message = message;
	}


	@Override
	public String getMessage() {
		return message;
	}
	

}
