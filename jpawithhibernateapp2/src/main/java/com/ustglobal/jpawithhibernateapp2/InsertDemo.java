package com.ustglobal.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernateapp2.dto.Employee;

public class InsertDemo {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = null;
	EntityTransaction entityTransaction = null;
	EntityManager entityManager = null;
	
	Employee employee = new Employee();
	employee.setEid(2);
	employee.setEname("Sumiya");
	employee.setSalary(20000);
	try {
	 entityManagerFactory = Persistence.createEntityManagerFactory("test");
	 entityManager = entityManagerFactory.createEntityManager();
     entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(employee);
	System.out.println("Record Saved");
	entityTransaction.commit();
	}catch(Exception e){
		e.printStackTrace();
		entityTransaction.rollback();
		
	}
	entityManager.close();
		
	}//end of the main()


}
