package com.ustglobal.stock.dto;

import java.util.List;

public class ProductResponce {
private int statuscode;
private String message;
private String description;
private List<Product> productBeans;

public List<Product> getEmployeeBeans() {
	return productBeans;
}
public void setEmployeeBeans(List<Product> productBeans) {
	this.productBeans = productBeans;
}
public int getStatuscode() {
	return statuscode;
}
public void setStatuscode(int statuscode) {
	this.statuscode = statuscode;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
