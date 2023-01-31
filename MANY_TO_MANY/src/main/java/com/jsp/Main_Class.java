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
		
		Employee e1=new Employee();
		e1.setName("A");
		e1.setSal(1000);
		
		Employee e2=new Employee();
		e2.setName("B");
		e2.setSal(2000);
		
		Employee e3=new Employee();
		e3.setName("C");
		e3.setSal(3000);
		
		Employee e4=new Employee();
		e4.setName("D");
		e4.setSal(4000);
		
		
		Duty_Shift d1=new Duty_Shift();
		d1.setShift("Day");
		
		Duty_Shift d2=new Duty_Shift();
		d2.setShift("Night");
		
		
		List<Employee> e_l1=new ArrayList<Employee>();
		e_l1.add(e1);
		e_l1.add(e4);
		
		List<Employee> e_l2=new ArrayList<Employee>();
		e_l2.add(e2);
		e_l2.add(e3);
		
		
		List<Duty_Shift> d_l1=new ArrayList<Duty_Shift>();
		d_l1.add(d1);
		
		List<Duty_Shift> d_l2=new ArrayList<Duty_Shift>();
		d_l2.add(d2);
		
		
		e1.setDuty(d_l1);
		e2.setDuty(d_l2);
		e3.setDuty(d_l1);
		e4.setDuty(d_l2);
		
		d1.setEmp(e_l2);
		d2.setEmp(e_l1);
		
		entityTransaction.begin();
		entityManager.persist(e1);
		entityManager.persist(e2);
		entityManager.persist(e3);
		entityManager.persist(e4);
		entityManager.persist(d1);
		entityManager.persist(d2);
		entityTransaction.commit();
		
	}

}
