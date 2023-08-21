package com.rays.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HQLTestadd {

	public static void main(String[] args) {
		
		
           HQL dto = new HQL();
		
		dto.setId(2);
		
		dto.setFristname("sonu");
		dto.setLastname("gour");
		dto.setLogin("gour@gmail.com");
		dto.setPassword("Pass@1234567");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		   Transaction tx=session.beginTransaction();
		
		 session.save(dto);
		 
		 tx.commit();
		 session.close();
		
		

	}

}
