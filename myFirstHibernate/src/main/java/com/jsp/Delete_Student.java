package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_Student {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student s=entityManager.find(Student.class,1);
		
		if(s != null)
		{
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Given Id Already deleted Or Not Present");
		}
		
		
	}

}
