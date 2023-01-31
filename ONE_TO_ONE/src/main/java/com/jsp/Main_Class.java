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
		
		Person p1=new Person();
		p1.setAge(28);
		p1.setName("ABC");
		p1.setPhno(987456321l);
		p1.setAddress("Bangalore");
		
		Person p2=new Person();
		p2.setAge(26);
		p2.setName("XYZ");
		p2.setPhno(989456321l);
		p2.setAddress("NDLS");
		
		Person p3=new Person();
		p3.setAge(24);
		p3.setName("JKL");
		p3.setPhno(887456321l);
		p3.setAddress("Bihar");
		
		
		Passport passport1=new Passport();
		passport1.setP_no("abc123");
		passport1.setPerson(p2);
		
		Passport passport2=new Passport();
		passport2.setP_no("abc456");
		passport2.setPerson(p3);
		
		Passport passport3=new Passport();
		passport3.setP_no("abc789");
		passport3.setPerson(p1);
		
		
		p1.setPassport(passport3);
		p2.setPassport(passport2);
		p3.setPassport(passport1);
		
		
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.persist(passport1);
		entityManager.persist(passport2);
		entityManager.persist(passport3);
		entityTransaction.commit();
		
		
		
		
	}
}
