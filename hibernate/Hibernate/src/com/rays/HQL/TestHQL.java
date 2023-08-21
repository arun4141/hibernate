package com.rays.HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.dto.UserDTO;

public class TestHQL {

	public static void main(String[] args) {

		/*SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Query q = session.createQuery("from HQL");

		List list = q.list();

		Iterator item = list.iterator();

		while (item.hasNext()) {
			HQL dto = (HQL) item.next();

			System.out.println(dto.getId());
			System.out.println(dto.getFristname());
			System.out.println(dto.getLastname());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());*/
			
			
			
			
		//Aggregate Functions
			

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

	//	Query q = session.createQuery("select id,Fristname from HQL p");
		Query q = session.createQuery("select p.id,count(*) from  HQL p group by p.id");

		List list = q.list();

		Iterator item = list.iterator();

		while (item.hasNext()) {
			Object[] dto = (Object[]) item.next();
			
			System.out.println(dto[]);
			System.out.println(dto.getFristname());
			
			System.out.println(dto.getLastname());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
           
			
			

		}

	}
}


