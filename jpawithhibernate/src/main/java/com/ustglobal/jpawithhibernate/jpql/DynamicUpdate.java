package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {
	public static void main(String[] args) {
	
			EntityTransaction transaction = null;
			EntityManager entityManager = null;
			try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		    entityManager = entityManagerFactory.createEntityManager();
		    transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "update Product set pname=:name where pid=:id";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("name", "Dress");
			query.setParameter("id", 104);
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


