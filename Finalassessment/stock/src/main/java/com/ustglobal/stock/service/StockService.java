package com.ustglobal.stock.service;

import java.util.List;

import com.ustglobal.stock.dto.Product;

public interface StockService {
		public boolean addProduct(Product bean);
		public boolean updateProduct(Product bean);
		public List<Product> searchProductByName(String  name);
		public List<Product> searchProductByCategory(String category);
		public List<Product> searchProductByCompany(String company);

}
