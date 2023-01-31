package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_Student {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student s=entityManager.find(Student.class, 2);
		
		if( s != null)
		{
			s.setAge(10);
			s.setAddress("New Address");
			s.setName("XYZ");
			
			
			entityTransaction.begin();
			entityManager.merge(s);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Given Id Not Present");
		}
	}
}
