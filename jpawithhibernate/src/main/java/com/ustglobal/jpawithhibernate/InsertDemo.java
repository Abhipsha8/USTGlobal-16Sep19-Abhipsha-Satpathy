package com.ustglobal.jpawithhibernate;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;



public class InsertDemo {
	
	public static void main(String[] args) {
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		Product product = new Product();
		product.setPid(104);
		product.setPname("mobile");
		product.setQuantity(20);
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		 entityManager = entityManagerFactory.createEntityManager();
	     entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("Record Saved");
		entityTransaction.commit();
		}catch(Exception e){
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
		
	}//end of the main()

}//end of the class
