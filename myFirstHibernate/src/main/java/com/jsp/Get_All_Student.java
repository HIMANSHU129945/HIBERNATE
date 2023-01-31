package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Get_All_Student {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ankit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		int count=0;
		
		Query query=entityManager.createQuery("select s from Student s");
		
		List<Student> list=query.getResultList();
		for(Student s:list)
		{
			
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getAddress());
			count++;
			System.out.println();
		}
		System.out.println("Total Record Is: "+count);
	}

}
