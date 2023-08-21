package com.rays.dtotest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.dto.UserDTO;

public class Testget {

	public static void main(String[] args) {

		/*
		 * SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 * 
		 * Session session = sf.openSession();
		 * 
		 * UserDTO dto = (UserDTO) session.get(UserDTO.class, 2);
		 * 
		 * System.out.println(dto.getId());
		 * 
		 * session.close();
		 */
	
		
		//get
		
		/*
		 * SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 * 
		 * Session session = sf.openSession();
		 * 
		 * Transaction tx = session.beginTransaction();
		 * 
		 * UserDTO dto = (UserDTO) session.get(UserDTO.class, 3);
		 * 
		 * 
		 * System.out.println(dto); tx.commit();
		 * 
		 * session.close();
		 */

	//	load
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		 Transaction tx = session.beginTransaction();
		 
		
		UserDTO dto = (UserDTO) session.load(UserDTO.class, 3);

		System.out.println(dto);
		tx.commit();

		session.close();
		
	}

}
