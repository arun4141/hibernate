package com.rays.oneone;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.ReadWriteCache.Item;
import org.hibernate.cfg.Configuration;

import com.rays.auction.Auctionltem;
import com.rays.auction.Bid;

public class TestDirtyCheck {

	public static void main(String[] args) {

		/* transtive */
		/*
		 * Bid bid1 = new Bid(); bid1.setId(4); bid1.setAmount(4000);
		 * bid1.setTimestamp("xyz");
		 * 
		 * SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 * 
		 * Session session = sf.openSession();
		 * 
		 * Transaction tx = session.beginTransaction();
		 * 
		 * Auctionltem dto = (Auctionltem) session.get(Auctionltem.class, 1L);
		 * 
		 * Set s= dto.getBids(); 
		 * s.add(bid1);
		 */

		
		
		
		/*
		 * dirty chek 
		 * SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 * 
		 * Session session = sf.openSession();
		 * 
		 * Transaction tx = session.beginTransaction();
		 * 
		 * Auctionltem dto = (Auctionltem) session.get(Auctionltem.class, 1L);
		 * 
		 * dto.setDescription("asdfgh"); 
		 * tx.commit(); 
		 * session.close();
		 */


		
		
		
		/* Detachment */
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Auctionltem dto = (Auctionltem) session.get(Auctionltem.class, 1L);

		session.close();

		Session session2 = sf.openSession();
		Transaction txn = session2.beginTransaction();
		session2.update(dto);

		txn.commit();
		session2.close();

	}

}
