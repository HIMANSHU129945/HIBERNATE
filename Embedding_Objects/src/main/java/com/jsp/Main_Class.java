package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main_Class {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Student s1=new Student();
		s1.setAge(18);
		s1.setName("XYZ");
		
		
		Student s2=new Student();
		s2.setAge(24);
		s2.setName("JKL");
		
		Certificate c1=new Certificate();
		c1.setCerti_name("Java");
		c1.setCerti_no(101);
		c1.setDuration(2);
		
//		Certificate c2=new Certificate();
//		c2.setCerti_name("Hibernate");
//		c2.setCerti_no(102);
//		c2.setDuration(3);
		
		s1.setCerti(c1);
		s2.setCerti(c1);
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		
		entityTransaction.commit();
	}

}
