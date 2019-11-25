package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytoone.Pencil;
import com.ustglobal.jpawithhibernate.manytoone.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {
		
		PencilBox peBox = new PencilBox();
		peBox.setBid(1);
		peBox.setBname("Apsara");
		
		Pencil pencil = new Pencil();
		pencil.setPid(13);
		pencil.setColor("black");
		pencil.setPencilBox(peBox);
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(14);
		pencil1.setColor("red");
		pencil1.setPencilBox(peBox);
		
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			 entityManager = entityManagerFactory.createEntityManager();
		     entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			System.out.println("Record Saved");
			entityTransaction.commit();
			}catch(Exception e){
				e.printStackTrace();
				entityTransaction.rollback();
				
			}
		entityManager.close();
	}//end of main()

}//end of class
