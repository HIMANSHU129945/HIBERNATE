package com.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main_Class {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Question q1=new Question();
		q1.setMarks(10);
		q1.setQuestion("What Is Java");
		
		Question q2=new Question();
		q2.setMarks(5);
		q2.setQuestion("What Is Hibernate");
		
		
		Answer a1=new Answer();
		a1.setAns("Java Is a Object Oriented Lanaguage");
		
		Answer a2=new Answer();
		a2.setAns("Hibernate Is Java Based FrameWork");
		
		Answer a3=new Answer();
		a3.setAns("Java Is Platform Dependent");
		
		Answer a4=new Answer();
		a4.setAns("Hibernate Is a LightWeight & Open Source");
		
		List<Answer> l1=new ArrayList<Answer>();
		l1.add(a1);
		l1.add(a3);
		
		List<Answer> l2=new ArrayList<Answer>();
		l2.add(a2);
		l2.add(a4);
		
		
		q1.setAnswer(l1);
		q2.setAnswer(l2);
		
		
		entityTransaction.begin();
		entityManager.persist(q1);
		entityManager.persist(q2);
		entityManager.persist(a1);
		entityManager.persist(a2);
		entityManager.persist(a3);
		entityManager.persist(a4);
		entityTransaction.commit();
				
	}

}
