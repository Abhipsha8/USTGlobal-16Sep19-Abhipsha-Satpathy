package com.ustglobal.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp2.dto.Employee;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee EmployeeDetail = entityManager.find(Employee.class,1);//find() is used to retrieve the data
	    System.out.println("EID----"+EmployeeDetail.getEid());
	    System.out.println("ENAME----"+EmployeeDetail.getEname());
	    System.out.println("SALARY----"+EmployeeDetail.getSalary());
	    entityManager.close();
	
	
	
	
	}//end of the main()

}
