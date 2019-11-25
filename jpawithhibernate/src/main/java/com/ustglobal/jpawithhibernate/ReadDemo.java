package com.ustglobal.jpawithhibernate;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product ProductDetail = entityManager.find(Product.class,101);//find() is used to retrieve the data
	    System.out.println("ID----"+ProductDetail.getPid());
	    System.out.println("NAME----"+ProductDetail.getPname());
	    System.out.println("Quantity----"+ProductDetail.getQuantity());
	    entityManager.close();
	
	
	
	
	}//end of the main()
}//end of the class
