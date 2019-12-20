package com.ustglobal.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stock.dto.Product;
import com.ustglobal.stock.dto.ProductResponce;
import com.ustglobal.stock.service.StockService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*",allowCredentials="true")
public class StockController {
@Autowired
private StockService service;

@PostMapping(path="/add",
consumes=MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public  ProductResponce addEmployee(@RequestBody Product bean) {
ProductResponce response=new ProductResponce();
if(service.addProduct(bean)) {
response.setStatuscode(201);
response.setMessage("success");
response.setDescription("Data added to the DB");
}else {
response.setStatuscode(401);
response.setMessage("Failure");
response.setDescription("Data not added to the DB");
}
return response;
}//end of addProduct

@PutMapping(path="/update", 
consumes = MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public ProductResponce modifyEmployee(@RequestBody Product bean) {
	ProductResponce response=new ProductResponce();
if(service.updateProduct(bean)) {
response.setStatuscode(201);
response.setMessage("success");
response.setDescription("Data modified in the DB");
}else {
response.setStatuscode(401);
response.setMessage("Failure");
response.setDescription("Data not modified in the DB");
}
return response;
}//end of updateProduct

@GetMapping(path="/search-by-name",
produces = MediaType.APPLICATION_JSON_VALUE)
public ProductResponce searchByName(@RequestParam("name") String name){
	ProductResponce response=new ProductResponce();
List<Product> beans=service.searchProductByName(name);
if(!beans.isEmpty()) {
response.setStatuscode(201);
response.setMessage("success");
response.setDescription("Data found in the DB");
response.setEmployeeBeans(beans);
}else {
response.setStatuscode(401);
response.setMessage("Failure");
response.setDescription("Data not found in the DB");
}
return response;
}//end of searchByName

@GetMapping(path="/search-by-category",
produces = MediaType.APPLICATION_JSON_VALUE)
public ProductResponce searchByCatagory(@RequestParam("category") String category){
	ProductResponce response=new ProductResponce();
List<Product> beans=service.searchProductByCategory(category);
if(!beans.isEmpty()) {
response.setStatuscode(201);
response.setMessage("success");
response.setDescription("Data found in the DB");
response.setEmployeeBeans(beans);
}else {
response.setStatuscode(401);
response.setMessage("Failure");
response.setDescription("Data not found in the DB");
}
return response;
}//end of searchByCatagory

@GetMapping(path="/search-by-company",
produces = MediaType.APPLICATION_JSON_VALUE)
public ProductResponce searchByCompany(@RequestParam("company") String company){
	ProductResponce response=new ProductResponce();
List<Product> beans=service.searchProductByCompany(company);
if(!beans.isEmpty()) {
response.setStatuscode(201);
response.setMessage("success");
response.setDescription("Data found in the DB");
response.setEmployeeBeans(beans);
}else {
response.setStatuscode(401);
response.setMessage("Failure");
response.setDescription("Data not found in the DB");
}
return response;
}//end of searchByCompany
}
