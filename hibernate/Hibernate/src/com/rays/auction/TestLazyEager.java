package com.rays.auction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestLazyEager {

	public static void main(String[] args) {
		
		
		
		// Auctionitem.hbm.xml me fetch="join" krna he  q=2 

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Auctionltem dto = (Auctionltem) session.get(Auctionltem.class, 1L);

		tx.commit();
		session.close();

	}

}
