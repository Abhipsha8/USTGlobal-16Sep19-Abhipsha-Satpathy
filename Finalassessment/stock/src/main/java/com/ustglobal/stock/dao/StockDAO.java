package com.ustglobal.stock.dao;

import java.util.List;

import com.ustglobal.stock.dto.Product;

public interface StockDAO {
public boolean addProduct(Product bean);
public boolean updateProduct(Product bean);
public List<Product> searchProductByName(String  name);
public List<Product> searchProductByCategory(String category);
public List<Product> searchProductByCompany(String company);


}
