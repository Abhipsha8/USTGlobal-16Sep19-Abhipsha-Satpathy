package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.VoterCard;
import com.ustglobal.jpawithhibernateapp.dto.Product;

public class TestOneToOne {
	public static void main(String[] args) {
		
	VoterCard vc = new VoterCard();
	vc.setVid(10);
	vc.setVname("Abhya");
	Person p = new Person();
	p.setPid(1);
	p.setPname("Abhya");
	p.setVoterCard(vc);
	
	
	EntityTransaction entityTransaction = null;
	EntityManager entityManager = null;
	
	
	try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	 entityManager = entityManagerFactory.createEntityManager();
     entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	VoterCard vCard = entityManager.find(VoterCard.class,10);
	System.out.println(vCard.getPerson().getPid());
	//entityManager.persist(p);
	System.out.println("Record Saved");
	entityTransaction.commit();
	}catch(Exception e){
		e.printStackTrace();
		entityTransaction.rollback();
		
	}
	entityManager.close();
	
}//end of the main()


}
