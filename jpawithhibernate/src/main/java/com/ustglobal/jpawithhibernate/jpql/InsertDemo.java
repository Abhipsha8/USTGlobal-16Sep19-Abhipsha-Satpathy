package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertDemo {
	public static void main(String[] args) {
		
		EntityTransaction transaction = null;
		EntityManager entityManager = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	    entityManager = entityManagerFactory.createEntityManager();
	    transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "insert into Product(pid,pname,quantity) values(:id,:name,:qua)";
		Query query = entityManager.createNativeQuery(jpql);
		query.setParameter("id", 104);
		query.setParameter("name", "Headphone");
		query.setParameter("qua", 30);
		int result = query.executeUpdate();
		System.out.println(result);
		System.out.println("Inserted");
		transaction.commit();
		}catch(Exception e) {
		  e.printStackTrace();
		  transaction.rollback();
		}finally {
		entityManager.close();
	}
	}
}
