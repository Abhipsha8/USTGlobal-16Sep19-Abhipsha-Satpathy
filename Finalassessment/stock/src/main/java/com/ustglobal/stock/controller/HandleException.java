package com.ustglobal.stock.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.stock.dto.ProductResponce;

@RestControllerAdvice
public class HandleException {
	
	@ExceptionHandler(Exception.class)
public @ResponseBody ProductResponce getException() {
		ProductResponce response=new ProductResponce();
	response.setStatuscode(501);
	response.setMessage("Error in code");
	response.setDescription("Got an Exception");
	return response;
	
}
}
