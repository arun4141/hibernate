package com.rays.dtotest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.dto.UserDTO;

public class Testupdate {

	public static void main(String[] args) {
		
	UserDTO dto = new UserDTO() ;
		
		dto.setId(1);
		
		
		dto.setFristname("shivani");
		dto.setLastname("mandloi");
		dto.setLogin("arun@gmail.com");
		dto.setPassword("Pass@1234");
		
		
SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session sess = sf.openSession();
		
		   Transaction tx=sess.beginTransaction();
		
		 sess.update(dto);
		 
		 tx.commit();
		 sess.close();
		
	}
		
	
		 

	

}
