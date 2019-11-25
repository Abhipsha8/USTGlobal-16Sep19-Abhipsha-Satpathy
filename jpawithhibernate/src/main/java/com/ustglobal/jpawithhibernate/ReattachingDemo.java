package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReattachingDemo {
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class,103);
			
			
			product.setPname("speaker");
			entityManager.persist(product);
			System.out.println("Update Record");
			
			System.out.println(entityManager.contains(product));
            entityManager.detach(product);
            System.out.println(entityManager.contains(product));
            Product product1 = entityManager.merge(product);
            product1.setPname("speaker");
            

			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
