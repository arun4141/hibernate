package com.rays.dtotest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.dto.UserDTO;

public class TestDelete {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setId(3);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session sess = sf.openSession();

		Transaction tx = sess.beginTransaction();

		sess.delete(dto);

		tx.commit();
		sess.close();

	}

}
