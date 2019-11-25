package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product ProductDetail = entityManager.getReference(Product.class,102);//It is used to get the data from db
//		Product ProductDetail = entityManager.find(Product.class,102);//find() is used to retrieve the data
	    System.out.println("ID----"+ProductDetail.getPid());
	    System.out.println("NAME----"+ProductDetail.getPname());
	    System.out.println("Quantity----"+ProductDetail.getQuantity());
	    entityManager.close();
	
	
	
	}

}
