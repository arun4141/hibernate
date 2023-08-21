package com.rays.oneone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testoneone {

	public static void main(String[] args) {
		
		Address address = new Address();
	address.setId(1);
	address.setCity("indore");
	address.setState("mp");
	
	Employee emp = new Employee();
	emp.setId(1);
	emp.setFirstName("arun");
	emp.setLastName("mandloi");
	emp.setEmpAddress(address);
	
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();

	Session session = sf.openSession();

	Transaction tx = session.beginTransaction();

	session.save(emp);

	tx.commit();
	session.close();

	}

}
