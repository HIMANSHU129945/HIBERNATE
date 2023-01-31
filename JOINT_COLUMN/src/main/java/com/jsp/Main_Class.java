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
		
		
		Mobile m1=new Mobile();
		m1.setBrand("Realme");
		m1.setCost(10000);
		
		Mobile m2=new Mobile();
		m2.setBrand("Redmi");
		m2.setCost(15000);
		
		Mobile m3=new Mobile();
		m3.setBrand("OnePlus");
		m3.setCost(20000);
		
		Mobile m4=new Mobile();
		m4.setBrand("Samsung");
		m4.setCost(1500);
		
		List<Mobile> m_l1=new ArrayList<Mobile>();
		m_l1.add(m4);
		m_l1.add(m2);
		
		List<Mobile> m_l2=new ArrayList<Mobile>();
		m_l2.add(m1);
		m_l2.add(m3);
		
		Sim s1=new Sim();
		s1.setType("4G");
		
		Sim s2=new Sim();
		s2.setType("5G");
		
		List<Sim> s_l1=new ArrayList<Sim>();
		s_l1.add(s1);
		
		List<Sim> s_l2=new ArrayList<Sim>();
		s_l2.add(s2);
		
		
		m1.setSim(s_l2);
		m2.setSim(s_l2);
		m3.setSim(s_l1);
		m4.setSim(s_l1);
		
		
		s1.setMob(m_l1);
		s2.setMob(m_l2);
		
		
		entityTransaction.begin();
		entityManager.persist(m1);
		entityManager.persist(m2);
		entityManager.persist(m3);
		entityManager.persist(m4);
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityTransaction.commit();
	}
	
	
	
	
	
	
	

}
