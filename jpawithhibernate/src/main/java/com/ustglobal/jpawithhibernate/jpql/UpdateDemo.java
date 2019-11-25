package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	    entityManager = entityManagerFactory.createEntityManager();
	    transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "update Product set pname='watch' where pid=102";
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		System.out.println(result);
		transaction.commit();
		}catch(Exception e) {
		  e.printStackTrace();
		  transaction.rollback();
		}
		entityManager.close();
	}

}
