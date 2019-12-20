package com.ustglobal.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stock.dao.StockDAO;
import com.ustglobal.stock.dto.Product;
@Service
public class StockServiceImpl implements StockService{
	@Autowired
	private StockDAO dao;
	@Override
	public boolean addProduct(Product bean) {
		
		return dao.addProduct(bean);
	}

	@Override
	public boolean updateProduct(Product bean) {
		
		return dao.updateProduct(bean);
	}

	@Override
	public List<Product> searchProductByName(String name) {
		
		return dao.searchProductByName(name);
	}

	@Override
	public List<Product> searchProductByCategory(String category) {
		
		return dao.searchProductByCategory(category);
	}

	@Override
	public List<Product> searchProductByCompany(String company) {
		
		return dao.searchProductByCompany(company);
	}

}
