package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Student {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student s1=new Student();
		s1.setAge(20);
		s1.setName("Ankit");
		s1.setAddress("Bangalore");
		
		Student s2=new Student();
		s2.setAddress("New Delhi");
		s2.setAge(22);
		s2.setName("Murga");
		
		Student s3=new Student();
		s3.setAge(25);
		s3.setName("Chitvan");
		s3.setAddress("Uk");
		
		Student s4=new Student();
		s4.setAddress("Jk");
		s4.setAge(23);
		s4.setName("Kis");
		
		entityTransaction.begin();
		entityManager.persist(s3);
		entityManager.persist(s4);
		entityTransaction.commit();
		
	}

}
