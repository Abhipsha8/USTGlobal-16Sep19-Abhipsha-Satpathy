package com.ustglobal.stock.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stock.dto.Product;
@Repository
public class StockDaoImpl implements StockDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addProduct(Product bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateProduct(Product bean) {

		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Product product=manager.find(Product.class,bean.getId());
		product.setName(bean.getName());
		product.setPrice(bean.getPrice());
		product.setQuantity(bean.getQuantity());
		product.setCategory(bean.getCategory());
		product.setCompany(bean.getCompany());

		transaction.commit();
		return true;
	}

	@Override
	public List<Product> searchProductByName(String name) {
		EntityManager manager=factory.createEntityManager();

		try {
			String jpql="from product where name=:name";
			TypedQuery<Product> typedQuery=manager.createQuery(jpql,Product.class);
			typedQuery.setParameter("name",name);
			Product product=typedQuery.getSingleResult();
			return (List<Product>) product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> searchProductByCategory(String category) {

		EntityManager manager=factory.createEntityManager();

		try {
			String jpql="from product where category=:category";
			TypedQuery<Product> typedQuery=manager.createQuery(jpql,Product.class);
			typedQuery.setParameter("category",category);
			Product product=typedQuery.getSingleResult();
			return (List<Product>) product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> searchProductByCompany(String company) {
		EntityManager manager=factory.createEntityManager();
		try {
			String jpql="from product where company=:company";
			TypedQuery<Product> typedQuery=manager.createQuery(jpql,Product.class);
			typedQuery.setParameter("company",company);
			Product product=typedQuery.getSingleResult();
			return (List<Product>) product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	

}
